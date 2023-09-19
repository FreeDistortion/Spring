package app3;
/*
 * ApplicationContext�� �̿��� �۾�
 * 1. ApplicationContext ����
 * 2. getBean()�� �̿��ؼ� lookup
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanTest_Spring_ApplicationContext {

	public static void main(String[] args) {
		// 1. IoC container ���� - ApplicationContext
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		System.out.println("----------- ApplicationContext Object Created -----------");
				
		// 2. ���ϴ� Object�� lookup
		MyBean obj = (MyBean) factory.getBean("mybean");
		MyBean obj2 = (MyBean) factory.getBean("mybean");
		System.out.println("----------- getBean() Called -----------");
		if(obj==obj2) {
			System.out.println("Same Objects.");
		}else {
			System.out.println("Different Objects.");
		}
		run(obj);
		show(obj);
		change(obj);

	}

	public static void run(MyBean obj) {
		System.out.println("=====================");
		obj.testHello("BP");
		System.out.println("=====================");

	}

	public static void show(MyBean obj) {
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");

	}

	public static void change(MyBean obj) {
		System.out.println("*********************");
		obj.testHello("BP");
		obj.testHello("BP");
		System.out.println("*********************");

	}

}
