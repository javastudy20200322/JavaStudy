package summary.dohyun.chapter11.Example;

import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {

	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

}
