package exam02;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� �Ҵ�.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� ����.");

	}

	@Override
	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	@Override
	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
