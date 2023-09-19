package app2;

/*
 * OOP 특성을 적용해서 변경
 * -> object를 변경하면 기존 method를 변경하지 않아도 작동.
 * -> 그러나, object를 사용하기 위해 만드는 code는 변경해야 한다.
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
