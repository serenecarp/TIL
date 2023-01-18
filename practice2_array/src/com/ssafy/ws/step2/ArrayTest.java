package com.ssafy.ws.step2;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// 1. 1차원 정수 배열 초기화 및 한줄 출력
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]);
		}
		
		
		//2. 입력 받은 크기로 음식을 위한 String 선언 및 출력
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String[] foodarr = new String[len]; // 음식 배열 크기 입력
		
		for(int i=0; i<len; i++) {
			
			// 또다시 등장한 nextInt - nextLine 문제... 앞에서 입력한게 버퍼에 남아있다나? 하는 걸 반복문 처음만 빼준다.
			if (i == 0) {
				sc.nextLine();
			}
			
			// 음식 이름 입력
			foodarr[i] = sc.nextLine();
		}
		// for each를 이용한 출력
		for(String food : foodarr) {
			System.out.println(food);
		}
		
	}
}
