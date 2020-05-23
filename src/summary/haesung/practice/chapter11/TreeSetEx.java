package summary.haesung.practice.chapter11;

import java.util.TreeSet;

public class TreeSetEx
{

	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to 	= "d";
		
		set.add("abc");
		set.add("bat");
		set.add("car");
		set.add("disc");
		set.add("elevator");
		set.add("fan");
		
		// subSet()을 이용하여 범위 검색을 할 수 있다.
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to + "zzz"));
		
		// "car"보다 앞에 저장되어있는 값들을 가져온다.
		System.out.println(set.headSet("car"));
		
		// "car"를 포함하여 뒤에 저장되어있는 값들을 가져온다.
		System.out.println(set.tailSet("car"));
	}

}
