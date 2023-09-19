package di.setter01;

public class MyServiceImpl implements MyService {
	String name;
	String msg;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	
	

}
