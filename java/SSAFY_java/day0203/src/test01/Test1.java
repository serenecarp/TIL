package test01;

import com.google.gson.Gson;

public class Test1 {
	// 외부 라이브러리를 인식시키는 방
	// 1. JRE System Library에 끼워넣기 (좋은 방법은 아님)
	// 2. 프로젝트 외부에 있는 jar 파일을 인식시키기
	//	- 프로젝트를 다른 곳으로 옮길 때, 링크가 깨질 수 있음.
	// 3. 프로젝트 내부에 폴더를 만들고 jar파일을 복사한 후 인식시키기
	//	- 프로젝트 폴더 우클릭 > Build Path > Configure Build Path
	//	- Library 탭 > Add JARS...
	// 4. Maven Project로 바꾸고 pom.xml에 dependency 추가
	
	public static void main(String[] args) {
		Person p1 = new Person("Lee", 30, false, null, new String[] {"YouTUbe","Cooking"});
		
		// 자바 객체 => JSON 문자열로
		// Gson.toJson() 메소드
		Gson gson = new Gson();
		String str = gson.toJson(p1);
		System.out.println(p1);
		System.out.println(str);
		
	}
}
