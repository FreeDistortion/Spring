package payment.ver2;
// 결제와 관련된 object를 생성해서 전달 해주는 object - 외부조립기(object의 lifecycle을 관리하는 component를 container라고 부른다.)
// 지금은 규모가 작고 테스트의 목적을 갖고 있으므로 class 생성 코드를 직접 사용하지만, 규모가 커지면 관련 class들이 늘어나고 xml이나 설정 정보를 보고 object를 자동으로 생성, 생성된 object를 memory에 저장할 수 있도록 바뀌어야 한다.
public class PaymentjFactory {
	// 사용할 PG company의 object를 만들어 return하는 method.
	public PGObj getPGObj(){
		return new Toss();
	}
	
	
	// Service Object를 만들어서 return.
	public PaymentService getPaymentService() {
		PaymentService service = new PaymentServiceLogImpl(getPGObj());
		return service;
	}
}
