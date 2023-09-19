package app3;
/*
 * Spring IoC Container를 이용해 작업
 * - Spring은 bean에 대한 설정 정보를 xml, annotation, class에 정의
 * - BeanFactory의 하위
 * 1. xml parsing
 * 2. factory class 만들기
 * 3. factory에서 제공되는 method( getBean("IDName") )를 이용해서 object를 container에 요청 
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest_Spring_BeanFactory {

	public static void main(String[] args) {
		// 1. xml parsing - xml file name과 위치 정보를 class path에서 찾아서 parse해 object로 관리. 
		Resource res = new ClassPathResource("/config/bean.xml");
		System.out.println("----------- Resource Object Created -----------");
		
		// 2. Spring이 제공하는 IoC container(object를 생성하고 관리하는 기능을 갖고 있는 classes)class를 생성.
		// -> IoC container가 object를 생성하기 위해 필요한 설정 정보를 담고 있는 object인 Resource를 전달.
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("----------- IoC Container Created -----------");
		
		// 3. 필요한 object를 loopup(요청).
		// bean을 등록할 때 정의한 idName 이용.
		MyBean obj = (MyBean)factory.getBean("mybean");
		MyBean obj2 = (MyBean)factory.getBean("mybean");
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
