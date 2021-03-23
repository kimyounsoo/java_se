package controller;

import java.util.ArrayList;

import model.BoardDTO;

public class BoardController {
	private ArrayList<BoardDTO> list; // list�� ���� �����ϴ� ����

	public BoardController() {
		list = new ArrayList<>();
	}

	public void add(BoardDTO b) { // �߰��ϱ�
		list.add(b);
	}

	public ArrayList<BoardDTO> selectAll() { // ��Ϻ���
		ArrayList<BoardDTO> temp = new ArrayList<>();// ���������� �޾ư����������ϰ� �Ϸ��� temp �ӽ� ��̿����縦 �Ѵ� ĸ��ȭ������ ������ ������ �ʴ´�
		temp.addAll(list); // Array.get ���� 1, 2, 3 �� �־��ش� addAll
		return temp;
	}

	public BoardDTO selectOne(int index) { // ��������
		return list.get(index);
	}

	public void update(int index, BoardDTO b) { // �����ϱ�
		list.set(index, b);
	}

	public void delete(int index) {
		list.remove(index);
	}

}
