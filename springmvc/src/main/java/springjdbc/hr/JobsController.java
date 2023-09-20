package springjdbc.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobsController {

	AbstractJobsService serv;
	
	@Autowired
	public JobsController(AbstractJobsService serv) {
		super();
		this.serv = serv;
	}

	public JobsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/springjdbc/getJobs")
	public String getCount() {
		serv.getCount();
		return "main/index";
	}
}
