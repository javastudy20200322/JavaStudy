//package summary.dohyun.chapter11.Example;
//
//import java.util.*;
//
//public class Example1 {
//	public static void main(String[] args) {
//
//		ArrayList<Integer> list1 = new ArrayList(10);
//
//		list1.add(new Integer(5));
//		list1.add(new Integer(4));
//		list1.add(new Integer(0));
//		list1.add(new Integer(2));
//		list1.add(new Integer(1));
//		list1.add(new Integer(3));
//
//		list1.add(6);
//
//		ArrayList list2 = new ArrayList(list1.subList(1, 4));
//		print(list1, list2);
//
//		Collections.sort(list1);
//		Collections.sort(list2);
//		print(list1, list2);
//
//		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
//
//		list2.add("B");
//		list2.add("C");
//		list2.add(3, "A");
//		print(list1, list2);
//
//		list2.set(3, "AA");
//		print(list1, list2);
//
//		// list1 2 에서 겹치는 곳만 남기고 나머지 삭제
//		System.out.println(list1.retainAll(list2));
//		print(list1, list2);
//
//	}
//
//	static void print(ArrayList<Integer> list1, ArrayList list2) {
//		System.out.println("list1 :" + list1);
//		System.out.println("list2 :" + list2);
//		System.out.println();
//
//	}
//
//}
