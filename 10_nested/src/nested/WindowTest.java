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
      
      //이벤트 
      this.addWindowListener(new WindowAdapter() { //택배회사, 추상메소드가 없는 추상 클래스
    	  @Override								   
    	  public void windowClosing(WindowEvent e) {
    		  System.exit(0);
    	  }
      });// 익명(흑기사)
      
      this.addMouseListener(new MouseAdapter() {// 5개의 추상메소드를 빈 body override
    	  @Override
    	public void mouseEntered(MouseEvent e) {
    		  System.out.println("마우스 IN");
    	}
    	  @Override
    	public void mouseExited(MouseEvent e) {
    		  System.out.println("마우스 OUT");
    	}
      }); //익명이
   }
   	
   public static void main(String[] args) {
      new WindowTest();

   }

}