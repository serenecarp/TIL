package test02;

public class Computer implements HdmiInput {

	// 컴퓨터는 hdmi 출력장치에 의존
	private HdmiOutput outputDevice;
	
	@Override
	public void setOutput(HdmiOutput device) {
		outputDevice = device;
	}

	@Override
	public void show() {
		System.out.print("컴퓨터 화면을");
		outputDevice.output();
	}

}
