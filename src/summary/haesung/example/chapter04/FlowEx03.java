package summary.haesung.example.chapter04;

public class FlowEx03
{

	public static void main(String[] args)
	{
		int 	num 	= 0;
		char 	sign 	= ' ';
		
		// 중첩 if문은 블럭이 중요하다.
		if(num >= 0)
		{
			if(num != 0)
			{
				sign = '+';
			}
			else
			{
				sign = '-';
			}
		}

		// else문이 바깥쪽의 if문에 속한 것처럼 보이지만
		// 블럭이 없으면 else블럭은 가까운 if문에 속한 것으로 간주된다.
		if(num >= 0)
			if(num != 0)
				sign = '+';
		else
			sign = '-';
		
	}

}
