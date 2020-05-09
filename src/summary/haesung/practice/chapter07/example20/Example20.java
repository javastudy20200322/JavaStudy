package summary.haesung.practice.chapter07.example20;

public class Example20
{

	public static void main(String[] args)
	{
		Parent 	p = new Child();
		Child 	c = new Child();
		
		// 멤버변수는 참조하는 타입을 따라 가지만, 메소드는 오버라이딩된 자식메소드가 호출된다.
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}
