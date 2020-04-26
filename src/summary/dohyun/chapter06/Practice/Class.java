package summary.dohyun.chapter06.Practice;

public class Class {

	public static void main(String[] args) {
//		ex1()
//		ex2();
//		ex3();
//		ex4();
//		ex5();
//		ex6();
	}

	public static void ex1() {
		class SutdaCard {
			int num;
			boolean isKwang;
		}
	}

	public static void ex2() {
		class SutdaCard {
			int num;
			boolean isKwang;

			public SutdaCard() {
				this.num = 1;
				this.isKwang = true;
			}

			public SutdaCard(int num, boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
			}

			String info() {
				return num + (isKwang ? "K" : "");

			}
		}

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

	public static void ex3() {
		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
		}
	}

	public static void ex4() {
		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;

			public int getTotal() {
				return kor + eng + math;
			}

			public float getAverage() {
				return (float) getTotal() / 3;
			}
		}
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름 : " + s.name);
		System.out.println("총점 :" + s.getTotal());
		System.out.printf("평균 : " + s.getAverage());
	}

	public static void ex5() {

		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;

			public Student(String name, int ban, int no, int kor, int eng, int math) {
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
			}

			public int getTotal() {
				return kor + eng + math;
			}

			public float getAverage() {
				return (float) getTotal() / 3;
			}

			public String info() {
				return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + ","
						+ getAverage();
			}
		}

		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());

	}
}

//	public void ex6() {
//
//	static double getDistance(int x, int y, int x1, int y1) {
//		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1))
//}
