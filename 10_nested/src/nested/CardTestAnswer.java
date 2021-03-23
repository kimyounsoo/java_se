package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//CardLayout
public class CardTestAnswer {
   private Frame frame; //Frame - BorderLayout
   private CardLayout card;
   
   public CardTestAnswer() {
      frame = new Frame();
      frame.setBounds(900,100,300,300);
      frame.setVisible(true);
      card = new CardLayout();
      
      frame.setLayout(card);
      
      //Panel 6Àå
      Panel[] p = new Panel[6];
      Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW};
      String[] title = {"»¡°­", "ÃÊ·Ï", "ÆÄ¶û", "º¸¶ó", "ÇÏ´Ã", "³ë¶û"};
      
      for(int i=0; i<p.length; i++) {
         p[i] = new Panel();
         p[i].setBackground(color[i]);
         
         frame.add(p[i], title[i]); // 
         
         //ÀÌº¥Æ®
         p[i].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               //card.show(frame, "ÇÏ´Ã");
              card.next(frame);
               
            }
         });
      }//for
      
//		p[0] = new Panel();
//		p[0].setBackground(Color.BLUE);
//		p[1] = new Panel();
//		p[1].setBackground(Color.RED);
//		p[2] = new Panel();
//		p[2].setBackground(Color.GREEN);
//		p[3] = new Panel();
//		p[3].setBackground(Color.CYAN);
//		p[4] = new Panel();
//		p[4].setBackground(Color.MAGENTA);
//		p[5] = new Panel();
//		p[5].setBackground(Color.YELLOW);
      

      
     //ÀÌº¥Æ®
      frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
         });

   }

   public static void main(String[] args) {
      new CardTestAnswer();

   }

}