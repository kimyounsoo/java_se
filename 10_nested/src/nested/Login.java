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
      idL = new Label("아이디");
      pwdL = new Label("비밀번호");
      
      idT = new TextField();
      pwdT = new TextField();
      
      loginBtn = new Button("로그인");
      cancelBtn = new Button("취소");
      
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
      
      setLayout(null); // set 해준다 Layout 동서남북 방향을 (null) 없애준다
      setBounds(800, 100, 300, 300);
      setVisible(true);
     
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      //이벤트
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
         idT.setText(" "); idT.setText(""); //초기화
         pwdT.setText(" "); pwdT.setText(""); //초기화
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
