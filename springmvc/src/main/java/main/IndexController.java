package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.html")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping("/index")
	public String tiles_index() {
		System.out.println("tiles�� Ȱ���� view ����");
		return "index";//controller���� return�ϴ� view name�� tiles properties file�� ����� <definition> element�� name �Ӽ��� ���ǵ� ����.
	}
	
	public IndexController() {
		
	}
	

}
