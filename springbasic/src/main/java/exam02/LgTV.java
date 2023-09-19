package exam02;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---전원 켠다.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---전원 끈다.");

	}

	@Override
	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
	}

	@Override
	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}
