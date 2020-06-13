package summary.haesung.example.chapter14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1
{

	public static void main(String[] args)
	{
		// 스트림 생성.
		Stream<Student> studentStream = Stream.of(
					new Student("이자바", 3, 300),
					new Student("김자바", 1, 200),
					new Student("안자바", 2, 100),
					new Student("박자바", 2, 150),
					new Student("소자바", 1, 200),
					new Student("나자바", 3, 290),
					new Student("김자바", 3, 180)
				);
		
		studentStream.sorted(Comparator.comparing(Student::getBan)	// 반별 정렬
				.thenComparing(Comparator.naturalOrder()))			// 기본정렬(성적) 내림차순
//				.thenComparing(Comparator.reverseOrder()))			// 기본정렬(성적) 오름차순
				.forEach(System.out::println);						// 출력
		
		
		
		
		Student[] stuArr = {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("김자바", 3, 180)
		};
		
		Stream<Student> 		stuStream 		= Stream.of(stuArr);
		
		// 기본형 스트림
		IntStream 				stuScoreStream 	= stuStream.mapToInt(Student::getTotalScore);
		
		// 이 놈으로 통계를 낼 수 있네
		IntSummaryStatistics 	stat 			= stuScoreStream.summaryStatistics();
		
		System.out.println("count   : " + stat.getCount());
		System.out.println("cum     : " + stat.getSum());
		System.out.println("average : " + stat.getAverage());
		System.out.println("min     : " + stat.getMin());
		System.out.println("max     : " + stat.getMax());
	}
	
}

class Student implements Comparable<Student>
{
	String 	name;
	int 	ban;
	int 	totalScore;
	
	Student(String name, int ban, int totalScore)
	{
		this.name 		= name;
		this.ban 		= ban;
		this.totalScore = totalScore;
	}
	
	public String toString()
	{
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	String 	getName() 		{ return name; }
	int 	getBan() 		{ return ban; }
	int 	getTotalScore() { return totalScore; }
	
	public int compareTo(Student s)
	{
		return s.totalScore - this.totalScore;
	}
}
