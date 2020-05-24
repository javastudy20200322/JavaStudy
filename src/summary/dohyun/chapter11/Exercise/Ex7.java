//package summary.dohyun.chapter11.Exercise;
//
//import java.util.Comparator;
//import java.util.TreeSet;
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
//	class BanNoAscending implements Comparator {
//		@Override
//		public int compare(Object o1, Object o2) {
//			if (o1 instanceof Student && o2 instanceof Student) {
//				Student s1 = (Student) o1;
//				Student s2 = (Student) o2;
//
//				int result = s1.ban - s2.ban;
//
//				if (result == 0) {
//					return s1.no - s2.no;
//				}
//				return result;
//			}
//			return -1;
//		}
//	}
//} // 클래스 스튜던트
//
//public class Ex7 {
//
//	public static void main(String[] args) {
//		TreeSet set = new TreeSet(new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
//
//	}
//}