package payment.ver1;

public class Main {

	public static void main(String[] args) {
		//call service layer's method
		PaymentService service= new PaymentServiceImpl();
		service.servicePay();
	}

}
