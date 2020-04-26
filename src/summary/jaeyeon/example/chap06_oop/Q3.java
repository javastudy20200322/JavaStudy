package summary.jaeyeon.example.chap06_oop;

class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//Q4 메소드
	int getTotal() {
		/*
		 * int sum = 0; sum = kor + eng + math; return sum;
		 */
		return kor + eng + math;
	}
	//Q4 메소드
	float getAverage() {
		/*
		 * float average = 0; average = (float)getTotal()/3; return average;
		 */
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		
	}
	
	
	//Q5 메소드
	String info() {
		return name +","+ban +","+no +","+ kor +","+ eng +","+ math+","+getTotal()+","+getAverage();
		
	}
}


public class Q3 {

}
