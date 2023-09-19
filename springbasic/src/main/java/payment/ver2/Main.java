package payment.ver2;

public class Main {

	public static void main(String[] args) {
		//����ϴ� ��� Object�� �����ϴ� Factory�� �̿��� �۾�.
		PaymentjFactory factory= new PaymentjFactory();
		
		//call service layer's method
		PaymentService service= factory.getPaymentService();
		service.servicePay();
	}

}
