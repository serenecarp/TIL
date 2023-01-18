package day0117;

public class Test02_여러자료형의배열 {
	public static void main(String[] args) {
		boolean[] bArr = new boolean[5];
		char[] cArr = new char[5];
		float[] fArr = new float[5];
		double[] dArr = new double[5];
		String[] sArr = new String[5];
		
		System.out.println(bArr[0]);
		System.out.println(cArr[0]); // '\u0000'
		System.out.println(fArr[0]);
		System.out.println(dArr[0]);
		System.out.println(sArr[0]);

	}
}
