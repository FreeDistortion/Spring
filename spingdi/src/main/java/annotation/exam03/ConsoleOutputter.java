package annotation.exam03;

import org.springframework.stereotype.Service;

@Service("cop")
public class ConsoleOutputter implements Outputter{

	@Override
	public void output(String message) {
		// TODO Auto-generated method stub
		System.out.println("Output result via console.");

	}
	
}
