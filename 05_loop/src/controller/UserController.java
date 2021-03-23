package controller;

import java.util.ArrayList;

import model.UserDTO;

public class UserController {
	// 로그인 메소드
	private ArrayList<UserDTO> list;

	public UserController() {
		list = new ArrayList<>();
		UserDTO u1 = new UserDTO();
		u1.setId(1);
		u1.setUserId("admin");
		u1.setPassword("111");
		u1.setNickname("운영자");

		UserDTO u2 = new UserDTO();
		u2.setId(2);
		u2.setUserId("a");
		u2.setPassword("222");
		u2.setNickname("사용자 a");

		UserDTO u3 = new UserDTO();
		u3.setId(3);
		u3.setUserId("b");
		u3.setPassword("333");
		u3.setNickname("사용자 b");

		list.add(u1);
		list.add(u2);
		list.add(u3);
	}

	public boolean isDuplicatedUserId(String id) {
		for (UserDTO u : list) {
			if (u.getUserId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public UserDTO logIn(UserDTO attempt) {
		UserDTO logIn = null; // 일치하지 않으면, false면 null 일치하면 u
		for (UserDTO u : list) {
//      for(int i = 0; i < list.size(); i++) {
//    	  UserDTO u = list.get(i);
//      } 이 for문을 줄여서 위의 for문으로 쓴것이다.
			// 이 for문의 의미는
			// 만약 배열이나 리스트처럼 한가지 데이터타입이 여러개 모여있을경우
			// 0번 인덱스부터 끝까지를 하나씩 뽑아내서 u 라고 부른다.
			if (attempt.getUserId().equals(u.getUserId()) && attempt.getPassword().equals(u.getPassword())) {
				logIn = u; // 아이디와 패스워다가 같으면 리턴할 logIn 에 u 를 넣어주는 코드의 if문이다
			}
		}
		return logIn;

	}

	public void insert(UserDTO u) { // 아이디 패스워드 닉네임 회원번호까지 들어간다
		list.add(u);
	}
}