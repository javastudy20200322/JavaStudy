package summary.haesung.example.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx
{

	public static void main(String[] args)
	{
		// List에 없고, ArrayList에만 있는 메소드를 사용하는게 아니라면, 참조변수의 타입을 List로 하는 것이 좋다.
		// ArrayList를 LinkedList로 바꿔야 한다면 선언문 하나만 바꾸면 나머지는 검토하지 않아도 되기 때문이다.
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// 컬렉션에 저장된 각 요소에 접근하는 기증을 가짐.
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// Iterator는 재사용이 안된다.
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println("@@@" + obj);	// 실행해보면 "@@@"가 출력된 행이 없다.
		}
		
		System.out.println();
		
		// ListIterator는 양방향으로 이동이 가능하다.
		ListIterator lit = list.listIterator();
		
		// 순방향
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println();
		
		// 역방향
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}

}
