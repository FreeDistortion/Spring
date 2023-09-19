package annotation.exam03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("imsg")
public class MessageBean implements InterMessage {
	private String name;
	private String greeting;
	
	@Autowired
	@Qualifier("cop")
	private Outputter outputter;

	
	public MessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

}
