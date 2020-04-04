package summary.haesung.example.chapter04;

public class FlowEx05
{

	public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40, 50};
		
		// 향상된 for문은 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.
		for(int tmp : arr)
		{
			System.out.println(tmp);
			tmp += tmp+1;
		}
		
		// tmp에 1을 더해주었지만 값에는 변화가 없다.
		for(int tmp : arr)
		{
			System.out.println(tmp);
		}
		
	}

}
