package test09_polymorphism3;

public class Test {
	public static void main(String[] args) {
		SubClass child = new SubClass();
		System.out.println(child.x);
		child.method();
		
		SuperClass parent = child;
		System.out.println(parent.x);
		parent.method();
	}
}
