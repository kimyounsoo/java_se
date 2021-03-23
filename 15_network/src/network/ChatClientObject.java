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
      
      send = new JButton("보내기");
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
						"정말로 종료하시겠습니까", 
						"종료", 
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
      String serverIP = JOptionPane.showInputDialog(null,"서버IP를 입력하세요","192.168.0.18");
      if(serverIP==null || serverIP.length()==0){
         System.out.println("서버IP가 입력되지 않았습니다");
         System.exit(0);
      }
      
      //닉네임
      String nickName = JOptionPane.showInputDialog(null,
                                       "닉네임을 입력하세요",
                                       "닉네임",
                                       JOptionPane.INFORMATION_MESSAGE);
      if(nickName==null || nickName.length()==0){
         nickName="guest";
      }
      
      //소켓생성
      try {
         socket = new Socket(serverIP, 9500);

         ois = new ObjectInputStream(socket.getInputStream());
         oos = new ObjectOutputStream(socket.getOutputStream());
         
      } catch (UnknownHostException e) {
         System.out.println("서버를 찾을 수 없습니다");
         e.printStackTrace();
         System.exit(0);
         
      } catch (IOException e) {
         System.out.println("서버를 찾을 수 없습니다");
         e.printStackTrace();
         System.exit(0);
      }
      
      try {
         //서버로 닉네임 보내기
         InfoDTO dto = new InfoDTO(); // 서버로 dto보내기 위해 dto 생성 
         dto.setCommand(Info.JOIN);
         dto.setNickName(nickName);
         oos.writeObject(dto);
         oos.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
      
      //스레드 생성
      Thread t = new Thread(this);
      //스레드 시작 - 스레드 실행(run())
      t.start();
      
      //이벤트
      send.addActionListener(this);
      input.addActionListener(this); //JTextField에서 엔터
      
   }//service()
   
   @Override
   public void run() {
      //서버로부터 받는 쪽
	 //dto를 통으로 가져온거라서 InfoDTO dto = new InfoDTO() 새로 생성할 필요없고 = null; 하면 된다
      InfoDTO dto = null;
      
      while(true) {// 채팅주고받기위해 무한루프 돌린다
         try {
            dto = (InfoDTO)ois.readObject();
            
            if(dto.getCommand() == Info.EXIT) { // 퇴장할때 메세지 보낼떄 이프문으로 둘다 따저준다
               ois.close();
               oos.close();
               socket.close();

               System.exit(0);
               
            }else if(dto.getCommand() == Info.SEND) {//dto 에서 꺼내와서 메세지 보낼떄
               output.append(dto.getMessage() + "\n");// 줄마다 찍는다
            
               int pos = output.getText().length(); //줄내려갈때 스크롤 도 따라가게 하는 메소드
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
      //서버로 보내는 쪽
      String msg = input.getText();
      
      InfoDTO dto = new InfoDTO();
      
      if(msg.toLowerCase().equals("quit")) { //object에서는 여기서 toLowerCase 해준다
         dto.setCommand(Info.EXIT);			//if 문으로 두가지경우 다 물어준다
         
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
      
      input.setText("");//메시지 보낸후 비워두기
   }

   public static void main(String[] args) {
      new ChatClientObject().service();

   }

}
