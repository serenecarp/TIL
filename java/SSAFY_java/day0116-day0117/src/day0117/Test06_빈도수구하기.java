package day0117;

import java.util.Arrays;

public class Test06_빈도수구하기 {
	public static void main(String[] args) {
		// 0부터 9까지 숫자
		int[] arr = {3,0,0,2,3,4,1,3,5,6,7,1,3,4,1,1,2,2,4,1,6,7,9,20};
		// 카운팅 배열
		int[] count = new int[21]; // 0부터 9까지의 인덱스가 필요하므로 크기 10인 배열 생성
		// count[num] : num의 빈도수
		// count[index] : index가 num인 숫자의 빈도수
		System.out.println(Arrays.toString(count));
		
		for (int i=0; i<arr.length; i++) {
			count[arr[i]]++; // 그 숫자에 해당하는 그 자리에서 +1
		}
		
		System.out.println(Arrays.toString(count));
		
	}
}
