package com.ssafy.hw.step2;

import java.util.Scanner;

public class Bridge_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		// n * n 크기 배열 선언 ( 지도 )
		int[][] map = new int[n][n];
		
		// 지도 정보 입력 받기
		for (int r=0; r<n; r++) {
			for (int c=0 ; c<n; c++) {
				map[r][c] = sc.nextInt();
			}
		}
		
		// 최대값 저장
		int maxDistance = 0;
		
		for (int r=0 ; r<n; r++) {
			for (int c=0; c<n; c++) {
				
				// 지금 위치가 섬인지 검사
				if (map[r][c] == 1) {
					
					// 섬이면 현재 위치로부터 사방탐색 하여 가로 또는 세로에 있는 섬과 거리 측정, 최대값 저장
					
					// 동쪽이 1인지 검사
					for (int d = 1; c+d<n ; d++) {
						if (map[r][c+d]==1) {
							maxDistance = Math.max(maxDistance, d);
							break;
						}
					}
					
					// 서쪽이 1인지 검사
					for (int d = 1; c-d>=0; d++) {
						if (map[r][c-d]==1) {
							maxDistance = Math.max(maxDistance, d);
							break;
						}
					}
					
					// 북쪽이 1인지 검사
					for (int d = 1; r-d>=0; d++) {
						if (map[r-d][c]==1) {
							maxDistance = Math.max(maxDistance, d);
							break;
						}
					}
					
					// 남쪽이 1인지 검사
					for (int d = 1; r+d<n; d++) {
						if (map[r+d][c]==1) {
							maxDistance = Math.max(maxDistance , d);
							break;
						}
					}
				}
			}
		}
		
		System.out.println(maxDistance);

	}
}
