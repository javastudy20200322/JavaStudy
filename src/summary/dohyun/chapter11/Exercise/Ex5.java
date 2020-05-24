//package summary.dohyun.chapter11.Exercise;
//
//import java.util.*;
//
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor, eng, math;
//
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//
//	int getTotal() {
//		return kor + eng + math;
//	}
//
//	float getAverage() {
//		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
//				+ math + "]" + "," + getTotal() + " ," + getAverage();
//	}
//
//	public int compareTo(Object o) {
//		if (o instanceof Student) {
//			Student tmp = (Student) o;
//
//			return name.compareTo(tmp.name);
//		} else {
//			return -1;
//		}
//	};
//}
//
//class Ex5 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
//		list.add(new Student("전도현", 1, 2, 90, 70, 80));
//		list.add(new Student("김자바", 1, 3, 80, 80, 90));
//		list.add(new Student("이자바", 1, 4, 70, 90, 70));
//		list.add(new Student("안자바", 1, 5, 60, 100, 80));
//
//		Collections.sort(list);
//
//		Iterator it = list.iterator();
//
//		while (it.hasNext())
//			System.out.println(it.next());
//	}
//}
