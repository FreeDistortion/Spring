package payment.ver2;

public class PaymentServiceImpl implements PaymentService {
	// source 안에서 object를 생성하는 code를 분리 - 외부에서 전달 받고록 구현.
	// PGObj라는 interface variable에 mapping될 object를 직접 생성하지 않고 외부에서 전달 받도록 구현.
	// 외부에서 전달 받기 위해 constructor를 이용해 object가 생성될 때 전달 받거나, method를 정의하고 전달 받기.
	PGObj pgobj;

	
	public PaymentServiceImpl() {
		
	}



	// 1. Constructor를 통해 전달 받기.
	public PaymentServiceImpl(PGObj pgobj) {
		super();
		this.pgobj = pgobj;
	}
	  
	
	
	// 2. Method를 통해 전달 받기. - setter method
	public void setPgobj(PGObj pgobj) {
		this.pgobj = pgobj;
	}
	
	
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
