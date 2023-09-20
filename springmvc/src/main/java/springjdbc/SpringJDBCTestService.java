package springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringJDBCTestService {
	@Autowired
	SpringJDBCTestDAO dao;
	public void getempcount() {
		dao.count();
	}
}
