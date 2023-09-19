package di.constructorPractice02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext f=new ClassPathXmlApplicationContext("/config/constructor.xml");
		IWriteArticleMgr iwam=f.getBean("writeArticleMgr", IWriteArticleMgr.class);
		
		ArticleDTO dto=new ArticleDTO();
		dto.setTitle("Title");
		dto.setName("name");
		dto.setContent("content");
		dto.setDate("Sep 15 23");
		
		iwam.write(dto);
		
		
	}

}
