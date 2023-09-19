package app2;

public class MyBeanStyleB implements MyBean {
	
	@Override
	public void testHello(String name) {
		System.out.println("Hi there. "+name+"!");
	}
}
