package summary.jaeyeon.example.chap05;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {

			char[] question = words[i].toCharArray();

			/*
			 * char 배열 question 에 담긴 문자의 위치를 임의로 바꾼다.
			 * 
			 */
			System.out.printf("Q%d. %s의 정답을 입력하세요>", i + 1, new String(question));

			String answer = scanner.nextLine();

			if (words[i].equals(answer.trim())) {
				System.out.printf("정답입니다.%n%n");

			} else {
				System.out.printf("틀렸습니다.%n%n");
			}

		}
	}

}
