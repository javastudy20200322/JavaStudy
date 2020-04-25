package summary.haesung.example.chapter07;


class Parent_
{
	int x = 100;
	
	void method()
	{
		System.out.println("Parent Method");
	}
}

class Child_ extends Parent_
{
	int x = 200;
	
	void method()
	{
		System.out.println("Child Method");
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}


public class BindingTest
{

	public static void main(String[] args)
	{
		Parent_ p  = new Child_();
		Child_ 	c  = new Child_();
		
		// 인스턴스변수는 참조변수의 타입에 따라가고, 메소드는 실제 인스턴스타입을 따라간다.
		System.out.println("p.x=" + p.x);
		p.method();
		System.out.println(p.getClass().getName());	// Parent_타입을 참조하지만, 실제 인스턴스는 Child_타입이다.
		
		System.out.println();
		
		System.out.println("c.x=" + c.x);	// Child_타입에 인스턴스변수 x가 정의되어있지 않다면 Parent_타입의 x를 따라간다.
		c.method();
		System.out.println(c.getClass().getName());
	}

}
