package di.constructorPractice01;

public class MessageBean implements InterMessage {
	private String name;
	private String greeting;
	private Outputter outputter;

	public MessageBean(String name, String greeting, Outputter outputter) {
		super();
		this.name = name;
		this.greeting = greeting;
		this.outputter = outputter;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		outputter.output(greeting);
		
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

}
