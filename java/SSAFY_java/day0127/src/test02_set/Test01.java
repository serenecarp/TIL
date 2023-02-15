package test02_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		// Set
		// - 집합을 나타내는 자료구조
		// - 중복을 허용하지 않음
		// - 순서도 없음
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); // 이걸로 하면 순서가 왜다르냐 ㅋㅋ
		// HashSet
				// - 해시 테이블에 원소를 저장
				// - 성능면에서 우수하다고 알려져 있다
				// - 원소들의 순서가 일정하지 않음
				
				// TreeSet
				// - red-black tree에 원소를 저장
				// - 값에 따라서 순서가 결정
				// - 값을 순서대로 정렬할 필요가 있다면 고려해볼만한 선택지
				
		
		set.add("박성준");
		set.add("박성준");
		set.add("너부리");
		set.add("보노보노");
		System.out.println(set); // 중복추가안됨!
		
		System.out.println("박성준".hashCode()); // 고유한 정수값으로 나타낸 것
		System.out.println("박");
		System.out.println(new String("박성준").hashCode()); // 문자랑 객체로 만든 놈이랑 똑같이 나오네
										// 같은 문자열이면 같은 해시코드가 나온다
		System.out.println("박성준".equals("박성준")); // hashCode와 equals가 둘다 같으면 hashSet은 같은 걸로 본다
		
		// 반복자
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		
	}
}
