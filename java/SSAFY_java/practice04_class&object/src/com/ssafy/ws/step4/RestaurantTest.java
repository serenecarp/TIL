package com.ssafy.ws.step4;

public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant eulMil = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		Restaurant doma = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		Restaurant none = new Restaurant();
		
		Review aa = new Review(1, 101, "김싸피", "사장님이 맛있고 냉면이 친절해요");
		Review bb = new Review(2, 401, "나싸피", "연어가 살아있어요");
		Review nn = new Review();
		
		Restaurant[] rsts = new Restaurant[10];
		Review[] rvs = new Review[10];
		
		// 이 코드는 결국 레스토랑을 입력하고, 그다음 리뷰를 따로 입력해야 한다.
		// 그러나 리뷰는 해당 레스토랑에 대해 작성하는 것이므로, 제대로 만들자면
		// 레스토랑과 리뷰를 합해서 하나의 객체?나 배열에 묶어 넣어주는 게 좋을 것 같다.
		// 레스토랑1 -> 리뷰1/ 레스토랑2 -> 리뷰2 처럼 되도록.. / 지금은 그저 두 항목이 따로 노는 상태다.
		// 2차원 배열을 쓰면 될거같기도 하다. 근데 객체로 2차원을 어떻게 해야할지 몰라서 + 머리에 더 넣기에 과부하 상태라서 일단 여기선 원시적으로 출력했다.
		
		rsts[0] = eulMil;
		rsts[1] = doma;
		rsts[2] = none;
		
		rvs[0] = aa;
		rvs[1] = bb;
		rvs[2] = nn;
		// 여기선 원시적으로 하나하나 넣어줬지만, 실제로는 for문 안에서 배열 안에 입력값을 죽죽죽 받아서 쓰겠지.?
		// 입력받은 String을 객체로 만들어주는 건 어떻게 하는 걸까?
		
		// 레스토랑과 리뷰를 각각 출력
		System.out.println("*************************맛집목록*************************");
		for(int i=0; i<rsts.length; i++) {
			if(rsts[i] == null) continue;
			System.out.println(rsts[i]);
		}
		System.out.println("*************************리뷰목록*************************");
		for(int i=0; i<rvs.length; i++) {
			if(rvs[i] == null) continue;
			System.out.println(rvs[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
