package exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext tvFac = new ClassPathXmlApplicationContext("/config/exam.xml");
		TV pwObj = (TV) tvFac.getBean("tvPowerBean");
		TV soundObj= (TV) tvFac.getBean("tvSoundBean");
		
		pwObj.powerOn();
		pwObj.powerOff();
		soundObj.soundUp(); 
		soundObj.soundDown();
	}

}
