package com.ssafy.ws.step3;


public class DigitTest1 {
	public static void main(String[] args) {
		int count = 1;
		for(int i=5; i>=1; i--) {
			//i = 5, 4, 3, 2, 1
			// 공백 출력: i=5에서 k 없음, i=4에서 k 1개, i=3에서 k 2개...
			for(int k=5; k>=i+1; k--) {
				System.out.print("   ");
				//System.out.printf("%3s", "");
			}
			// 숫자 찍기: i=5에서 j 5개, i=4에서 j 4개, i=3에서 j 3개...
			for(int j=1; j<=i; j++) {
				System.out.printf("%-3d", count);
				count++;
			}
			System.out.println();			
		}
		
//	// 교수님 풀이: i와 j를 비교하는 방법..!!!!!
//		// 도형에 출력할 숫자 변수
//		int cnt = 0;
//		// 1번째 for문은: 행
//		for (int i=0; i<5; i++) {
//			// 2번째 for문은: 열
//			for (int j=0; j<5; j++) {
//
//				if (j<i) {
//					// 공백 출력
//					System.out.printf("%3s", ""); // 3칸의 너비로 공백
//				} else { // j>i
//					// 숫자 출력	
//					System.out.printf("%3d", ++cnt); // 3칸의 너비로 공백
//				}
//			}
//			System.out.println("");
//		}
	
	
	
	}
}



