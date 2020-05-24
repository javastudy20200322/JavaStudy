package summary.haesung.example.chapter11.example01;

import java.util.ArrayList;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이다.
 * 코드를 완성하여 실행결과와 같은 결과를 출력하시오.
 * 
 * [Hint] ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라.
 * </pre>
 */
public class Example01
{

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		ArrayList kyo 	= new ArrayList();
		ArrayList cha 	= new ArrayList();
		ArrayList hap 	= new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		// Code Start..
		
		// 교집합
		// kyo에 list1을 넣고, list2와 공통된 요소만 남기고 모두 제거.
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		// 차집합
		// cha에 list1을 넣고, ㅣlist2와 공통된 요소를 모두 제거.
		cha.addAll(list1);
		cha.removeAll(list2);
		
		// 합집합
		// hap에 cha를 넣고, list2를 넣는다.
		hap.addAll(cha);
		hap.addAll(list2);
		
		// Code end..
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println("kyo : " + kyo);
		System.out.println("cha : " + cha);
		System.out.println("hap : " + hap);
	}

}
