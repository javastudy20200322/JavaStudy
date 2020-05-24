package summary.dohyun.chapter11.Exercise;

import java.util.*;

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int total;
	int schoolRank;
	int classRank;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]" + "," + getTotal() + " ," + getAverage() + " ," + schoolRank + " ," + classRank;
	}

		public int compareTo(Object o1, Object o2) {
			if (o1 instanceof Student && o2 instanceof Student) {
				Student tmp = (Student) o1;

				return tmp.total - this.total;
			} else {
				return -1;
			}

		}
	}


public class Ex9 {
	private static void calculateSchoolRank(List<Student> list) {
//Collections.sort(list);// 먼저 list를 총점기준으로 내림차순으로 정렬한다.
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();

// 문제
// 1.list에 저장된 객체를 읽는다
		for (int i = 0; i < length; i++) {
			Student s = list.get(i);

			// 1.1
			if (s.ban != prevBan) {
				prevTotal = -1;
				prevRank = -1;
			}
			if (s.total == prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = i + 1;
			}
			prevBan = s.ban;
			prevRank = s.classRank;
			prevTotal = s.total;
		}

	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));

		calculateSchoolRank(list);

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
