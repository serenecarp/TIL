package test02;

public class superComputer implements HdmiInput {
	private HdmiOutput device;

	@Override
	public void setOutput(HdmiOutput device) {
		this.device = device;
	}

	@Override
	public void show() {
		System.out.print("슈퍼컴퓨터의 화면을 ");
		device.output();
	}
}
