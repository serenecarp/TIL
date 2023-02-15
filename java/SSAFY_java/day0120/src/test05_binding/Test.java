package test05_binding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("박성준", 27, "산경");
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메소드를 재정의할 수 있다.
//		st.
		
		// 다형성
		Person st2 = new Student("이준학", 27, "자바");
		st2.eat(); // 1. 음식을 먹는다. 2. 지식을 먹는다.
	}
}
