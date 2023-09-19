package annotation.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext fac = new ClassPathXmlApplicationContext("/config/anno.xml");
		// PlayerItfc p = (PlayerItfc) fac.getBean("player");
		PlayerItfc p = fac.getBean("player", PlayerItfc.class);

		p.play();
		System.out.println("세 번 굴린 주사위의 합:" + p.getTotalValue());
	}

}
