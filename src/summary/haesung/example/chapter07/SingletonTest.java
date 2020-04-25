package summary.haesung.example.chapter07;


final class Singleton
{
	private static Singleton s = new Singleton();
//	private static Singleton s = null;
	
	private Singleton()
	{
		System.out.println("###");
	}
	
	public static Singleton getInstance()
	{
		// s = new Singleton(); 인 경우 아래 if문이 왜 필요한지 모르겠다..
		if(s == null)
		{
			s = new Singleton();
		}
		
		return s;
	}
}


public class SingletonTest
{

	public static void main(String[] args)
	{
//		Singleton s = new Singleton();	// Singleton 기본생성자는 private 제어자가 붙어 있으므로 불가능하다.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}
