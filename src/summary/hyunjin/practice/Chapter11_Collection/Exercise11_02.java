package summary.hyunjin.practice.Chapter11_Collection;

import java.util.*;

public class Exercise11_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); // �ߺ���ҵ��� ���ŵǰ� �������� �ȵ� 2,6,3,7
		TreeSet tset = new TreeSet(set); // ������������ ���ĵȴ�. 2,3,6,7
		Stack stack = new Stack(); // Stack�� �־��� ������ ��������� �ݴ밡 �ȴ�.
		stack.addAll(tset); // TreeSet�� ����� ��� ��Ҹ� stack�� ��´�.
		while(!stack.empty())
		System.out.println(stack.pop()); // stack�� ����� ���� �ϳ��� ������.
	}

}
