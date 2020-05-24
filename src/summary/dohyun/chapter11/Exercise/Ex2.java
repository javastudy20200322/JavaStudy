package summary.dohyun.chapter11.Exercise;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet set = new HashSet(list);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
/*
 * ArrayList에서 제일 비용이 많이 드는 작업은 = > 첫번째 요소 삭제 
 */
