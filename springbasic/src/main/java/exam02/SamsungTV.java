package exam02;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---소리 올린다.");

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---소리 내린다.");

	}
}
