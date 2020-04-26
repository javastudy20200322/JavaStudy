package practice.week04;
class Student{
	
	String stuName;
	//int stuNo;
	int day;
	int month;
	int year;
	
	int count;
	
	public Student(String stuName, int day, int month, int year) {

		this.stuName = stuName;
		this.day = day;
		this.month = month;
		this.year = year;
	count ++;
	}
	
	String info() {
		return this.stuName + " "+ this.day + " " + this.month + " " + this.year;
	}
	
}
public class BirthDay_JaeYeon {

	public static void main(String[] args) {
Student a = new Student("Mickey",1,10,1991);
Student b = new Student("Mickey",1,10,1991);
System.out.println(a.year);
	}

}
