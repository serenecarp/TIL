package com.ssafy.ws.step4;

public class Review {
	int reviewId;
	int resId;
	String writer;
	String content;
	
	public Review() {
		this(0, 0, "none", "none");
	}
	
	public Review(int reviewId, int resId, String writer, String content) {
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		return "Review [reviewId="+reviewId+", resId="+resId+", writer="+writer+", content="+content+"]";
	} // 이런식으로.. 노가다해서.. 출력하는게.. 맞나..??
}