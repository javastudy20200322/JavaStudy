package summary.haesung.example.chapter07;


class Outer
{
	class InstanceInner
	{
		int iv = 100;
	}
	
	static class StaticInner
	{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod()
	{
		class LocalInner
		{
			int iv = 400;
		}
	}
}


public class InnerEx4
{
	
	public static void main(String[] args)
	{
		// Outer클래스 내부의 인스턴스클래스 InstanceInner의 인스턴스를 생성.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv : " + ii.iv);	// 인스턴스변수의 접근방법
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv); // static 변수의 접근방법
		
		// static클래스는 Outer클래스를 먼저 선언하지 않아도 이스턴스를 생성할 수 있다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}
}
