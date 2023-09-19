package di.setter01;

public class LogicImpl implements Logic{

	public LogicImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of LogicImpl");
	}

	@Override
	public void testLogic() {
		// TODO Auto-generated method stub
		System.out.println("Business method of executing DB connect, xml, json, calculate, ...");
	}

}
