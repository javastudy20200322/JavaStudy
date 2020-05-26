package summary.haesung.example.chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx
{

	public static void main(String[] args)
	{
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		// 오름차순 정렬
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		// 대소문자 구분 없이 오름차순 정렬
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		// 내림차순 정렬
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr : " + Arrays.toString(strArr));
	}

}

class Descending implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		if(o1 instanceof Comparable && o2 instanceof Comparable)
		{
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1;	// -1을 곱해서 역순으로 정렬되도록 한다.
		}
		return -1;
	}
}
