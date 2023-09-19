package payment.ver2;

public class PaymentServiceImpl implements PaymentService {
	// source �ȿ��� object�� �����ϴ� code�� �и� - �ܺο��� ���� �ް�� ����.
	// PGObj��� interface variable�� mapping�� object�� ���� �������� �ʰ� �ܺο��� ���� �޵��� ����.
	// �ܺο��� ���� �ޱ� ���� constructor�� �̿��� object�� ������ �� ���� �ްų�, method�� �����ϰ� ���� �ޱ�.
	PGObj pgobj;

	
	public PaymentServiceImpl() {
		
	}



	// 1. Constructor�� ���� ���� �ޱ�.
	public PaymentServiceImpl(PGObj pgobj) {
		super();
		this.pgobj = pgobj;
	}
	  
	
	
	// 2. Method�� ���� ���� �ޱ�. - setter method
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
