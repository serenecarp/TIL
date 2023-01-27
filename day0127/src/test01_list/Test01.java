package test01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		// List
		// - 순서(index)가 있는 자료구조
		// - 중복이 허용된다
		List<String> names = new ArrayList<>();// 제네릭 공부해와야겠ㄴ다...
//		List<String> names = new LinkedList<>();
//		List<String> names = new Vextor<>(); // 어떤 구현체로 구현하든 List를 만든거면 ok
		
		// 원소 추가
		names.add("안중근");
		names.add("이봉창");
		names.add("이순신");
		names.add(0, "이순신"); // 0번 인덱스에다가 집어넣겠다
		
		System.out.println(names); // 이건 toString같은거 안써도 되나보네
		
		// 비었는지 체크
		System.out.println(names.isEmpty());
		// 원소의 개수
		System.out.println(names.size()); // 배열은 .length였다
		// 수정
		names.set(2, "세종대왕");
		System.out.println(names);
		// 조회
		for(String name: names) {
			System.out.println(name);
		}
		// 반복자 사용
		Iterator<String> e = names.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		// 인덱스로 삭제
		names.remove(2);
		System.out.println(names);
		// 값으로 삭제
		names.remove("이순신");
		System.out.println(names); // 맨 앞의 이순산 하나만 사라진다
		// 전부 삭제
		names.clear();
		System.out.println(names);
		
		names.add("박성준");
		names.add("박성준");
		names.add("옹응잉");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		// "박성준"을 삭제하고 싶다
//		for(int i=0; i<names.size(); i++) {
//			if(names.get(i).equals("박성준")) {
//				names.remove(i);
//			}
//		}
//		System.out.println(names); // 삭제가 하나밖에 안됨!!! <= 실시간으로 삭제되면서 names.size 크기가 동적으로 변하기 때문
		for(int i=names.size()-1; i>=0; i--) {
			if(names.get(i).equals("박성준")) {
				names.remove(i);
			}
		}
		System.out.println(names); // 그렇다면 뒤에서부터 처리
	
	}
}
