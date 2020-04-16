package summary.haesung.practice.chapter06.example20;

import java.util.Arrays;

/**
 * <pre>
 * Date 		: 2020. 2. 26.
 * Author 		: pureboyz
 *
 * 배열에 담긴 값들을 섞기.
 * 
 * </pre>
 */
public class Example20
{

	public static void main(String[] args)
	{
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] shuffle(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int randomIdx 	= (int) (Math.random()*arr.length);
			int temp 		= arr[i];
			arr[i] = arr[randomIdx];
			arr[randomIdx] = temp;
		}
		
		return arr;
	}

}
