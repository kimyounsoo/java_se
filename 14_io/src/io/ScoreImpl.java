package io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ScoreImpl implements Score {
	private List<ScoreDTO> list;
	
	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
	}

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
		System.out.println(list.size());
	}
	
	@Override
	public void print(DefaultTableModel model) {
		model.setRowCount(0);//���̺� �ʱ�ȭ
		
		for(ScoreDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getHak());
			v.add(dto.getName());
			v.add(dto.getKor()+"");
			v.add(dto.getEng() + "");
			v.add(dto.getMath() + "");
			v.add(dto.getTot() + "");
			v.add(dto.getAvg() + "");
			
			model.addRow(v);
		}//for
		
	}

	@Override
	public void search(DefaultTableModel model) {
		String hak = JOptionPane.showInputDialog(null, "�й��� �Է��ϼ���");
		if(hak==null||hak.equals(""))return;
		
		int sw = 0;
		//model.setRowCount(0); // ������ �����  �ʱ�ȭ �ʱ�ȭ �ϰ� ����
		for(ScoreDTO dto : list) {
			if(hak.equals(dto.getHak())) {
				
				if(sw==0)model.setRowCount(0); // Ȯ�� �� �ʱ�ȭ ����� �ΰ���
				
				Vector<String> v = new Vector<String>();
					v.add(dto.getHak());
					v.add(dto.getName());
					v.add(dto.getKor()+"");
					v.add(dto.getEng() + "");
					v.add(dto.getMath() + "");
					v.add(dto.getTot() + "");
					v.add(dto.getAvg() + "");
					
					model.addRow(v);
					
					sw=1; //������ 1�� ����
			}//if
		}//for
		
		if(sw==0) { // ������ 0 �״��
			JOptionPane.showInputDialog(null, "ã���� �ϴ� �й��� �����ϴ�.");
		}
		
	}

	@Override
	public void tot_desc() {
		//Collections.sort(list); ScoreDTO �� ��Ƽ� �ص��ǰ� ���⿡ ���� ���� �ȴ�
		//�׷� ScoreDTO �� ���ø����� ������ ���൵�ȴ�
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
			@Override
			public int compare(ScoreDTO o1, ScoreDTO o2) {
				return o1.getTot() < o2.getTot() ? 1 : -1;
			}
			
		};
		
		Collections.sort(list, com);
	}

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		
		if(file==null) return;
		
		//ScoreDTO�� ���Ϸ� ����
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			//oos.writeObject(list) �̰� �߰��ؼ� ����Ʈ�� ������ ������ ����� �ִ� �׷��� �ø��������嵵 �޾���� �Ѵ�
			// �̰ɾ����� �ε��ʵ� �����������
			for(ScoreDTO dto : list) {
				oos.writeObject(dto);
			}
			
			oos.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		
		if(file==null) return;
		
		list.clear(); //�ʱ�ȭ

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			while(true) {
				try {
					ScoreDTO dto = (ScoreDTO)ois.readObject(); //�ڽ� = (�ڽ�)�θ�
					list.add(dto);
					
				}catch(EOFException e) {
					break;
				}
				
			}//while
			
			ois.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}














