package summary.haesung.example.chapter11.example08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 문제11-7의 Student클래스에 총점(total)과 전교등수(schoolRank)를 저장하기위한 인스턴스변수를 추가하였다.
 * Student클래스의 기본정렬을 이름(name)이 아닌 총점(total)을 기준으로 한 내림차순으로 변경한 다음,
 * 총점을 기준으로 각 학생의 전교등수를 계산하고 전교등수를 기준으로 오름차순 정렬하여 출력하시오.
 * </pre>
 */
public class Example08
{
	public static void calculateSchoolRank(List list)
	{
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
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
	int total; // 총점
	int schoolRank; // 전교등수
	
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
		// code start..
		if(o instanceof Student)
		{
			Student s = (Student) o;
			return Integer.valueOf(this.total).compareTo(Integer.valueOf(s.total)) * -1;
		}
		// code end..
		
		return -1;
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
		+","+schoolRank;
	}
}
