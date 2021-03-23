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
		model.setRowCount(0);//테이블 초기화
		
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
		String hak = JOptionPane.showInputDialog(null, "학번을 입력하세요");
		if(hak==null||hak.equals(""))return;
		
		int sw = 0;
		//model.setRowCount(0); // 기존것 지우기  초기화 초기화 하고 들어가기
		for(ScoreDTO dto : list) {
			if(hak.equals(dto.getHak())) {
				
				if(sw==0)model.setRowCount(0); // 확인 후 초기화 방법은 두가지
				
				Vector<String> v = new Vector<String>();
					v.add(dto.getHak());
					v.add(dto.getName());
					v.add(dto.getKor()+"");
					v.add(dto.getEng() + "");
					v.add(dto.getMath() + "");
					v.add(dto.getTot() + "");
					v.add(dto.getAvg() + "");
					
					model.addRow(v);
					
					sw=1; //있으면 1로 변경
			}//if
		}//for
		
		if(sw==0) { // 없으면 0 그대로
			JOptionPane.showInputDialog(null, "찾고자 하는 학번이 없습니다.");
		}
		
	}

	@Override
	public void tot_desc() {
		//Collections.sort(list); ScoreDTO 에 잡아서 해도되고 여기에 직접 만들어도 된다
		//그럼 ScoreDTO 에 임플리먼저 컴페어러블 빼줘도된다
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
		
		//ScoreDTO을 파일로 저장
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			//oos.writeObject(list) 이걸 추가해서 리스트를 통으로 보내는 방법도 있다 그러면 시리얼라이즈드도 달아줘야 한다
			// 이걸쓰려면 로드쪽도 변경해줘야함
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
		
		list.clear(); //초기화

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			while(true) {
				try {
					ScoreDTO dto = (ScoreDTO)ois.readObject(); //자식 = (자식)부모
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














