package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++) {
			System.out.print("월 입력>>");
			int month = sc.nextInt();
			if(3 <= month && month <= 5) {
				System.out.printf("%d월은 봄입니다.\n", month);
			}else if(6 <= month && month <= 8) {
				System.out.printf("%d월은 여름입니다.\n", month);
			}else if(9 <= month && month <= 11) {
				System.out.printf("%d월은 가을입니다.\n", month);
			}else {
				System.out.printf("%d월은 겨울입니다.\n", month);
			}
		}
	}
}