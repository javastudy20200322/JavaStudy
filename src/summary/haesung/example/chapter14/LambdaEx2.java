package summary.haesung.example.chapter14;

// 람다식을 다루기 위한 인터페이스(함수형 인터페이스)를 선언
@FunctionalInterface
interface MyFunction_
{
	void myMethod();
}

class Outer
{
	int val = 10;
	
	class Inner
	{
		int val = 20;
		
		void method(int i)
		{
			int val = 30;
//			i = 10;		// 람다식 내에서 사용 되는 지역변수는 final이 붙지 않아도 상수로 취급되므로 변경이 불가능.
			
			MyFunction_ f = () -> {
				System.out.println("i : " + i);
				System.out.println("val : " + val);
				System.out.println("this.val : " + this.val);
				System.out.println("Outer.this.val : " + Outer.this.val);
			};
			
			f.myMethod();
		}
	}
}

public class LambdaEx2
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}

}
