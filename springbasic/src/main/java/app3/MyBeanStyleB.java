package app3;

public class MyBeanStyleB implements MyBean {

	public MyBeanStyleB() {
		System.out.println("========== Constructor loaded: MyBeanStyleB was created. ==========");
	}

	public void testHello(String name) {
		System.out.println("Hi there. " + name + "!");
	}
}
