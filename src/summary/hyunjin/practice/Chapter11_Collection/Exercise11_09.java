package summary.hyunjin.practice.Chapter11_Collection;
import java.util.*;

//[11-9] ����11-8�� Student5Ŭ������ �ݵ��(classRank)�� �����ϱ� ���� �ν��Ͻ������� �߰��Ͽ���. 
//�ݵ���� ����ϰ� �ݰ� �ݵ���� �������� �����Ͽ� ����� ����Ͻÿ�. (1)~(2)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // �������
	int classRank; // �ݵ��
	
	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public int compareTo(Object o) {
		if(o instanceof Student5) {
			Student5 tmp = (Student5)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	
	public String toString() {
			return name
			+","+ban
			+","+no
			+","+kor
			+","+eng
			+","+math
			+","+getTotal()
			+","+getAverage()
			+","+schoolRank
			+","+classRank // �����߰�
			;
		}
}

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		/*		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.		*/
		Student5 s1 = (Student5)o1;
		Student5 s2 = (Student5)o2;
		
		int num = s1.ban- s2.ban;
		if(num==0) 
			num = s1.total- s2.total;
		return num;
	}
}
public class Exercise11_09 {
	public static void calculateClassRank(List list) {
		// ���� �ݺ� �������� ������������ �����Ѵ�.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		
//		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
//		1. �ݺ����� �̿��ؼ� list�� ����� Student5��ü�� �ϳ��� �д´�.
		for(int i=0; i<length; i++) {
			Student5 st = (Student5)list.get(i);
//		1.1 ���� �޶�����,(ban�� prevBan�� �ٸ���) ���� ���(prevRank)�� ���� ����(prevTotal)�� �ʱ�ȭ�Ѵ�.
			if(prevBan != st.ban) {
				prevRank = -1;
				prevTotal = -1;
			}
//		1.2 ����(total)�� ��������(prevTotal)�� ������ ���� ���(prevRank)�� ���(classRank)�� �Ѵ�.
			if(prevTotal == st.total) {
				st.classRank = prevRank;
//		1.3 ������ ���� �ٸ���, ���(classRank)�� ���� �˸°� ����ؼ� �����Ѵ�.������ �����ڿ��ٸ�, �� ���� ����� �������� ���� ����ؾ� �Ѵ�. (������ ����)
			}else {
				st.classRank = i+1;
			}
//		1.4 ���� �ݰ� ������ ����� ���� ��(prevBan),���� ����(prevTotal), ���� ���(prevRank)�� �����Ѵ�.
			prevBan = st.ban;
			prevTotal = st.total;
			prevRank = st.classRank;
		}

	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�.
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student5 st = (Student5)list.get(i);
			if(st.total == prevTotal) {
				st.schoolRank = prevRank;
			} else {
				st.schoolRank = i+1;
			}
			prevRank = st.schoolRank;
			prevTotal = st.total;
		}
	
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student5("���ڹ�",2,1,70,90,70));
		list.add(new Student5("���ڹ�",2,2,60,100,80));
		list.add(new Student5("ȫ�浿",1,3,100,100,100));
		list.add(new Student5("���ü�",1,1,90,70,80));
		list.add(new Student5("���ڹ�",1,2,80,80,90));
	
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}
}
