package annotation.exam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("service")
public class MyServiceImpl implements MyService {
	@Value("fixedName")
	String name;
	@Value("fixedMessage")
	String msg;
	
	@Autowired
	Logic logic;

	// Default Constructor�� �׻� ������ ��.
	public MyServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of MyServiceImpl");
	}

	// Spring container�� object�� ����� logic object�� inject�� �� �ֵ��� constructor �غ�.
	public MyServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("Constructor of MyServiceImpl with 3 parameters");
	}

	// Spring container�� object�� ����� logic object�� inject�� �� �ֵ��� constructor �غ�.

	public MyServiceImpl(Logic logic, String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("Constructor of MyServiceImpl with 3 parameters----------------mutant");
	}

	@Override
	public void testService() {
		// TODO Auto-generated method stub
		System.out.println(msg + "," + name);
		logic.testLogic();
	}

}
