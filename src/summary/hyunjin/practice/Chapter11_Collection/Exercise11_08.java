package summary.hyunjin.practice.Chapter11_Collection;
import java.util.*;

//[11-8] ����11-7�� Student4Ŭ������ ����(total)�� �������(schoolRank)�� �����ϱ����� �ν��Ͻ������� �߰��Ͽ���. 
//Student4Ŭ������ �⺻������ �̸�(name)�� �ƴ� ����(total)�� �������� �� ������������ ������ ����, 
//������ �������� �� �л��� ��������� ����ϰ� ��������� �������� �������� �����Ͽ� ����Ͻÿ�.
class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // ����
	int schoolRank; // �������
	
	Student4(String name, int ban, int no, int kor, int eng, int math) {
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
	/*	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 	*/
		if( o instanceof Student4) {
			Student4 s = (Student4)o;
			return s.total-this.total;
		}else {
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
		+","+schoolRank // �����߰�
		;
	}
}

class Exercise11_08 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�.
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
	//	(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
	//	1. �ݺ����� �̿��ؼ� list�� ����� Student4��ü�� �ϳ��� �д´�.
		for(int i=0; i<length; i++) {
			Student4 st = (Student4)list.get(i);
	//	1.1 ����(total)�� ��������(prevTotal)�� ������ ���� ���(prevRank)�� ���(schoolRank)�� �Ѵ�.
			if(st.total == prevTotal) {
				st.schoolRank = prevRank;
	//	1.2 ������ ���� �ٸ���, ���(schoolRank)�� ���� �˸°� ����ؼ� �����Ѵ�. ������ ������ ���ٸ�, �� ���� ����� �������� ���� ����ؾ� �Ѵ�.	(������ ����)
			} else {
				st.schoolRank = i+1;
			}
	//	1.3 ���� ������ ����� ��������(prevTotal)�� �������(prevRank)�� �����Ѵ�.
			prevRank = st.schoolRank;
			prevTotal = st.total;
		}
	
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student4("���ڹ�",2,1,70,90,70));
		list.add(new Student4("���ڹ�",2,2,60,100,80));
		list.add(new Student4("ȫ�浿",1,3,100,100,100));
		list.add(new Student4("���ü�",1,1,90,70,80));
		list.add(new Student4("���ڹ�",1,2,80,80,90));
		calculateSchoolRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	
	}
}
