package io;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TryNotepad extends JFrame implements ActionListener {
	private JTextArea output;
	private MenuPane menu;
	private File file;

	public TryNotepad() {
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		// 스크롤바 항상 떠있게 하는 명령어
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		menu = new MenuPane();
		this.setJMenuBar(menu);

		Container c = this.getContentPane();
		c.add("Center", scroll); // output -> scroll 변경 output 위에 scroll
		setVisible(true);
		setTitle("간단메모장");
		setBounds(500, 300, 500, 400);

		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "변경된 내용을 저장하시겠습니까?", "저장",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					saveDialog();
					//System.exit(0);
				} else if (result == JOptionPane.NO_OPTION) {
					System.exit(0);
				} else if (result == JOptionPane.CANCEL_OPTION) {
					return;
				}
			}
		});

	}// TryNotepad()

	public void event() {
		// 이벤트 이건 콜백 메소드가 아니라서 보이드메인에 .event 해줘야 콜백 된다
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getNewM()) {
			output.setText("");
		} else if (e.getSource() == menu.getOpenM()) {
			openDialog();// 열기메소드
			//fileRead();
		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			//fileWrite();
		} else if (e.getSource() == menu.getExitM()) {
			int result = JOptionPane.showConfirmDialog(this, 
														"저장하시겠습니까?", 
														"종료",
														JOptionPane.YES_NO_CANCEL_OPTION, 
														JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				saveDialog();
				//System.exit(0);
			}else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
				
		} else if (e.getSource() == menu.getCutM()) {
			output.cut();
		} else if (e.getSource() == menu.getCopyM()) {
			output.copy();
		} else if (e.getSource() == menu.getPasteM()) {
			output.paste();
		}
		

	}
	private void openDialog() {

		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this); // or (null)
		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			fileRead();

		}

		JOptionPane.showMessageDialog(this, file); // 파일이 잘나오는지 메시지로 확인하는 용도 없어도 메모장 만드는데는 상관없음

	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this); // or (null)

		if (result == JFileChooser.APPROVE_OPTION) { // 확인을 눌렀을때 
			file = chooser.getSelectedFile();
			fileWrite();						//fileWrite(); 열린다
		}

		JOptionPane.showMessageDialog(this, file); // 파일이 잘나오는지 메시지로 확인하는 용도 없어도 메모장 만드는데는 상관없음

	}

	private void fileWrite() {
		if (file == null)
			return;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = output.getText(); // 텍스트 전체 불러오기
			bw.write(data);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void fileRead() { // 스로우스는 호출부에도 스로우스를 걸어줘야한다 지금같은 경우에는 호출부에(76번째줄) 스로우스를 걸수가 없다 그래서 트라이캐치로 처리
		output.setText(""); // 파일 열기하면 원래것에 추가되어서 나오기때문에 초기화 해준후에 열기 해준다
		if (file == null)
			return;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;

			while ((line = br.readLine()) != null) {
				// output.setText(line); // 덮어쓰기
				output.append(line + "\n");// 추가
			} // while

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		new TryNotepad().event();
	}

}
