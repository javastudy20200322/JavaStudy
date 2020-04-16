package summary.haesung.practice.chapter06.example23;

import java.util.Arrays;

public class Example23
{
	public static void main(String[] args)
	{
		int[] data = {3, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
	}
	
	
	public static int max(int[] arr)
	{
		if((arr == null) || (arr.length == 0))
		{
			return -999999;
		}
		
		int maxNumber = 0;
		for(int i=0; i<arr.length; i++)
		{
			maxNumber = (maxNumber < arr[i]) ? arr[i] : maxNumber;
		}
		
		return maxNumber;
	}
}
