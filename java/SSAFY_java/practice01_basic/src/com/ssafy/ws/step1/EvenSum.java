package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		// 짝수면 ans에 그 값을 더해 나간다
		int ans = 0;
		for (int i = 1; i<=num; i++) {
			if (i % 2 == 0) {
				ans += i;
			}
		}
		System.out.printf("1부터 10까지 수 중 짝수의 합 = %d", ans);
	}
}
