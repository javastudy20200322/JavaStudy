package summary.haesung.example.chapter11.example09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 문제11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수를 추가하였다.
 * 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.
 * (1)~(2)에 알맞은 코드를 넣어 완성하시오.
 * </pre>
 */
public class Example09
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void calculateClassRank(List list)
	{
		// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		int count = 1;
		
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오.
		1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
		1.1 반이 달라지면,(ban과 prevBan이 다르면)
		이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화한다.
		1.2 총점(total)이 이전총점(prevTotal)과 같으면
		이전 등수(prevRank)를 등수(classRank)로 한다.
		1.3 총점이 서로 다르면,
		등수(classRank)의 값을 알맞게 계산해서 저장한다.
		이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야 한다.
		(실행결과 참고)
		1.4 현재 반과 총점과 등수를 이전 반(prevBan),
		이전 총점(prevTotal), 이전 등수(prevRank)에 저장한다.
		*/
		
		// code start..
		for(int i=0; i<list.size(); i++)
		{
			Object o = list.get(i);
			if(o instanceof Student)
			{
				Student s = (Student) o;
				
				// 1
				if(s.ban != prevBan)
				{
					prevRank 	= -1;
					prevTotal 	= -1;
					count 		= 1;
				}
				
				// 2
				if(s.getTotal() == prevTotal)
				{
					s.classRank = prevRank;
				}
				// 3
				else
				{
					s.classRank = count;
					count++;
				}
				
				// 4
				prevBan 	= s.ban;
				prevRank 	= s.classRank;
				prevTotal 	= s.getTotal();
			}
		}
		// code end..
	}
	
	public static void calculateSchoolRank(List list)
	{
		// Example08에서 작성한 코드를 가져옴.
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		// code start..
		for(int i=0; i<list.size(); i++)
		{
			Object o = list.get(i);
			if(o instanceof Student)
			{
				Student s = (Student) o;
				
				// 1
				if(s.getTotal() == prevTotal)
				{
					s.schoolRank = prevRank;
				}
				// 2
				else
				{
					s.schoolRank = i + 1;
				}
				
				// 3
				prevRank 	= s.schoolRank;
				prevTotal 	= s.getTotal();
			}
		}
		// code end..
	}

}

class Student implements Comparable
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수
	
	Student(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	
	int getTotal()
	{
		return total;
	}
	
	float getAverage()
	{
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o)
	{
		if(o instanceof Student)
		{
			Student tmp = (Student)o;
			return tmp.total - this.total;
		}
		else
		{
			return -1;
		}
	}
	
	public String toString()
	{
		return name
			+","+ban
			+","+no
			+","+kor
			+","+eng
			+","+math
			+","+getTotal()
			+","+getAverage()
			+","+schoolRank
			+","+classRank;
	}
}

class ClassTotalComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		if((o1 instanceof Student) && (o2 instanceof Student))
		{
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			
			return Integer.valueOf(s1.ban).compareTo(Integer.valueOf(s2.ban));
		}
		
		return -1;
	}
}
