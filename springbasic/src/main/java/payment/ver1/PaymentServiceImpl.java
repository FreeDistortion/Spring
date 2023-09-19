package payment.ver1;

//call PGObj methods
public class PaymentServiceImpl implements PaymentService {
	// 내부에서 사용하는 class를 직접 code로 define.
	// 1. NHN을 이용해 처리되던 기능을 Inicis로 변경하려면??? -> implement class 부분을 직접 source에서 변경해야...
	// -> that means, OCP가 지켜지지 못 함: 기존 source를 변경.
	/*
	 * PGObj pgobj = new Inicis();
	 * PGObj pgobj = new Toss();
	 */
	
	// 2. 해당 class해서 PGObj에만 의존(사용)해야 하는데, NHN도 의존.
	// -> 상위 interface와 implemented class를 의존하고 있음.
	// -> DIP에 위배
	// -> that means, 상위와 하위에 모두 의존하고 있으면 code가 변경될 수 밖에 없다.
	
	// class 내부에서 사용하는 다른 library의 class들을 의존모듈이라 부른다. 
	PGObj pgobj = new NHN();

	@Override
	public void servicePay() {
		// TODO Auto-generated method stub
		pgobj.pay();
	}

	@Override
	public void serviceCancel() {
		// TODO Auto-generated method stub
		pgobj.cancel();
	}

}
