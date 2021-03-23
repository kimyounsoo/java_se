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

//Frame - BorderLayout(��������)
public class RGBTest2 extends Frame {
   private Button redBtn, greenBtn, blueBtn;
   private DrCanvas can;
   
   public RGBTest2() {
      redBtn = new Button("����");
      greenBtn = new Button("�ʷ�");
      blueBtn = new Button("�Ķ�");
      can = new DrCanvas();
      
      Panel p = new Panel();//Panel - FlowLayout(������ġ-�߾�)
      //p.setLayout(new GridLayout(1, 3)); //GridLayout(�࿭��ġ, �յ�迭), new GridLayout(��, ��, ���ο���, ���ο���)
      p.setLayout(new GridLayout(1, 3, 5, 0));
      p.add(redBtn);
      p.add(greenBtn);
      p.add(blueBtn);
      
      add("North", p);
      add("Center", can);
      
      setBounds(700,200,300,400);
      setVisible(true);
      
      //�̺�Ʈ
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      //�̺�Ʈ
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

   //Canvas - null (Layout �� ����)
   class DrCanvas extends Canvas {
      public DrCanvas() {
         this.setBackground(new Color(255,255,0));
      }
      
      @Override
      public void paint(Graphics g) {
         g.drawString("�ٺ�", 100, 100);
      }
   }//class Canvas
   
   public static void main(String[] args) {
      new RGBTest();
      
   }
}







