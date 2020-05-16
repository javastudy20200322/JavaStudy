package summary.haesung.example.chapter09;

import java.util.Arrays;

public class CloneEx2
{

	public static void main(String[] args)
	{
		int[] arr 		= {1, 2, 3, 4, 5};
		int[] arrClone 	= arr.clone();
		
		arrClone[0] = 6;
		
		// 복제를 했지만 실제로는 서로 다른 객체이므로 기존의 arr은 변하지 않는다.
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
