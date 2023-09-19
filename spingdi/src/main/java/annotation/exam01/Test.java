package annotation.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fac = new ClassPathXmlApplicationContext("/config/anno.xml");
		MyService obj = (MyService) fac.getBean("service");
		
		obj.testService();
	}

}
