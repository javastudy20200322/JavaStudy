package summary.jaeyeon.example.chap12_GEA;

import java.util.ArrayList;

/*
 * 두 개의 ArrayList 를 매개변수로 받아서,
 * 하나의 새로운 ArrayList 로 병합하는 메서드이다.
 * 이를 지네릭(Generic) 메서드로 변경하시오
 */
public class Q4 {
	
	/*
	public static ArrayList<? extends Fruit> merge2(
			ArrayList<? extends Fruit> list3,ArrayList<? extends Fruit> list4){
		
		ArrayList<? extends Fruit> newList2 = new ArrayList<>(list3);
		
		newList2.addAll(list4);
		return newList;
	}
	*/
	
	public static <T extends Fruit> ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2) {

		ArrayList<T> newList = new ArrayList<>(list);

		newList.addAll(list2);

		return newList;

	}
	

	

}
