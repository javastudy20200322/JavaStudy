package summary.haesung.practice.chapter11.example05_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Example05_07
{

	public static void main(String[] args)
	{
		example05();
//		example06();
//		example07();
	}
	
	// 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이 기본 정렬기준이 되도록 하시오.
//	@SuppressWarnings({ "unchecked", "rawtypes" })
	static void example05()
	{
		ArrayList list = new ArrayList();
		
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		
		Collections.sort(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	// 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다.
	// TreeSet이 학생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와
	// 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라.
	// [Hint] TreeSet의 subSet(Object from, Object to)를 사용하라.
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void example06()
	{
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2)
			{
				// code start..
				if((o1 instanceof Student) && (o2 instanceof Student))
				{
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					
					return (int) (s1.getAverage() - s2.getAverage());
				}
				// code end..
				
				return -1;
			}
		});
		
		set.add(new Student("홍길동",1,1,100,100,100));
		set.add(new Student("남궁성",1,2,90,70,80));
		set.add(new Student("김자바",1,3,80,80,90));
		set.add(new Student("이자바",1,4,70,90,70));
		set.add(new Student("안자바",1,5,60,100,80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
	}
	
	// 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static int getGroupCount(TreeSet tset, int from, int to)
	{
		TreeSet tmpSet = new TreeSet();
		
		Iterator it = tset.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			if(o instanceof Student)
			{
				Student s = (Student) o;
				tmpSet.add(s.getAverage());
			}
		}
		
		return tmpSet.subSet((float)from, (float)to).size();
	}
	
	// 다음에 제시된 BanNoAscending클래스를 완성하여,
	// ArrayList에 담긴 Student인스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.
	// (반이 같은 경우 번호를 비교해서 정렬한다.)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static void example07()
	{
		ArrayList list = new ArrayList();
		
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

class Student implements Comparable
{
	String 	name;
	int 	ban;
	int 	no;
	int 	kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name 	= name;
		this.ban 	= ban;
		this.no 	= no;
		this.kor 	= kor;
		this.eng 	= eng;
		this.math 	= math;
	}
	
	int getTotal()
	{
		return kor + eng + math;
	}
	
	float getAverage()
	{
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public String toString()
	{
		return name +","+ban +","+no +","+kor +","+eng +","+math+","+getTotal() +","+getAverage();
	}

	@Override
	public int compareTo(Object o)
	{
		if(o instanceof Student)
		{
			Student s = (Student) o;
			System.out.print("this : " + this.name + ", ");	// this는 추가하는 객체
			System.out.print("s : " + s.name + ", ");		// s는 바로 전에 추가된 객체
			System.out.println(this.name.compareTo(s.name));
			
			// 음수가 리턴되면 this객체의 name이 사전상 앞쪽, 양수가 리턴되면 뒤쪽
			// 음수가 리턴되면 s의 -1번째 index에 있는 객체와 비교
			// 양수가 리턴되면 s의 +1번째 index에 있는 객체와 비교
			return this.name.compareTo(s.name);
		}
		// Ex6에서는 이렇게 되어있네
//		else
//		{
//			return -1;
//		}
		
		// 매개변수로 Student객체를 넣을거라 이쪽으로 빠지진 않지만,
		// Student로 형변환이 되지 않으면 맨 뒤에 저장되도록 1을 return.
		return 1;
	}
}

class BanNoAscending implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		if((o1 instanceof Student) && (o2 instanceof Student))
		{
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			
			int resultBan = Integer.valueOf(s1.ban).compareTo(Integer.valueOf(s2.ban));
			// 반이 다를 때
			if(resultBan != 0)
			{
				return resultBan;
			}
			// 반이 같을 때
			else
			{
				return Integer.valueOf(s1.no).compareTo(Integer.valueOf(s2.no));
			}
		}
		return -1;
	}
}
