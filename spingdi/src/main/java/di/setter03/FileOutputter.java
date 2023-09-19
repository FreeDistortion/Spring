package di.setter03;

public class FileOutputter implements Outputter{
	private String filePath;

	@Override
	public void output(String message) {
		System.out.println("Output result via outputter.");

	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
