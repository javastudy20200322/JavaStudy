package summary.haesung.example.chapter05;

public class ArrayEx04
{

	public static void main(String[] args)
	{
		// 길이가 10인 int타입의 배열 선언.
		int[] numArr = new int[10];
		
		// 배열 numArr의 각 인덱스에 인덱스번호를 값으로 넣는다.
		for(int i=0; i<numArr.length; i++)
		{
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		// 배열 numArr에 저장된 값을 섞는다.
		for(int i=0; i<100; i++)
		{
			int n 		= (int) (Math.random()*10);
			int tmp 	= numArr[0];
			numArr[0] 	= numArr[n];
			numArr[n] 	= tmp;
		}
		
		for(int i=0; i<numArr.length; i++)
		{
			System.out.print(numArr[i]);
		}
	}
}
