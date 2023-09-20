package springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//Spring이 제공하는 기능을 이용해서 DB 연동하는 class

@Repository
public class SpringJDBCTestDAO {
	
	@Autowired
	JdbcTemplate template;
	public void count() {
		//emp table의 개수를 출력하는 method
		System.out.println(template.queryForObject("SELECT COUNT(*) FROM EMP", Integer.class));
	}
}
