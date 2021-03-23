package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame - BorderLayout(동서남북)
public class RGBTest2 extends Frame {
   private Button redBtn, greenBtn, blueBtn;
   private DrCanvas can;
   
   public RGBTest2() {
      redBtn = new Button("빨강");
      greenBtn = new Button("초록");
      blueBtn = new Button("파랑");
      can = new DrCanvas();
      
      Panel p = new Panel();//Panel - FlowLayout(순서배치-중앙)
      //p.setLayout(new GridLayout(1, 3)); //GridLayout(행열배치, 균등배열), new GridLayout(행, 열, 가로여백, 세로여백)
      p.setLayout(new GridLayout(1, 3, 5, 0));
      p.add(redBtn);
      p.add(greenBtn);
      p.add(blueBtn);
      
      add("North", p);
      add("Center", can);
      
      setBounds(700,200,300,400);
      setVisible(true);
      
      //이벤트
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      //이벤트
      redBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            can.setBackground(Color.RED);
         }
      });
      
      greenBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            can.setBackground(Color.GREEN);
         }
      });
      
      blueBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            can.setBackground(Color.BLUE);
         }
      });
   }

   //Canvas - null (Layout 이 없다)
   class DrCanvas extends Canvas {
      public DrCanvas() {
         this.setBackground(new Color(255,255,0));
      }
      
      @Override
      public void paint(Graphics g) {
         g.drawString("바보", 100, 100);
      }
   }//class Canvas
   
   public static void main(String[] args) {
      new RGBTest();
      
   }
}







