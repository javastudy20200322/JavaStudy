package summary.haesung.example.chapter07;

public class InstanseofTest
{

	public static void main(String[] args)
	{
		// FireEngine은 Car의 자식클래스이고, Car는 Object의 자식클래스이다.
		// FireEngine은 조상클래스인 Car와 Object타입으로 형변환이 가능하다.
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine)
		{
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car)
		{
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object)
		{
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName());
	}

}
