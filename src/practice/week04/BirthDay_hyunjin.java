package practice.week04;

import java.util.Scanner;


class ClassMate {
	int num;
	String name;
	int dd;
	int mm;
	int yyyy;
	
	public void Sort(ClassMate[] cm) {

		
		ClassMate tmp = new ClassMate();
		for(int i=0; i<cm.length-1; i++) {
			for(int j=i+1; j<cm.length; j++) {				
				if(cm[i].yyyy < cm[j].yyyy) {
					tmp.name = cm[i].name;
					tmp.dd = cm[i].dd;
					tmp.mm = cm[i].mm;
					tmp.yyyy = cm[i].yyyy;
					
					cm[j].name = cm[i].name;
					cm[j].dd = cm[i].dd;
					cm[j].mm = cm[i].mm;
					cm[j].yyyy = cm[i].yyyy;
					
					cm[i].name = tmp.name;
					cm[i].dd = tmp.dd;
					cm[i].mm = tmp.mm;
					cm[i].yyyy = tmp.yyyy;
				}
			}
		}
		
		System.out.println(cm[0] + " / " + cm[1]);
	}
	
	
}

public class BirthDay_hyunjin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수?");
		int num = sc.nextInt();
		
		ClassMate[] cm = new ClassMate[num];
					
		System.out.println("학생정보?");
		for(int i=0; i<num; i++) {
			cm[i].name =sc.next();
			cm[i].dd = sc.nextInt();
			cm[i].mm = sc.nextInt();
			cm[i].yyyy = sc.nextInt();
			
		}				
	}

}