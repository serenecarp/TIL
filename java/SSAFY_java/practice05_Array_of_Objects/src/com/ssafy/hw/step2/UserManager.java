package com.ssafy.hw.step2;

import java.util.Arrays;

//대체 어떻게 Arrays.copyOf를 사용하지 않고
//User[] 전체가 아닌 등록된 사용자 일부만 return할 수 있을까.
//정말 한참 고민하다가 결국 굴복하고 java.util.Arrays를 import 해왔다..
//UserManager.java에 util arrays는 주어지지 않았어서,
//사용해도 되는 게 맞는지 잘 모르겠다..
//아무튼 그리하여 Arrays 클래스를 처음 사용해보게 되었다!

public class UserManager {

	private int size = 0;
	
	// 최대 사용자 개수
	private final int MAX_SIZE = 100 ;

	private User[] userList = new User[MAX_SIZE];

	// 사용자 추가
	public void add(User user) {
		
		// 최대 사용자 개수에 도달하지 않았으면 사용자 추가
		if (size < MAX_SIZE) {
			userList[size++] = user;
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	// 등록된 사용자 리스트 반환
	public User[] getList() {

		return Arrays.copyOf(userList, size);
	}
	
	// 제공된 name과 일치하는 이름을 가진 사용자 객체 반환
	public User searchByName(String name) {
		
		for (int i = 0; i < userList.length ; i++) {
			if (name.equals(userList[i].getName())) {
				return userList[i];
			}
		}

		return null;
	}

}
