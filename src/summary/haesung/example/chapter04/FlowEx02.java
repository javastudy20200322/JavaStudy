package summary.haesung.example.chapter04;

public class FlowEx02
{

	public static void main(String[] args)
	{
		boolean bool = false;
		if(bool)
		{
			System.out.println("조건식이 참인 경우 실행된다.");
		}
		else
		{
			System.out.println("조건식이 거짓인 경우 실행된다.");
		}
		
		
		int score = 100;
		if(score > 90)
		{
			System.out.println("A 입니다.");
		}
		else if(score > 80)
		{
			System.out.println("B 입니다.");
		}
		else
		{
			System.out.println("낙제입니다.");
		}
	}

}
