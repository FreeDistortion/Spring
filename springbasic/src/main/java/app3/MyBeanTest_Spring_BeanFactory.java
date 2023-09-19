package app3;
/*
 * Spring IoC Container�� �̿��� �۾�
 * - Spring�� bean�� ���� ���� ������ xml, annotation, class�� ����
 * - BeanFactory�� ����
 * 1. xml parsing
 * 2. factory class �����
 * 3. factory���� �����Ǵ� method( getBean("IDName") )�� �̿��ؼ� object�� container�� ��û 
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest_Spring_BeanFactory {

	public static void main(String[] args) {
		// 1. xml parsing - xml file name�� ��ġ ������ class path���� ã�Ƽ� parse�� object�� ����. 
		Resource res = new ClassPathResource("/config/bean.xml");
		System.out.println("----------- Resource Object Created -----------");
		
		// 2. Spring�� �����ϴ� IoC container(object�� �����ϰ� �����ϴ� ����� ���� �ִ� classes)class�� ����.
		// -> IoC container�� object�� �����ϱ� ���� �ʿ��� ���� ������ ��� �ִ� object�� Resource�� ����.
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("----------- IoC Container Created -----------");
		
		// 3. �ʿ��� object�� loopup(��û).
		// bean�� ����� �� ������ idName �̿�.
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
