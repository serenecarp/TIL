package override;

public class ChildOverriding extends ParentOverriding{
	public ChildOverriding() {
		System.out.println("ChildrenOverriding Constructor");
	}
	public void printName() {
		System.out.println("ChildOverriding - printName()");
	}
}
