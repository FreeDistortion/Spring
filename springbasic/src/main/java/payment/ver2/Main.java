package payment.ver2;

public class Main {

	public static void main(String[] args) {
		//사용하는 모든 Object를 관리하는 Factory를 이용해 작업.
		PaymentjFactory factory= new PaymentjFactory();
		
		//call service layer's method
		PaymentService service= factory.getPaymentService();
		service.servicePay();
	}

}
