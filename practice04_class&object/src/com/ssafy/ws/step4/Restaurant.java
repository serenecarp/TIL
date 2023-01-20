package com.ssafy.ws.step4;

public class Restaurant {
	int resID;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	
	public Restaurant() {
		this(0, "none", "none", "none", 0);
	}
	public Restaurant(int resID, String name, String address, String signatureMenu, int rate) {
		this.resID = resID;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	
	public String toString() {
		return "Restaurant ["+"resID="+resID+", name="+name+", address="+address+", signatureMenu="+signatureMenu+", rate="+rate+"]";
	} // 이런식으로.. 노가다해서.. 출력하는게.. 맞나..??
	
}
