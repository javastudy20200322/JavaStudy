package summary.haesung.example.chapter11;

import java.util.*;

public class ArrayListEx1
{

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// list1의 1~4인덱스 사이(index4는 제외, 실제로는 1,2,3 인덱스 값을 가져온다.)의 값들을 가져와서 list2를 생성.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// list의 값을 오름차순으로 정렬한다.
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		// list1에 list2의 값들이 모두 들어있는지 확인.
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		// B, C는 마지막 index에 추가하고, A는 3번째 인덱스에 추가한다.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// list2의 3번째 인덱스의 값을 AA로 변경한다.
		list2.set(3, "AA");
		print(list1, list2);
		
		// list1에서 list2와 겹치는 값들만 남기고 삭제한다.
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		for(int i=list2.size()-1; i>=0; i--)
		{
			// list1에 list2의 i인덱스의 값이 존재한다면, list2에서 해당 값을 삭제한다.
			if(list1.contains(list2.get(i)))
			{
				list2.remove(i);
			}
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2)
	{
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
