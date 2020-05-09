package practice.week04;

import java.util.Scanner;

public class Birthday_seungha_200419 {

		public static void main(String[] args) {
			
		/* 입력부 */
		Scanner scanner  = new Scanner(System.in);
		int count = scanner.nextInt();
		Student1[] arrStudent1 = new Student1[count];
		for  (int i=0; i<count; i++) {
			String name = scanner.next();
			int day = scanner.nextInt();
			int month = scanner.nextInt();
			int year = scanner.nextInt();
			arrStudent1[i] = new Student1(name, day, month, year);
		}
		scanner.close();
		
		/* 출력부 */
		System.out.println(Student1.younger(arrStudent1).name);
		System.out.println(Student1.older(arrStudent1).name);
	}
}


class Student1 {
	String name;
	int day;
	int month;
	int year;
	
	Student1() { }
	
	Student1(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	static Student1 younger(Student1[] arrStudent1) {
		Student1 younger = arrStudent1[0];
		for (int i=1; i<arrStudent1.length; i++) {
			if (younger.year < arrStudent1[i].year) {
				younger = arrStudent1[i];
			} else if (younger.year == arrStudent1[i].year && younger.month < arrStudent1[i].month) {
				younger = arrStudent1[i];
			} else if (younger.year == arrStudent1[i].year && younger.month == arrStudent1[i].month && younger.day < arrStudent1[i].day) {
				younger = arrStudent1[i];
			}
		}
 		return younger;
	}
	
	static Student1 older(Student1[] arrStudent1) {
		Student1 older = arrStudent1[0];
		for (int i=1; i<arrStudent1.length; i++) {
			if (older.year > arrStudent1[i].year) {
				older = arrStudent1[i];
			} else if (older.year == arrStudent1[i].year && older.month > arrStudent1[i].month) {
				older = arrStudent1[i];
			} else if (older.year == arrStudent1[i].year && older.month == arrStudent1[i].month && older.day > arrStudent1[i].day) {
				older = arrStudent1[i];
			}
		}
 		return older;
	}
}
