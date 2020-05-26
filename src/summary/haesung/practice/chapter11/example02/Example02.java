package summary.haesung.practice.chapter11.example02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 다음 코드의 실행결과를 적으시오.
 * </pre>
 */
public class Example02
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set 	= new HashSet(list);	// 중복제거
		TreeSet tset 	= new TreeSet(set);		// 오름차순 정렬
		Stack 	stack 	= new Stack();
		
		stack.addAll(tset);
		
		while(!stack.empty())
		{
			// stack에 저장된 순서의 역순으로 출력
			System.out.println(stack.pop());
		}
		
		// 7 > 6 > 3 > 2
	}

}
