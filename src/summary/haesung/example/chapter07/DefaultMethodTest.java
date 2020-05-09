package summary.haesung.example.chapter07;


class Child2 extends Parent2 implements MyInterface, MyInterface2
{
	// MyInterface, MyInterface2의 method1()을 오버라이딩한건데
	// 뭘 오버라이딩하든 method 내용을 바꿀거라 어느 interface의 method1()을 가져온건지는 상관없음.
	public void method1()
	{
		System.out.println("method1() in child");
	}
}

class Parent2
{
	public void method2()
	{
		System.out.println("method2() in Parent");
	}
}

interface MyInterface
{
	default void method1()
	{
		System.out.println("method1() in MyInterface");
	}
	
	default void method2()
	{
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod()
	{
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2
{
	default void method1()
	{
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod()
	{
		System.out.println("staticMethod() in MyInterface2");
	}
}


public class DefaultMethodTest
{

	public static void main(String[] args)
	{
		Child2 c = new Child2();
		c.method1();	// child 클래스의 method1()
		c.method2();	// 상속받은 Parent 클래스의 method2()
		
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}

}
