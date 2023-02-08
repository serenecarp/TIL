package reference;

public class ChildCasting extends ParentCasting{
	public ChildCasting() {
		System.out.println("Child working");
	}
	
	public ChildCasting(String name) {}
	
	public void printName() {
		System.out.println("Child printName()");
	}
	
	public void printAge() {
		System.out.println("Child printAge()");
	}
}
