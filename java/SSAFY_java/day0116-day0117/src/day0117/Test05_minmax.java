package day0117;

public class Test05_minmax {
	public static void main(String[] args) {
		int[] arr = {21, 3, 12, 64, 72, 2, 6, 124, 64, 32, 11, 424};
		
		// 최소값, 최대값
		int min = arr[0]; // 첫번째 원소를 최소값이라고 가정
		int max = arr[0]; // 임시 최대값
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) min = arr[i];
			if(max<arr[i]) max = arr[i];
		}
		System.out.println(min);
		System.out.println(max);

	}
}
