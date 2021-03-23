package io;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ScoreForm extends JFrame implements ActionListener {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField  hakT, nameT, korT, engT, mathT;
	private JButton inputB, printB, searchB, rankB, saveB, loadB;
	private DefaultTableModel model;
	private JTable table;
	private Score score;
	
	public ScoreForm() {
		//JLabel 생성 
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		
		//JTextField 생성
		hakT = new JTextField(20);
		nameT = new JTextField(20);
		korT = new JTextField(20);
		engT = new JTextField(20);
		mathT = new JTextField(20);
		
		//JButton 생성 
		inputB = new JButton("입력"); 
		printB = new JButton("출력"); 
		searchB = new JButton("학번검색"); 
		rankB = new JButton("순위"); 
		saveB = new JButton("파일저장"); 
		loadB = new JButton("파일읽기");
		
		Vector<String> vector = new Vector<String>();
		vector.add("학번");
		vector.add("이름");
		vector.add("국어");
		vector.add("영어");
		vector.add("수학");
		vector.add("총점");
		vector.add("평균");
		
		model = new DefaultTableModel(vector, 0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		score = new ScoreImpl();
		
		JPanel p1 = new JPanel();
		p1.add(hakL); p1.add(hakT);
		JPanel p2 = new JPanel();
		p2.add(nameL); p2.add(nameT);
		JPanel p3 = new JPanel();
		p3.add(korL); p3.add(korT);
		JPanel p4 = new JPanel();
		p4.add(engL); p4.add(engT);
		JPanel p5 = new JPanel();
		p5.add(mathL); p5.add(mathT);
		
		//왼쪽 JPanel
		JPanel inputP = new JPanel(new GridLayout(5,1));
		inputP.add(p1); 
		inputP.add(p2);
		inputP.add(p3); 
		inputP.add(p4);
		inputP.add(p5);
		
		//버튼 패널 생성
		JPanel buttonP = new JPanel(new GridLayout(1,6,5,1));
		buttonP.add(inputB);
		buttonP.add(printB);
		buttonP.add(searchB);
		buttonP.add(rankB);
		buttonP.add(saveB);
		buttonP.add(loadB);
		
		Container con = this.getContentPane();
		con.add("Center", scroll);
		con.add("West", inputP);
		con.add("South", buttonP);
		
		setBounds(900,100,600,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	//이벤트
	public void event() {
		inputB.addActionListener(this);
		printB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputB) {
			//데이터
			String hak = hakT.getText();
			String name = nameT.getText();
			int kor = Integer.parseInt(korT.getText().trim());
			int eng = Integer.parseInt(engT.getText().trim());
			int math = Integer.parseInt(mathT.getText().trim());
			
			//ScoreDTO 에 저장
			ScoreDTO dto = new ScoreDTO();
			dto.setHak(hak);
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			
			//총점, 평균 계산
			dto.calc();
			
			//데이터 보관(모으기)
			score.input(dto);
			
			JOptionPane.showMessageDialog(this, "등록 완료!!");
			
			//초기화
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
		
		}else if(e.getSource() == printB) {
			score.print(model); 
			
		}else if(e.getSource() == searchB) {
			 score.search(model);
			
		}else if(e.getSource() == rankB) {
			score.tot_desc(); //총점으로 내림차순
			score.print(model);
			
		}else if(e.getSource() == saveB) {
			score.save();
			
		}else if(e.getSource() == loadB) {
			score.load();
			score.print(model);
		}
		
	}
}











