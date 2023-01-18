package com.ssafy.ws.step2;

import java.util.Scanner;

public class AppleTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sqr = sc.nextInt();
		
		// 델타
		// (-1, 0), (1, 0), (0, -1), (0, 1), 자기 자신
		int[] dx = {-1, 1, 0, 0, 0};
		int[] dy = {0, 0, -1, 1, 0};
		
		int[][] ground = new int[sqr][sqr]; // 각 땅에 영양분이 얼마 있나
		int[][] nutrients = new int[sqr][sqr]; // 그 땅이 받을 수 있는 영양분 총합은 얼만가
		
		for(int r=0; r<sqr; r++){
			for(int c=0; c<sqr; c++) {
				ground[r][c] = sc.nextInt();
			}
		}
		

		// 3중for문을 쓰지 않으려면 어떻게 해야 할까...???
		for(int r=0; r<sqr; r++){
			for(int c=0; c<sqr; c++) {
				// n*n 배열을 돌면서 상하좌우랑 가운데값 다 더하기
				for(int d=0; d<5; d++) {
					// (r, c)기준으로 주변 (-1, 0), (1, 0), (0, -1), (0, 1) 탐색 + 자기자신(0, 0)
					int nr = r + dy[d];
					int nc = c + dx[d];

					if (nc<0 || nc>=sqr || nr<0 || nr>=sqr) continue;

					// 상하좌우+중 영양분 합을 구해 nutrients 배열에 넣기
					nutrients[r][c] += ground[nr][nc];
				}
			}
		}
		
		
//		// 중간점검용 좌표별 영양분 총합 출력
//		for(int r=0; r<sqr; r++){
//			for(int c=0; c<sqr; c++) {
//				System.out.printf("%-3d", nutrients[r][c]);
//			}
//			System.out.println();
//		}
		
		
		// nutrients[][] 중에서 최대값 찾기
		int maxNutri = Integer.MIN_VALUE;

		for(int r=0; r<sqr; r++) {
			for(int c=0; c<sqr; c++) {
				if(maxNutri<nutrients[r][c]) maxNutri=nutrients[r][c];
			}
		}
		
		System.out.println(maxNutri);
	}
}