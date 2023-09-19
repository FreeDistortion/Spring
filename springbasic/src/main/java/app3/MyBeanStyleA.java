package app3;

public class MyBeanStyleA implements MyBean {

	public MyBeanStyleA() {
		System.out.println("========== Constructor loaded: MyBeanStyleA was created. ==========");
	}

	public void testHello(String name) {
		System.out.println("æ»≥Á«œººø‰, "+name+"¥‘!");
	}
}
