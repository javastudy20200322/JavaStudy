package summary.haesung.example.chapter05;

import java.util.Arrays;

public class ArrayEx02
{

	public static void main(String[] args)
	{
		int[] 	iArr1 = new int[10];						// 길이가 10인 배열 선언.
		int[] 	iArr2 = new int[10];
		int[] 	iArr3 = new int[] {100, 95, 80, 70, 60};	// 길이를 지정하지 않고 초기화.
		int[] 	iArr4 = {100, 95, 80, 70, 60};				// new int[]를 생략해도 가능하다.
		char[] 	chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++)
		{
			iArr1[i] = i + 1;	// 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i<iArr2.length; i++)
		{
			iArr2[i] = (int) (Math.random()*10) + 1;	// 1~10의 값을 배열에 저장.
		}
		
		for(int i=0; i<iArr1.length; i++)
		{
			System.out.print(iArr1[i] + ",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));	// 배열을 출력하는 방법.
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);					// 변수를 바로 출력하면 배열의 주소값이 출력된다.
		System.out.println(chArr);
	}

}
