package practice.week05.jaeyeon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class StudentJY implements Comparable<StudentJY> {
	private String name;
	private int kor;
	private int math;
	private int eng;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor > 100 || kor < 1) {
			return;
		}

		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math > 100 || math < 1) {
			return;
		}

		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng > 100 || eng < 1) {
			return;
		}

		this.eng = eng;
	}

	StudentJY() {
	}

	StudentJY(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	@Override
	public int compareTo(StudentJY o) {

		if (this.kor > o.kor) {
			return 1;

		} else if (this.kor == o.kor) {
			if (this.eng < o.eng) {
				return 1;
			} else if (this.eng == o.eng) {
				if (this.math > o.math) {
					int nameLength = 0;
					if (this.name.length() >= o.name.length()) {
						nameLength = o.name.length();
					} else {
						nameLength = this.name.length();

					}
					
					for(int i = 0; i<nameLength; i++) {
						if(this.name.charAt(i) < o.name.charAt(i)) {
							return 1;
						}else if(this.name.charAt(i)> o.name.charAt(i)){
							return -1;
						}
					}
					
				}
			}
		}

		return -1;
	}


}

public class Score_jaeyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<StudentJY> arr = new ArrayList<StudentJY>();

		for (int i = 0; i < num; i++) {
			StudentJY st = new StudentJY();
			st.setName(sc.next());
			st.setKor(sc.nextInt());
			st.setEng(sc.nextInt());
			st.setMath(sc.nextInt());

			arr.add(st);
		}

		arr.sort(Comparator.reverseOrder());
		
		for(StudentJY student : arr) {
			System.out.println(student.getName());
		}
		
		
		
	}
}
