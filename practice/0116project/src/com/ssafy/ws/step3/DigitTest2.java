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
	}
}
