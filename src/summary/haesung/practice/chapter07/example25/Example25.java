package summary.haesung.practice.chapter07.example25;

class Outer
{
	class Inner
	{
		int iv = 100;
	}
}

class Outer2
{
	static class Inner2
	{
		int iv = 200;
	}
}


public class Example25
{
	
	public static void main(String[] args)
	{
		example25();
		example26();
	}
	
	static void example25()
	{
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.iv);
	}
	
	static void example26()
	{
		Outer2.Inner2 inner = new Outer2.Inner2();
		
		System.out.println(inner.iv);
	}
}
