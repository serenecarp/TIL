package test05_normalbox;

public class Test {
	public static void main(String[] args) {
		NormalBox b = new NormalBox();
		
		b.setData("Hell World :(");
		// instanceof를 써서 형변환하는 작업이 필요
		String s = (String) b.getData(); //  Object에서 String으로 형변환: 큰집에서 작은집은 안대용
	}
}
