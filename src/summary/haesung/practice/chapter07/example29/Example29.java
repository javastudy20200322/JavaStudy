package summary.haesung.practice.chapter07.example29;

class Test1
{
	void method()
	{
		int i = 0;
		final int J = 1;
		
		class Test2
		{
			int i1 = i;
			int i2 = J;
//			i = 2;
		}
		
		Test2 t2 = new Test2();
		
		System.out.println(t2.i1);
		System.out.println(t2.i2);
	}
	
}

public class Example29
{

	public static void main(String[] args)
	{
//		지역 클래스에서 외부 클래스의 인스턴스멤버와 static멤버에 모두 접근할 수 있지만, 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?
		
//		정답 : 메소드가 수행을 마쳐서 지역변수가 소멸된 시점에도, 지역클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있어서.
//			  상수는 스택영역이 아닌 '런타임 상수 풀'에 저장되어 상관없다.
		
		Test1 t1 = new Test1();
		t1.method();
	}

}
