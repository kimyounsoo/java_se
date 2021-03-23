package network;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	private JLabel idL, pwdL, repwdL, pnL, nameL;
	private JTextField idT,  pnT, nameT;
	private TextField pwT,repwdT;
	private JButton jungB, confirmB, cancelB;
	private JRadioButton male, female;
	
	public Login() {
		this.setLayout(null);
		//JLabel ����
		nameL = new JLabel("�̸�");
		idL = new JLabel("���̵�");
		pwdL = new JLabel("��й�ȣ");
		repwdL = new JLabel("��Ȯ��");
		pnL = new JLabel("�ڵ���");
		
		
		//JTextField ����
		nameT = new JTextField(10);
		idT = new JTextField(10);
		pwT = new TextField(10);
		repwdT = new TextField(10);
		pnT = new JTextField("010-",10);
		
		
		//JButton ����
		jungB = new JButton("�ߺ�üũ");
		confirmB = new JButton("ȸ������");
		cancelB = new JButton("���");
		//RadioButton ����
		male = new JRadioButton("����",true);
		female = new JRadioButton("����");
		
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
		nameL.setBounds(20,-5, 50, 50);nameT.setBounds(100,5,150,30);
		jungB.setBounds(270,60,100,30);
		idL.setBounds(20, 50, 70, 50);idT.setBounds(100,60,150,30);
		pwdL.setBounds(20,100,70,50);pwT.setBounds(100,110,150,30);
		repwdL.setBounds(20,150,70,50);repwdT.setBounds(100,160,150,30);
		
		male.setBounds(20,200,70,50);female.setBounds(100,210,150,30);
		confirmB.setBounds(130,300,100,30);
		cancelB.setBounds(250,300,100,30);
		pnL.setBounds(20,250,70,50);pnT.setBounds(100, 260, 150,30);
		
		add(nameL); add(nameT);
		this.add(idL);
		add(idT);add(pwdL);
		add(pwT);add(jungB);add(repwdL);
		add(repwdT);add(pnL);add(pnT);
		add(male);add(female);add(confirmB);
		add(cancelB);
		pwT.setEchoChar('��');
		repwdT.setEchoChar('��');
		 
		setResizable(false);
		setVisible(true);
		setBounds(400,200,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void event() {
		confirmB.addActionListener(this);
		cancelB.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == confirmB) {
			if(nameT.getText().equals(""))JOptionPane.showMessageDialog(this,"�̸��� �Է��ϼ���");
			if(idT.getText().equals(""))JOptionPane.showMessageDialog(this,"���̵� �Է��ϼ���");
			if(pwT.getText().equals(""))JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է��ϼ���");
			if(repwdT.getText().equals(""))JOptionPane.showMessageDialog(this,"��Ȯ�� ��й�ȣ�� �Է��ϼ���");
			if(pnT.getText().equals("010-"))JOptionPane.showMessageDialog(this,"��ȭ��ȣ�� �Է��ϼ���");
			
		}else if(e.getSource() == cancelB) {
			nameT.setText("");
			idT.setText("");
			pwT.setText(" ");pwT.setText("");
			repwdT.setText(" ");repwdT.setText("");
			pnT.setText("010-");
		}
	}
	
	
	public static void main(String[] args) {
		new Login();

	}

}
