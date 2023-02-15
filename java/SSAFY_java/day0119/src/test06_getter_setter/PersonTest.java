package test06_getter_setter;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.name = "박성준"; // private 변수에 접근 불가
		p1.setName("박성준"); // public 메소드이므로 접근 가능
		p1.setAge(1110); // setter를 이용해서 멤버변수의 값을 수정
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		p1.setHungry(true);
		System.out.println(p1.isHungry());
		
		
	}
}
