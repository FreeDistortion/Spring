package payment.ver2;

public class PaymentServiceLogImpl implements PaymentService {
	// source �ȿ��� object�� �����ϴ� code�� �и� - �ܺο��� ���� �ް�� ����.
	// PGObj��� interface variable�� mapping�� object�� ���� �������� �ʰ� �ܺο��� ���� �޵��� ����.
	// �ܺο��� ���� �ޱ� ���� constructor�� �̿��� object�� ������ �� ���� �ްų�, method�� �����ϰ� ���� �ޱ�.
	PGObj pgobj;

	
	
	
	
	public PaymentServiceLogImpl() {
		
	}



	// 1. Constructor�� ���� ���� �ޱ�.
	public PaymentServiceLogImpl(PGObj pgobj) {
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
		System.out.println("================================");
		pgobj.pay();
		System.out.println("================================");
		}

	@Override
	public void serviceCancel() {
		// TODO Auto-generated method stub
		System.out.println("================================");
				pgobj.cancel();
				System.out.println("================================");
				}

}
