package di.setter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fa= new ClassPathXmlApplicationContext("/config/setter.xml");
		InterMessage im=fa.getBean("imsg", InterMessage.class);
		im.sayHello();
		
	}

}
