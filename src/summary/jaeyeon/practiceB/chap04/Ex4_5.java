package summary.jaeyeon.practiceB.chap04;

import java.util.Scanner;

public class Ex4_5 {
	public static void main(String[] args) {

		int score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력하세요>");

		Scanner scanner = new Scanner(System.in);

		score = scanner.nextInt();

		System.out.printf("당신의 점수는 %d 입니다.%n", score);

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
		} else if (score >= 60) {
			grade = 'D';
			if (score >= 68) {
				opt = '+';
			} else if (score < 64) {
				opt = '-';
			}
		} else {
			grade = 'F';
		}
		System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);

	}
}
