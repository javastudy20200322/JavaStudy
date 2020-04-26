package summary.haesung.practice.chapter07.example07;


class Parent
{
	int x = 100;
	
	// 3번
	Parent()
	{
		this(200);	// Parent(int x)를 호출.
	}
	
	// 4번 -> 이후 Object()도 호출된다..
	Parent(int x)
	{
		this.x = x;
	}
	
	int getX()
	{
		return x;
	}
}

class Child extends Parent
{
	int x = 3000;
	
	// 1번
	Child()
	{
		// Parent()를 호출하는 super(); 가 생략되어있다. 컴파일시 자동 생성. 
		this(1000);	// Child(int x)를 호출.
	}
	
	// 2번
	Child(int x)
	{
		this.x = x;
	}
}


public class Example07
{

	public static void main(String[] args)
	{
		Child c = new Child();
		
		// getX()는 조상클래스인 Parent클래스에 선언이 되어있으므로 Parent클래스의 인스턴스변수 x를 반환한다.
		System.out.println("x : " + c.getX());
	}

}
