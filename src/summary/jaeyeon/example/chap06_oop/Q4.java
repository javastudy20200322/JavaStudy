package summary.jaeyeon.example.chap06_oop;

public class Q4 {

	public static void main(String[] args) {
		Student s = new Student();

		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		//Q5
		System.out.println("info : " + s.info());
	}

}
