package com.ssafy.ws.step3;

public class DigitTest2 {
	public static void main(String[] args) {
		int count = 1;
		
		//i == 2, 1, 0, -1, -2
		for(int i=2; i>=-2; i--) {

			// 짝수일 때 공백, i = 1(가운데 줄)일 때 공백 각각 지정 -> 입력 숫자가 커지면 수정 필요
			if(i%2 != 0) {
				System.out.print("   ");
			}else if(i == 0) {
					System.out.print("      ");
			}
			
			// i가 양수(또는 0)일 때 출력
			if(i>=0) {
				for(int j=1; j<=2*i+1; j++) {
					System.out.printf("%-3d", count);
						count ++;
				}
			}
			// i가 음수일 때 출력(양수로 바꿔서 같은 함수 적용했다가 다시 음수로 바꿈->같은 함수를 한번만 쓸 순 없을까?)
			else {
				i *= -1;
				for(int j=1; j<=2*i+1; j++) {
					System.out.printf("%-3d", count);
						count ++;
				}
				i *= -1;
			}
			
			// 줄바꿈
			System.out.println();
		}
		
//		//  교수님 풀이!
//		// 도형에 출력할 숫자 변수
//		int cnt = 0;
//		int blank = 0; // 공백 출력 카운트 변수
//		boolean isIncrease = true;
//		int target = 5/2; // 공백의 증가가 반전이 되는 포인트 확인
//		
//		// while을 활용해서 1 ~ 17까지 값을 올리면서 숫자 출력
//		while(cnt<=17) {
//			// 공백 출력
//			for(int i=0; i<blank; i++) {
//				System.out.printf("%3s", "");
//			}
//			//숫자출력
//			for(int i=0; i<5-2*blank; i++) {
//				System.out.printf("%3d", cnt++); //3칸의 너비로 숫자 출력
//			}
//			System.out.println();
//			
//			//공백을 증가시킬지 감소시킬지 처리
//			
//			if(isIncrease) {
//				++blank; // 공백 1개 늘려줘
//			} else if(isIncrease == false) {
//				--blank;
//			}
//			
//			// 공백 카운트 반전이 되는 목표개수와 일치하면, 공백 감소 여부로 변경!
//			if (blank == target) {
//				isIncrease = false;
//			}
//			
//		}
		
	}
}
