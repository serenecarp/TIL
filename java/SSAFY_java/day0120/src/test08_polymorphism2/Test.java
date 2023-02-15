package test08_polymorphism2;


import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("박성준", 22, "자바");
		
		Person p = st;
//		p.
		// object, person, student 다 있는데 person 관점에서만 보고 있습니다요
		
		Student st3 = (Student) p;
		st3.study();
		// 얘는 다 갖고 있으니 다시 student로 바꿨을 때 줄 수 있는 정보가 있지요
		
		
		
		Person p2 = new Person("김성준", 23);
		Student st2 = (Student) p2; //  명시적으로 캐스팅하셔야 해요
//		p2.
//		st2.
		st2.study(); // 오류 -> 메모리상에는 없다
		// object, person에 관련된 것만 있어서 student에 대해서는 뭔가 줄 수가 없어요
	}
}
