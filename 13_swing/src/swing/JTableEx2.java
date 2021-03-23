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
		//������
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong","ȫ�浿","111","010-123-1234"));
		list.add(new PersonDTO("hong","ȫ�浿","111","010-123-1234"));
		list.add(new PersonDTO("hong","ȫ�浿","111","010-123-1234"));
		list.add(new PersonDTO("conan","�ڳ�","333","010-777-7777"));
		
		//Ÿ��Ʋ
		vector = new Vector<String>();
		vector.addElement("���̵�");
		vector.addElement("�̸�");
		vector.add("��й�ȣ");
		vector.add("�ڵ���");
		
		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int r, int c) {
				return (c!=0) ? true : false;
			}
		};
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		//���̺� - ������
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
		}//for
		
		//��ư ����
		insertBtn = new JButton("�߰�");
		deleteBtn = new JButton("����");
		
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(insertBtn);
		p.add(deleteBtn);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);		
		c.add("South", p);
				
		setBounds(200,200,500,400); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ
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
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
		if(name == null) return;
		
		int sw=0;
		for(int i=0; i<model.getRowCount(); i++) {
			if(name.equals(model.getValueAt(i, 1))) {
				model.removeRow(i);
				i--; // �迭 ������ ��ĭ�� �и��⶧���� ���� �ε����� ���ƿ��� ���� ���ش�
				sw=1;
			}
		}//for
		
		if(sw==0) JOptionPane.showMessageDialog(this, "���� �̸� �Դϴ�..");
		
	}

	private void insert() {
		//���� �� : ����ڰ� �Է��� ���ڿ�, ��� ��ư�� ���õǰų� â�� ������ null ����
		String id = JOptionPane.showInputDialog(this, "���̵� �Է��ϼ���");
		if(id==null) return;
		
		if(id.length()==0) {
			JOptionPane.showMessageDialog(this, "���̵�� �ʼ� �׸��Դϴ�");
			return; //�޼ҵ带 �����
		}
		
		for(int i=0; i<model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this,"��� ���� ���̵��Դϴ�.");
				return;
			}
		}//for
		
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
		String pwd = JOptionPane.showInputDialog(this, "��й�ȣ�� �Է��ϼ���");
		String tel = JOptionPane.showInputDialog(this, "�ڵ����� �Է��ϼ���");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		model.addRow(v);
		JOptionPane.showMessageDialog(this, "�߰� �Ϸ�");
		
	}

	public static void main(String[] args) {
		new JTableEx2();
		
	}

}








