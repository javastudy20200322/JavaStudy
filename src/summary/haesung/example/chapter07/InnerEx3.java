package summary.haesung.example.chapter07;

public class InnerEx3
{
	private int outerIv = 0;
	static 	int outerCv = 0;
	
	class InstanceInner
	{
		int iiv 	= outerIv;	// 외부클래스의 private멤버에 접근이 가능하다.
		int iiv2 	= outerCv;
	}
	
	static class StaticInner
	{
		// 마찬가지로 static에서 인스턴스변수에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod()
	{
		int lv = 0;
		final int LV = 0;
		
		class LocalInner
		{
			int liv 	= outerIv;
			int liv2 	= outerCv;
			int liv3 	= lv;
			int liv4 	= LV;
		}
	}
	
	public static void main(String[] args)
	{
		InnerEx3 test = new InnerEx3();
		test.myMethod();
	}
}
