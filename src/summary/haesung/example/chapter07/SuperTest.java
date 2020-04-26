package summary.haesung.example.chapter07;


class Parent
{
	int x = 10;
}

class Child extends Parent
{
	int x = 20;
	
	void method()
	{
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);		// this.x는 자신의 멤버변수x
		System.out.println("super.x=" + super.x);	// super.x는 조상클래스의 멤버변수 x
	}
}


public class SuperTest
{

	public static void main(String[] args)
	{
		Child c = new Child();
		c.method();
	}

}
