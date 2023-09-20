package springjdbc.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService implements AbstractJobsService{

	AbstractJobsDAO dao;
	
	@Autowired
	public JobsService(AbstractJobsDAO dao) {
		super();
		this.dao = dao;
	}

	public JobsService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getCount() {
		dao.getCount();
	}
}
