package test02;

import java.util.Arrays;
import java.util.List;

public class Person {
	String name;
	int age;
	boolean hungry;
	String mbti;
	List<String> hobbies;
	
	public Person(String name, int age, boolean hungry, String mbti, List<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hungry = hungry;
		this.mbti = mbti;
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hungry=" + hungry + ", mbti=" + mbti + ", hobbies="
				+ hobbies + "]";
	}
	
	
	
	
}
