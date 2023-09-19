package payment.ver1;

//call PGObj methods
public class PaymentServiceImpl implements PaymentService {
	// ���ο��� ����ϴ� class�� ���� code�� define.
	// 1. NHN�� �̿��� ó���Ǵ� ����� Inicis�� �����Ϸ���??? -> implement class �κ��� ���� source���� �����ؾ�...
	// -> that means, OCP�� �������� �� ��: ���� source�� ����.
	/*
	 * PGObj pgobj = new Inicis();
	 * PGObj pgobj = new Toss();
	 */
	
	// 2. �ش� class�ؼ� PGObj���� ����(���)�ؾ� �ϴµ�, NHN�� ����.
	// -> ���� interface�� implemented class�� �����ϰ� ����.
	// -> DIP�� ����
	// -> that means, ������ ������ ��� �����ϰ� ������ code�� ����� �� �ۿ� ����.
	
	// class ���ο��� ����ϴ� �ٸ� library�� class���� ��������̶� �θ���. 
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
