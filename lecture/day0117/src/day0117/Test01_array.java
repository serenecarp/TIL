package day0117;

public class Test01_array {
	public static void main(String[] args) {
		// 배열 변수(주소값을 담을 수 있는)의 선언
		int[] arr;
		int arr2[]; // 권장하지 않음
		
		int[] arr3 = new int[5]; // int형의 경우 0으로 초기화
		int[] arr4 = new int[] {1, 2, 3, 4, 5}; // 원하는 값으로 초기화할 때
		int[] arr5 = {1, 3, 5, 7, 9}; // new int[]를 생략할 수도 있음. 단, 한 줄에
		
		int[] arr6;
		arr6 = new int[7]; // 선언 나누기 ㄱㄴ
		// arr6 = {1, 2, 3, 4, 5}; -> 이렇게 나눠서 쓰면 에러
		arr6 = new int[] {1, 2, 3, 4, 5}; // 이건 이렇게 선언과 나눠쓰기 가능
	}
}
