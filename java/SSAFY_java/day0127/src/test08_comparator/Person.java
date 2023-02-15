package test08_comparator;

public class Person {
	private String name;
	private String id;
	
	
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	
	

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	@Override
	public int hashCode() {
		return this.id.hashCode(); // 그냥 문자열의 해시코드 반환 // 해시코드란 놈이 뭐길래 오버라이드했다고 달라지노
	}





	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return this.id.equals(other.id);
		}else {
			return false;
		}
	}





	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
