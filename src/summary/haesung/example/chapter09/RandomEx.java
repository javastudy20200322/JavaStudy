package summary.haesung.example.chapter09;

import java.util.Arrays;
import java.util.Random;

public class RandomEx
{

	public static void main(String[] args)
	{
		// 1을 종자값으로 랜덤 수를 생성한다.
		Random rand1 = new Random(1);
		Random rand2 = new Random(1);
		
		// 같은 종자값으로 랜덤수를 생성하면 순서에 따른 같은 수가 생성된다.
		for(int i=0; i<5; i++)
		{
			System.out.println(rand1.nextInt());
		}
		System.out.println();
		for(int i=0; i<5; i++)
		{
			System.out.println(rand2.nextInt());
		}
		
		System.out.println();
		
		Random rand3 = new Random();
		System.out.println(rand3.nextInt(10));	// 0<=x<10 범위 내에서 정수를 랜덤으로 생성한다.
		
		System.out.println();
		
		int[] result = fillRand(new int[10], new int[] {2, 3, 7, 5});
		
		System.out.println(Arrays.toString(result));
	}
	
	// 배열 arr을 from과 to사이의 값들로 채운다.
	public static int[] fillRand(int[] arr, int from, int to)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = getRand(from, to);
		}
		return arr;
	}
	
	// 배열 arr을 data에 있는 값들로 채운다.
	public static int[] fillRand(int[] arr, int[] data)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = data[getRand(0, data.length-1)];
		}
		return arr;
	}
	
	// from과 to사이의 정수를 반환
	public static int getRand(int from, int to)
	{
		return (int) (Math.random() * (Math.abs(to-from)+1));
	}

}
