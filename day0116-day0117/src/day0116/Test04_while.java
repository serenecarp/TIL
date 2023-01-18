package day0116;

import java.util.Scanner;

public class Test04_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num ==1) {
			System.out.println("블록을 실행합니다.");
			num = sc.nextInt(); // 새로운 조건으로 또 검사해야 함!
		}
	}
	
}
