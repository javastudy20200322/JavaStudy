package summary.haesung.example.chapter07;

public class InnerEx2
{
	
	class InstanceInner {}
	static class StaticInner {}

	InstanceInner iv = new InstanceInner();
	
	static StaticInner cv = new StaticInner();
	
	static void staticMethod()
	{
		// static 메소드에서는 인스턴스멤버에 바로 접근할 수 없다.
//		InstanceInner 	obj1 = new InstanceInner();
		StaticInner 	obj2 = new StaticInner();
		
		// static에서 인스턴스에 접근하려면 아래처럼 해야한다.
		InnerEx2 		outer 	= new InnerEx2();
		InstanceInner 	obj1 	= outer.new InstanceInner();
	}
	
	void instanceMethod()
	{
		InstanceInner 	obj1 = new InstanceInner();
		StaticInner 	obj2 = new StaticInner();
		
		// 지역클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod()
	{
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}

}
