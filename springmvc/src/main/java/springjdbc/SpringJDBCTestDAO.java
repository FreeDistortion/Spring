package springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//Spring�� �����ϴ� ����� �̿��ؼ� DB �����ϴ� class

@Repository
public class SpringJDBCTestDAO {
	
	@Autowired
	JdbcTemplate template;
	public void count() {
		//emp table�� ������ ����ϴ� method
		System.out.println(template.queryForObject("SELECT COUNT(*) FROM EMP", Integer.class));
	}
}
