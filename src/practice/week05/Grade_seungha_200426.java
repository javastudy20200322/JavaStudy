package practice.week05;

import java.util.Scanner;

public class Grade_seungha_200426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int subject = 3;
		
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		
		Student[] studentArr = new Student[cnt];
		
		for (int i=0; i<cnt; i++) {
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int mat = scanner.nextInt();
			studentArr[i] = new Student(name, kor, eng, mat);
		}
		
		studentArr = Grade.sortKor(studentArr);
		studentArr = Grade.sortEng(studentArr);
		studentArr = Grade.sortMat(studentArr);
		studentArr = Grade.sortName(studentArr);
		
		for (int i=0; i<cnt; i++) {
			System.out.println(studentArr[i].getName());
		}
		
		scanner.close();
	}
}
	
class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
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
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}

/* 성적을 정렬하는 용도로 만든 singleton class */
class Grade {
	
	private static Grade grade = new Grade();
	
	private Grade() {}
	
	/* singleton pattern */
	static Grade getInstance() {
		if (grade==null) grade = new Grade();
		return grade;
	}
	
	/* 정렬 관련 메서드 */
	/* 국어 점수 내림차순 */
	static Student[] sortKor(Student[] studentArr) {
		/* 버블 정렬, 내림차순 */
		for (int i=studentArr.length-1; i>0; i--) {
			for (int j=studentArr.length-1; j>studentArr.length-1-i; j--) {
				if (studentArr[j].getKor()>studentArr[j-1].getKor()) {
					Student tmp = studentArr[j];
					studentArr[j] = studentArr[j-1];
					studentArr[j-1] = tmp;
				}
			}
		}
		return studentArr;
	}
	
	/* 영어 점수 오름차순 */
	static Student[] sortEng(Student[] studentArr) {
		/* 버블 정렬, 오름차순 */
		for (int i=0; i<studentArr.length-1; i++) {
			for (int j=0; j<studentArr.length-1-i; j++) {
				if (studentArr[j].getKor()==studentArr[j+1].getKor()) {
					if (studentArr[j].getEng()>studentArr[j+1].getEng()) {
						Student tmp = studentArr[j];
						studentArr[j] = studentArr[j+1];
						studentArr[j+1] = tmp;
					}
				}
			}
		}
		return studentArr;
	}
	
	/* 수학 점수 오름차순 */
	static Student[] sortMat(Student[] studentArr) {
		/* 버블 정렬, 내림차순 */
		for (int i=studentArr.length-1; i>0; i--) {
			for (int j=studentArr.length-1; j>studentArr.length-1-i; j--) {
				if (studentArr[j].getKor()==studentArr[j-1].getKor() && studentArr[j].getEng()==studentArr[j-1].getEng()) {
					if (studentArr[j].getMat()>studentArr[j-1].getMat()) {
						Student tmp = studentArr[j];
						studentArr[j] = studentArr[j-1];
						studentArr[j-1] = tmp;
					}
				}
			}
		}
		return studentArr;
	}
	
	/* 이름 사전순 */
	static Student[] sortName(Student[] studentArr) {
		/* 버블 정렬, 오름차순 */
		for (int i=0; i<studentArr.length-1; i++) {
			for (int j=0; j<studentArr.length-1-i; j++) {
				for (int k=0; k<(studentArr[j].getName().length()<studentArr[j+1].getName().length()?studentArr[j].getName().length():studentArr[j+1].getName().length()); k++) {
					if (studentArr[j].getKor()==studentArr[j+1].getKor() && studentArr[j].getEng()==studentArr[j+1].getEng() && studentArr[j].getMat()==studentArr[j+1].getMat()) {
						if (studentArr[j].getName().charAt(k)<studentArr[j+1].getName().charAt(k)) {
							break;
						} else if (studentArr[j].getName().charAt(k)>studentArr[j+1].getName().charAt(k)) {
							Student tmp = studentArr[j];
							studentArr[j] = studentArr[j+1];
							studentArr[j+1] = tmp;
							break;
						} else if (k==(studentArr[j].getName().length()>studentArr[j+1].getName().length()?studentArr[j].getName().length():studentArr[j+1].getName().length()) && studentArr[j].getName().length()>studentArr[j+1].getName().length()) {
							Student tmp = studentArr[j];
							studentArr[j] = studentArr[j+1];
							studentArr[j+1] = tmp;
						}
					}
				}
			}
		}
		return studentArr;
	}
}