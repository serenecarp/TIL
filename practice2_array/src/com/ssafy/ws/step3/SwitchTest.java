package com.ssafy.ws.step3;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numSwitch = sc.nextInt(); // 스위치 개수 N
		int numDiv = sc.nextInt(); // (배수?)입력 개수 M
		
		// boolean: 0, 1 두 가지 값으로 계속 왔다갔다하기에는 이걸 쓰는 게 좋아보여서 채택
		boolean[] booBulbs = new boolean[numSwitch]; // true false로 표시되는 스위치
		int[] theBulbs = new int [numSwitch]; // 0과 1로 표시되는 스위치(전구)
		int[] divs = new int[numDiv]; // 약수? 배수? 아무튼 M개의 그 숫자들을 넣어줄 array
		
		// M개의 약수? 입력
		for(int k=0; k<numDiv; k++) {
			divs[k] = sc.nextInt();
		}
		
//		// for each로 값 초기화해보려다 실패함.. how?
//		for(int x: divs) {
//			x = sc.nextInt();
//		}
		
		// 자리는 1, 2, 3, 4.. 번째로 나타내므로 i는 1부터 시작했음
		for(int i=1; i<=numSwitch; i++) {
			// j번째 약수?님들을 꺼내서 booBulb의 i번째 칸을 한칸씩 검사
			for(int j=0; j<numDiv; j++) {
				// 약수님으로 나눠떨어지면 그 숫자의 배수번째 칸이다 => 스위치 딸깍
				if(i%divs[j] == 0) booBulbs[i-1] = !booBulbs[i-1];
			}
			
			// true면 1, false면 0으로 변환
			if (booBulbs[i-1] == true) {
				theBulbs[i-1] = 1;
			}else {
				theBulbs[i-1] = 0;
			}
		}
		// 최종 출력, 띄어쓰기 포함
		for(int x: theBulbs) {
			System.out.printf("%-2d", x);
		}
		
	}
}
