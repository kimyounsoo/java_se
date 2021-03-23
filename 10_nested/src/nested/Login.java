package nested;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener {
   private Label idL, pwdL;
   private TextField idT, pwdT;
   private Button loginBtn, cancelBtn;
   private String id, pwd;
   
   public Login() {
      idL = new Label("���̵�");
      pwdL = new Label("��й�ȣ");
      
      idT = new TextField();
      pwdT = new TextField();
      
      loginBtn = new Button("�α���");
      cancelBtn = new Button("���");
      
      //idL.setLocation(50, 80);
      //idL.setSize(50, 30);
      idL.setBounds(50, 80, 50, 30);
      idT.setBounds(120, 80, 100, 30);
      
      pwdL.setBounds(50, 130, 50, 30);
      pwdT.setBounds(120, 130, 120, 30);
      
      loginBtn.setBounds(50, 200, 100, 30);
      cancelBtn.setBounds(160, 200, 100, 30);
      
      this.add(idL);
      add(idT);
      
      add(pwdL);
      add(pwdT);
      
      add(loginBtn);
      add(cancelBtn);
      
      setLayout(null); // set ���ش� Layout �������� ������ (null) �����ش�
      setBounds(800, 100, 300, 300);
      setVisible(true);
     
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      //�̺�Ʈ
      loginBtn.addActionListener(this);
      cancelBtn.addActionListener(this);
   }//Login()

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == loginBtn) {
         id = idT.getText();
         pwd = pwdT.getText();
         //System.out.println(id+", "+pwd);
         
//        new LoginResult(id, pwd); //?
         new LoginResult2(this);
//         new LoginResult3(id, pwd);
         
      }else if(e.getSource() == cancelBtn) {
         idT.setText(" "); idT.setText(""); //�ʱ�ȭ
         pwdT.setText(" "); pwdT.setText(""); //�ʱ�ȭ
      }
      
   }
   
   public String getId() {
      return id;
   }
   
   public String getPwd() {
      return pwd;
   }
   
   public static void main(String[] args) {
      new Login();
      
   }
}
