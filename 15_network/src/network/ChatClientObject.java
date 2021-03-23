package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClientObject extends JFrame implements ActionListener, Runnable {
   private JTextField input;
   private JButton send;
   private JTextArea output;
   
   private Socket socket;
   private ObjectInputStream ois;
   private ObjectOutputStream oos;
   
   public ChatClientObject() {
      output = new JTextArea();
      JScrollPane scroll = new JScrollPane(output);
      scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      output.setEditable(false);
      
      input = new JTextField();
      
      send = new JButton("������");
      output.setBackground(Color.CYAN);
      
      JPanel p = new JPanel();
      p.setLayout(new BorderLayout());
      p.add("Center", input);
      p.add("East", send);
      
      Container con = this.getContentPane();
      con.add("Center",scroll);
      con.add("South",p);
      
      setBounds(700,200,300,300);
      setVisible(true);
      //setDefaultCloseOperation(EXIT_ON_CLOSE);
      addWindowListener(new WindowAdapter() {
         @Override
			public void windowClosing(WindowEvent e) {
				if(ois==null || oos==null)System.exit(0);
				InfoDTO dto = new InfoDTO();
				int result = JOptionPane.showConfirmDialog(ChatClientObject.this,
						"������ �����Ͻðڽ��ϱ�", 
						"����", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
				
				if(result == JOptionPane.YES_OPTION)dto.setCommand(Info.EXIT);
				
				try {
					oos.writeObject(dto);
					oos.flush();
				} catch (IOException io) {
					io.printStackTrace();
				if(result == JOptionPane.NO_OPTION) setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
      });
   }//ChatClientObject()
   
   public void service() {      
      String serverIP = JOptionPane.showInputDialog(null,"����IP�� �Է��ϼ���","192.168.0.18");
      if(serverIP==null || serverIP.length()==0){
         System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�");
         System.exit(0);
      }
      
      //�г���
      String nickName = JOptionPane.showInputDialog(null,
                                       "�г����� �Է��ϼ���",
                                       "�г���",
                                       JOptionPane.INFORMATION_MESSAGE);
      if(nickName==null || nickName.length()==0){
         nickName="guest";
      }
      
      //���ϻ���
      try {
         socket = new Socket(serverIP, 9500);

         ois = new ObjectInputStream(socket.getInputStream());
         oos = new ObjectOutputStream(socket.getOutputStream());
         
      } catch (UnknownHostException e) {
         System.out.println("������ ã�� �� �����ϴ�");
         e.printStackTrace();
         System.exit(0);
         
      } catch (IOException e) {
         System.out.println("������ ã�� �� �����ϴ�");
         e.printStackTrace();
         System.exit(0);
      }
      
      try {
         //������ �г��� ������
         InfoDTO dto = new InfoDTO(); // ������ dto������ ���� dto ���� 
         dto.setCommand(Info.JOIN);
         dto.setNickName(nickName);
         oos.writeObject(dto);
         oos.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
      
      //������ ����
      Thread t = new Thread(this);
      //������ ���� - ������ ����(run())
      t.start();
      
      //�̺�Ʈ
      send.addActionListener(this);
      input.addActionListener(this); //JTextField���� ����
      
   }//service()
   
   @Override
   public void run() {
      //�����κ��� �޴� ��
	 //dto�� ������ �����°Ŷ� InfoDTO dto = new InfoDTO() ���� ������ �ʿ���� = null; �ϸ� �ȴ�
      InfoDTO dto = null;
      
      while(true) {// ä���ְ�ޱ����� ���ѷ��� ������
         try {
            dto = (InfoDTO)ois.readObject();
            
            if(dto.getCommand() == Info.EXIT) { // �����Ҷ� �޼��� ������ ���������� �Ѵ� �����ش�
               ois.close();
               oos.close();
               socket.close();

               System.exit(0);
               
            }else if(dto.getCommand() == Info.SEND) {//dto ���� �����ͼ� �޼��� ������
               output.append(dto.getMessage() + "\n");// �ٸ��� ��´�
            
               int pos = output.getText().length(); //�ٳ������� ��ũ�� �� ���󰡰� �ϴ� �޼ҵ�
               output.setCaretPosition(pos);
            }
            
         } catch (IOException e) {
            e.printStackTrace();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
      }//while
      
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      //������ ������ ��
      String msg = input.getText();
      
      InfoDTO dto = new InfoDTO();
      
      if(msg.toLowerCase().equals("quit")) { //object������ ���⼭ toLowerCase ���ش�
         dto.setCommand(Info.EXIT);			//if ������ �ΰ������ �� �����ش�
         
      }else {
         dto.setCommand(Info.SEND);
         dto.setMessage(msg);
      }
      
      try {
         oos.writeObject(dto);
         oos.flush();
      } catch (IOException e1) {
         e1.printStackTrace();
      }
      
      input.setText("");//�޽��� ������ ����α�
   }

   public static void main(String[] args) {
      new ChatClientObject().service();

   }

}
