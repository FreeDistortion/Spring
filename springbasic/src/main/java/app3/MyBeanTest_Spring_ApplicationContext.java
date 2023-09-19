package app3;
/*
 * ApplicationContext를 이용해 작업
 * 1. ApplicationContext 생성
 * 2. getBean()을 이용해서 lookup
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanTest_Spring_ApplicationContext {

	public static void main(String[] args) {
		// 1. IoC container 생성 - ApplicationContext
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		System.out.println("----------- ApplicationContext Object Created -----------");
				
		// 2. 원하는 Object를 lookup
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
