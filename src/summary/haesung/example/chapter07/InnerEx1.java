package summary.haesung.example.chapter07;

public class InnerEx1
{
	class InstanceInner
	{
		int iv = 100;
//		static int cv = 100; 	// innerclass에서 static 변수는 선언할 수 없다.
		final static int CONST = 100;
	}
	
	static class StaticInner
	{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod()
	{
		// method 내에 선언된 지역클래스도 인스턴스클래스와똑같다.
		class LocalInner
		{
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
