package app3;

/*
 * ���յ��� �ص��� ���� program 
 * -> class ���յ��� ���� �������� ���⿡ ����ϴ� class�� ����Ǹ� �� class�� �̿��ؼ� �۾��ϴ� ��� ����� class�� method�� �����Ǿ�� �Ѵ�.
 * -> OOP Ư���� ������� ����.
 * -> ���� Interface�� ����ü(���� interface�� ����� ���� �ڵ尡 ������ class)�� �и����� �ʾҴ�. ��, �������� ������� �ʾҴ�.
 */
public class MyBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBeanStyleA obj=new MyBeanStyleA();
		run(obj);
		show(obj);
		change(obj);
		
	}

	public static void run(MyBeanStyleA obj) {
		System.out.println("=====================");
		obj.testHello("BP");
		System.out.println("=====================");

	}

	public static void show(MyBeanStyleA obj) {
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");
		obj.testHello("BP");

	}

	public static void change(MyBeanStyleA obj) {
		System.out.println("*********************");
		obj.testHello("BP");
		obj.testHello("BP");
		System.out.println("*********************");

	}

}
