package summary.haesung.practice.chapter07.example27;

public class Example27
{
	
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}
}
