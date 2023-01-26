package test08_numberbox;


// 타입파라미터에 제한
// Number의 자손들로만 타입을 지정할 수 있도록
public class NumberBox<T extends Number> {
	// T는 타입처럼 사용 가능
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
