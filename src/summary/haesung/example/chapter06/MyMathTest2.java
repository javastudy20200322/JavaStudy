package summary.haesung.example.chapter06;

class MyMath2
{
	long a, b;
	
	// 인스턴스변수만을 이용하여 작업하므로 매개변수가 필요없다.
	long add() 			{ return a + b; }
	long substract() 	{ return a + b; }
	long multiply() 	{ return a + b; }
	long divide() 		{ return a + b; }
	
	// 인스턴스변수와 관계없이 매개변수로만 작업이 가능하다.
	static long 	add(long a, long b) 		{ return a + b; }
	static long 	substract(long a, long b) 	{ return a - b; }
	static long 	multiply(long a, long b) 	{ return a * b; }
	static double 	divide(double a, double b) 	{ return a / b; }
}

public class MyMathTest2
{

	public static void main(String[] args)
	{
		// static메소드는 객체생성없이 호출이 가능하다.
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		System.out.println();
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메소드는 객체생성 후에만 호출이 가능하다.
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
