package controller;

import java.util.ArrayList;

import model.BoardDTO;

public class BoardController {
	private ArrayList<BoardDTO> list; // list는 글을 저장하는 원본

	public BoardController() {
		list = new ArrayList<>();
	}

	public void add(BoardDTO b) { // 추가하기
		list.add(b);
	}

	public ArrayList<BoardDTO> selectAll() { // 목록보기
		ArrayList<BoardDTO> temp = new ArrayList<>();// 직접적으로 받아가게하지못하게 하려고 temp 임시 어레이에복사를 한다 캡슐화때문에 원본을 보내지 않는다
		temp.addAll(list); // Array.get 전부 1, 2, 3 을 넣어준다 addAll
		return temp;
	}

	public BoardDTO selectOne(int index) { // 개별보기
		return list.get(index);
	}

	public void update(int index, BoardDTO b) { // 수정하기
		list.set(index, b);
	}

	public void delete(int index) {
		list.remove(index);
	}

}
