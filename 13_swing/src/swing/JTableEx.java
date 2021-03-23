package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel {
	Object[][] data = {{"Nari","마루치",new Integer(1234), "옆집친구"},
					   {"One","오윤아",new Integer(1111),"예쁜이"},
					   {"tow","오윤서",new Integer(2222),"귀염둥이"},
					   {"three","아라치",new Integer(3333),"동아리 친구"}};

	String[] name = {"아이디","이름","비밀번호","구분"}; //필드명 들

	@Override
	public int getColumnCount() {//필수
		return name.length;
	}

	@Override
	public int getRowCount() {//필수
		return data.length;
	}

	@Override
	public Object getValueAt(int r, int c) {//필수
		return data[r][c];
	}
	
	@Override
	public String getColumnName(int c) {
		return name[c];
	}
	
	@Override
	public boolean isCellEditable(int r, int c) {
		return (c!=0) ? true : false;
	}
	
	@Override
	public void setValueAt(Object ob, int r, int c) {
		data[r][c] = ob;
	}
	
}
//-----------------
public class JTableEx extends JFrame {
	JTable table;
	JTableModel model;

	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		
		add(new JScrollPane(table));
		
		setBounds(200,200,300,300); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableEx();
	}

}






