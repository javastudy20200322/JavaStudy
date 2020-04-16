package summary.haesung.practice.chapter06.example03;

public class Student
{
	String 	name;	// 학생이름
	int 	ban;	// 반
	int 	no;		// 번호
	int 	kor;	// 국어점수
	int 	eng;	// 영어점수
	int 	math;	// 수학점수
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name 	= name;
		this.ban 	= ban;
		this.no 	= no;
		this.kor 	= kor;
		this.eng 	= eng;
		this.math 	= math;
	}
	
	public String info()
	{
		return this.name + ", " + this.ban + ", " + this.no
				+ ", " + this.kor + ", " + this.eng + ", " + this.math
				+ ", " + getTotal() + ", " + getAverage();
	}
	
	public int getTotal()
	{
		return kor + eng + math;
	}
	
	public float getAverage()
	{
		return (int) (((float) (getTotal()*10) / 3) + 0.5f) / 10f;
	}
	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name 	= "홍길동";
		s.ban 	= 1;
		s.no 	= 1;
		s.kor 	= 100;
		s.eng 	= 60;
		s.math 	= 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.println();
		System.out.println(s.info());
	}
}
