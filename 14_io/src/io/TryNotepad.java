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
		// ��ũ�ѹ� �׻� ���ְ� �ϴ� ��ɾ�
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		menu = new MenuPane();
		this.setJMenuBar(menu);

		Container c = this.getContentPane();
		c.add("Center", scroll); // output -> scroll ���� output ���� scroll
		setVisible(true);
		setTitle("���ܸ޸���");
		setBounds(500, 300, 500, 400);

		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "����� ������ �����Ͻðڽ��ϱ�?", "����",
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
		// �̺�Ʈ �̰� �ݹ� �޼ҵ尡 �ƴ϶� ���̵���ο� .event ����� �ݹ� �ȴ�
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
			openDialog();// ����޼ҵ�
			//fileRead();
		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			//fileWrite();
		} else if (e.getSource() == menu.getExitM()) {
			int result = JOptionPane.showConfirmDialog(this, 
														"�����Ͻðڽ��ϱ�?", 
														"����",
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

		JOptionPane.showMessageDialog(this, file); // ������ �߳������� �޽����� Ȯ���ϴ� �뵵 ��� �޸��� ����µ��� �������

	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this); // or (null)

		if (result == JFileChooser.APPROVE_OPTION) { // Ȯ���� �������� 
			file = chooser.getSelectedFile();
			fileWrite();						//fileWrite(); ������
		}

		JOptionPane.showMessageDialog(this, file); // ������ �߳������� �޽����� Ȯ���ϴ� �뵵 ��� �޸��� ����µ��� �������

	}

	private void fileWrite() {
		if (file == null)
			return;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = output.getText(); // �ؽ�Ʈ ��ü �ҷ�����
			bw.write(data);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void fileRead() { // ���ο콺�� ȣ��ο��� ���ο콺�� �ɾ�����Ѵ� ���ݰ��� ��쿡�� ȣ��ο�(76��°��) ���ο콺�� �ɼ��� ���� �׷��� Ʈ����ĳġ�� ó��
		output.setText(""); // ���� �����ϸ� �����Ϳ� �߰��Ǿ �����⶧���� �ʱ�ȭ �����Ŀ� ���� ���ش�
		if (file == null)
			return;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;

			while ((line = br.readLine()) != null) {
				// output.setText(line); // �����
				output.append(line + "\n");// �߰�
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
