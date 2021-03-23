package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton insertBtn, deleteBtn;
	
	public JTableEx2() {
		//데이터
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong","홍길동","111","010-123-1234"));
		list.add(new PersonDTO("hong","홍길동","111","010-123-1234"));
		list.add(new PersonDTO("hong","홍길동","111","010-123-1234"));
		list.add(new PersonDTO("conan","코난","333","010-777-7777"));
		
		//타이틀
		vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.add("비밀번호");
		vector.add("핸드폰");
		
		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int r, int c) {
				return (c!=0) ? true : false;
			}
		};
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		//테이블 - 데이터
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
		}//for
		
		//버튼 생성
		insertBtn = new JButton("추가");
		deleteBtn = new JButton("삭제");
		
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(insertBtn);
		p.add(deleteBtn);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);		
		c.add("South", p);
				
		setBounds(200,200,500,400); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트
		insertBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == insertBtn) {
			insert();
		}else if(e.getSource() == deleteBtn) {
			delete();
		}
		
	}
	
	private void delete() {
		String name = JOptionPane.showInputDialog(this, "이름를 입력하세요");
		if(name == null) return;
		
		int sw=0;
		for(int i=0; i<model.getRowCount(); i++) {
			if(name.equals(model.getValueAt(i, 1))) {
				model.removeRow(i);
				i--; // 배열 삭제시 한칸씩 밀리기때문에 원래 인덱스로 돌아오기 위해 해준다
				sw=1;
			}
		}//for
		
		if(sw==0) JOptionPane.showMessageDialog(this, "없는 이름 입니다..");
		
	}

	private void insert() {
		//리턴 값 : 사용자가 입력한 문자열, 취소 버튼이 선택되거나 창이 닫히면 null 리턴
		String id = JOptionPane.showInputDialog(this, "아이디를 입력하세요");
		if(id==null) return;
		
		if(id.length()==0) {
			JOptionPane.showMessageDialog(this, "아이디는 필수 항목입니다");
			return; //메소드를 벗어나라
		}
		
		for(int i=0; i<model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this,"사용 중인 아이디입니다.");
				return;
			}
		}//for
		
		String name = JOptionPane.showInputDialog(this, "이름를 입력하세요");
		String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력하세요");
		String tel = JOptionPane.showInputDialog(this, "핸드폰를 입력하세요");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		model.addRow(v);
		JOptionPane.showMessageDialog(this, "추가 완료");
		
	}

	public static void main(String[] args) {
		new JTableEx2();
		
	}

}








