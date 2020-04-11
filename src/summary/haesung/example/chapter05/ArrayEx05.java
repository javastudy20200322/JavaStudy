package summary.haesung.example.chapter05;

public class ArrayEx05
{

	public static void main(String[] args)
	{
		int[] numArr = new int[10];
		
		// 0~9까지 중에서 임의의 수를 배열 numArr에 저장한다.
		for(int i=0; i<numArr.length; i++)
		{
			System.out.print(numArr[i] = (int) (Math.random()*10));
		}
		
		System.out.println();
		
		// 오름차순 정렬
		for(int i=0; i<numArr.length-1; i++)
		{
			boolean changed = false;
			
			for(int j=0; j<numArr.length-1-i; j++)
			{
				// 앞의 수가 뒤의 수보다 크면 자리 변경
				if(numArr[j] > numArr[j+1])
				{
					int temp 	= numArr[j];
					numArr[j] 	= numArr[j+1];
					numArr[j+1] = temp;
					changed 	= true;
				}
			}
			
			// 자리가 변경되지 않았다면 반복문 종료
			if(!changed)
			{
				break;
			}
			
			for(int k=0; k<numArr.length; k++)
			{
				System.out.print(numArr[k]);
			}
			
			System.out.println();
		}
	}
}
