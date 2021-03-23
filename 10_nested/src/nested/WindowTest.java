package nested;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowTest extends Frame {
   
   public WindowTest() {
      setBounds(900, 100, 300, 400);
      setVisible(true);
      
      //�̺�Ʈ 
      this.addWindowListener(new WindowAdapter() { //�ù�ȸ��, �߻�޼ҵ尡 ���� �߻� Ŭ����
    	  @Override								   
    	  public void windowClosing(WindowEvent e) {
    		  System.exit(0);
    	  }
      });// �͸�(����)
      
      this.addMouseListener(new MouseAdapter() {// 5���� �߻�޼ҵ带 �� body override
    	  @Override
    	public void mouseEntered(MouseEvent e) {
    		  System.out.println("���콺 IN");
    	}
    	  @Override
    	public void mouseExited(MouseEvent e) {
    		  System.out.println("���콺 OUT");
    	}
      }); //�͸���
   }
   	
   public static void main(String[] args) {
      new WindowTest();

   }

}