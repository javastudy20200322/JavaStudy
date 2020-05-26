package summary.haesung.example.chapter11;

import java.util.Arrays;
import java.util.List;

public class ArraysEx
{

	public static void main(String[] args)
	{
		int[] arr1 = {0, 3, 2, 1, 4};
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);	// 선택한 길이만큼 배열 복사.
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr1, 2, 4);	// 선택한 인덱스범위만 복사.
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = new int[5];
		Arrays.fill(arr4, 4);	// 선택한 숫자로 배열을 채운다.
		System.out.println(Arrays.toString(arr4));
		
		Arrays.sort(arr1);	// 배열을 오름차순으로 정렬한다.
		
		// 선택한 index에 있는 값을 가져오며, 정렬이 되지 않은 배열에 사용하면 정확한 값이 반환되지 않는다.
		int idx = Arrays.binarySearch(arr1,  2);
		System.out.println("idx : " + idx);
		
		// int 배열을 넣으니 원하는 대로 출력이 안됨..
		List list = Arrays.asList(arr1);
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		// 이렇게 넣어도 안됨..
		List list2 = Arrays.asList(new int[] {1, 2, 3, 4, 5});
		for(int i=0; i<list2.size(); i++)
		{
			System.out.println(list2.get(i));
		}
		
		// Integer 배열은 원하는대로 출력이 됨.
		List list3 = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});
		for(int i=0; i<list3.size(); i++)
		{
			System.out.println(list3.get(i));
		}
		
		// 이렇게 넣는것도 가능하다.
		List list4 = Arrays.asList(1, 2, 3, 4, 5);
		for(int i=0; i<list4.size(); i++)
		{
			System.out.println(list4.get(i));
		}
	}

}
