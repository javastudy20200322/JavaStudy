package summary.haesung.example.chapter04;

public class FlowEx08
{

	public static void main(String[] args)
	{
		EXIT:
		for(int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				if(j == 5)
				{
//					break EXIT;		// 모든 반복문을 중지한다.
//					break;			// 안쪽 반복문만 중지한다.
					continue EXIT;	// *5부터 *9 까지 안나오네
//					continue;		// *5만 안나오네
				}
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}

}
