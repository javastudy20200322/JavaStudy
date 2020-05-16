package summary.haesung.example.chapter09;

import java.util.*;
import static java.util.Objects.*;

public class ObjectTest
{

	public static void main(String[] args)
	{
		String[][] str2D_1 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.print("str2D_1 = {");
		for(String[] temp : str2D_1)
		{
			System.out.print(Arrays.toString(temp));
		}
		System.out.println("}");
		
		// 2차원 배열을 비교할 때는 Objects.deepEquals를 사용해야한다.
		System.out.println(Objects.equals(str2D_1, str2D_2));		// false
		System.out.println(Objects.deepEquals(str2D_1, str2D_2));	// true
		System.out.println(Arrays.deepEquals(str2D_1, str2D_2));	// true

		// 배열을 비교할 때는 Objects.deepEquals() 또는 Arrays.deepEquals()을 사용하자.
		for(int i=0; i<str2D_1.length; i++)
		{
			System.out.println();
			System.out.println(Objects.equals(str2D_1[i], str2D_2[i]));		// false
			System.out.println(Objects.deepEquals(str2D_1[i], str2D_2[i]));	// true
			System.out.println(Arrays.equals(str2D_1[i], str2D_2[i]));		// true
		}
		
		 System.out.println();
		 
		 System.out.println(isNull(null));	// null 체크
		 System.out.println(nonNull(null));	// not null 체크
		 System.out.println(Objects.hashCode(null));		// null은 hashCode로 0을 리턴한다.
		 System.out.println(Objects.toString(null));
		 System.out.println(Objects.toString(null, "")); 	// 첫번째 매개변수가 null이면 두번째 매개변수를 출력한다.
		 
		 System.out.println();
		 
		 Comparator c = String.CASE_INSENSITIVE_ORDER;	// 대소문자 구분 안하는 비교
		 System.out.println(compare("aa", "bb", c));	// 첫번째 매개변수가 더 작으면 -1, 첫번째 매개변수가 더 크면 1, 같으면 0을 리턴
	}

}
