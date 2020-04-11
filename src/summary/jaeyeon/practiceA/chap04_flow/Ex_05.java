package summary.jaeyeon.practiceA.chap04_flow;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		int score = 0;

		char grade = ' ', opt = '0';

		System.out.print("점수를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);

		score = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}

		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}

		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score < 74) {
				opt = '-';
			}

		} else {
			grade = 'D';
		}

		System.out.println("당신의 학점은 " + grade + " 입니다.");

	}

}
