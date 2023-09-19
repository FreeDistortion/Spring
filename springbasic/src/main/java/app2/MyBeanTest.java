package app2;

/*
 * OOP Ư���� �����ؼ� ����
 * -> object�� �����ϸ� ���� method�� �������� �ʾƵ� �۵�.
 * -> �׷���, object�� ����ϱ� ���� ����� code�� �����ؾ� �Ѵ�.
 */
public class MyBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBean obj=new MyBeanStyleA();
		run(obj);
		show(obj);
		change(obj);
		
	}

	public static void run(MyBean obj) {
		System.out.println("=====================");
		obj.testHello("BP");
		System.out.println("=====================");

	}

	public static void show(MyBean obj) {
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");

	}

	public static void change(MyBean obj) {
		System.out.println("*********************");
		obj.testHello("BP");
		obj.testHello("BP");
		System.out.println("*********************");

	}

}
