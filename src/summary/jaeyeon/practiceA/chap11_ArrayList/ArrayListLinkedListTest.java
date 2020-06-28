package summary.jaeyeon.practiceA.chap11_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList(200000);
		LinkedList ll = new LinkedList();

		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("" + add1(al));
		System.out.println();
		System.out.println();
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	public static long remove1(List list) {

		long start = System.currentTimeMillis();

		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();

		return end - start;

	}
}
