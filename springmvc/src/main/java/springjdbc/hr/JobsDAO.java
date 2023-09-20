package springjdbc.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JobsDAO implements AbstractJobsDAO{
	
	//DB�� SQL�� ������ �� �ֵ��� ����� �����ϴ� Spring JDBC�� ��ǥ class
	JdbcTemplate templ;
	
	
	public JobsDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public JobsDAO(JdbcTemplate templ) {
		super();
		this.templ = templ;
	}

	@Override
	public void getCount() {
	System.out.println(templ.queryForObject("SELECT COUNT(*) FROM JOBS", Integer.class));	
	}
}
