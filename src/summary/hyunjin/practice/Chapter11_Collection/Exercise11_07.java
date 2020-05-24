package summary.hyunjin.practice.Chapter11_Collection;

import java.util.*;

//[11-7] ������ ���õ� BanNoAscendingŬ������ �ϼ��Ͽ�, ArrayList�� ��� Student�ν��Ͻ����� ��(ban)�� ��ȣ(no)�� 
//�������� ���ĵǰ� �Ͻÿ�.(���� ���� ��� ��ȣ�� ���ؼ� �����Ѵ�.)

class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
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
		;
	}
} // class Student

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
	/*	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.	*/
		if(o1 instanceof Student3 && o2 instanceof Student3) {
			Student3 s1 = (Student3)o1;
			Student3 s2 = (Student3)o2;
			
			int num = s1.ban-s2.ban;

			if(num==0) {
				return s1.no - s2.no;
			}
			
			return num;
		}
		
		return -1;
	}
}

public class Exercise11_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student("���ڹ�",2,1,70,90,70));
		list.add(new Student("ȫ�浿",1,3,100,100,100));
		list.add(new Student("���ü�",1,1,90,70,80));
		list.add(new Student("���ڹ�",1,2,80,80,90));
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());

	}

}
