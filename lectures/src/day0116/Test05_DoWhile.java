package day0116;

import java.util.Scanner;

public class Test05_DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		do {
			System.out.println("블록 실행");
			num = sc.nextInt();
			
		} while (num ==1);
	}
}
