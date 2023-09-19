package app3;

/*
 * 결합도가 극도로 높은 program 
 * -> class 결합도가 높아 의존성이 높기에 사용하는 class가 변경되면 이 class를 이용해서 작업하는 모든 기능의 class와 method가 수정되어야 한다.
 * -> OOP 특성이 적용되지 않음.
 * -> 상위 Interface와 구현체(상위 interface를 상속해 실제 코드가 구현된 class)를 분리하지 않았다. 즉, 다형성이 적용되지 않았다.
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
