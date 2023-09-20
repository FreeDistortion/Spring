package springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringJDBCTestController {
	
	@Autowired
	SpringJDBCTestService service;

	@RequestMapping("/springjdbc/test")
	public String emptest() {
		service.getempcount();
		return "main/index";
	}

}
