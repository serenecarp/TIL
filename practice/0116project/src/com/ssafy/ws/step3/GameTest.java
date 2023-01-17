package com.ssafy.ws.step3;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.\n");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.println("\n번호를 입력하세요.");
		int mode = sc.nextInt(); // 게임모드 입력
		// 내 승리, 컴퓨터 승리
		int wins_me = 0;
		int wins_com = 0;
		// 가위, 바위, 보 (1, 2, 3) => rock scissors paper인데 rsp아니고 rcp..(실수)
		int rcp_num = 0;
		// (7 - 2*mode) 판 수행 -> 5, 3, 1
		for(int i=1; i<=7-2*mode; i++) {
		
			System.out.print("가위바위보 중 하나 입력: ");
			// nextInt 바로 다음 nextLine 쓰니까 nextLine이 앞에껄 먹어버려서 첫판에만 예외
			if (i == 1) {
				sc.nextLine();
			}
			
			String rcp = sc.nextLine(); // 가위바위보!
//		// switch case도 써보려 했는데..
//			switch(rcp) {
//				case "가위":
//					rcp_num = 1;
//					break;
//				case "바위":
//					rcp_num = 2;
//					break;
//				case "보":
//					rcp_num = 3;
//					break;
//// 잘못 입력했을 때 돌아가서 다시 물어보는 걸 구현하려고 했는데 실패
//			}
//			
			
		// rcp가 받은 str에 따라 int로 변환
			if(rcp.equals("가위")) {
				rcp_num = 1;
			}else if(rcp.equals("바위")) {
				rcp_num = 2;
			}else if(rcp.equals("가위")) {
				rcp_num = 3;
			}
			
			
		// 게임 결과 출력
			int game = rcp_num - (int)(Math.random()*3)+1;
			
			
			if (game == 1 || game == -2){
				System.out.println("이겼습니다!!!");
				wins_me += 1;
			}
			else if (game == -1 || game == 2) {
				System.out.println("졌습니다!!!");
				wins_com += 1;
			}
			else {
				System.out.println("비겼습니다!!!");
			}
			}
			
		//최종 게임 결과 출력
			if (wins_me > wins_com) {
				System.out.println("###플레이어 승!!!");
			}
			else if (wins_me < wins_com) {
				System.out.println("###컴퓨터 승!!!");
			}
			else {
				System.out.println("###무승부!!!");
			}

	}
}
