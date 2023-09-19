package payment.ver2;
// ������ ���õ� object�� �����ؼ� ���� ���ִ� object - �ܺ�������(object�� lifecycle�� �����ϴ� component�� container��� �θ���.)
// ������ �Ը� �۰� �׽�Ʈ�� ������ ���� �����Ƿ� class ���� �ڵ带 ���� ���������, �Ը� Ŀ���� ���� class���� �þ�� xml�̳� ���� ������ ���� object�� �ڵ����� ����, ������ object�� memory�� ������ �� �ֵ��� �ٲ��� �Ѵ�.
public class PaymentjFactory {
	// ����� PG company�� object�� ����� return�ϴ� method.
	public PGObj getPGObj(){
		return new Toss();
	}
	
	
	// Service Object�� ���� return.
	public PaymentService getPaymentService() {
		PaymentService service = new PaymentServiceLogImpl(getPGObj());
		return service;
	}
}
