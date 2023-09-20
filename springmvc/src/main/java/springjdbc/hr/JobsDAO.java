package springjdbc.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JobsDAO implements AbstractJobsDAO{
	
	//DB에 SQL을 실행할 수 있도록 기능을 지원하는 Spring JDBC의 대표 class
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
