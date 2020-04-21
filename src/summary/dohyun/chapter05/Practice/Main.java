package summary.dohyun.chapter05.Practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
//		ex6();
//		ex7();
//		ex8();  어렵누
//		ex9(); 솔직히 모르겠음 잘
//		ex10();
//		ex11();
//		ex12();
//		ex13();

	}

	public static void ex1() {
		// int[] arr[];
		// int[] arr = {1,2,3};
		// int[] arr = new int[5];
		// int[] arr = new int[5]{1,2,3,4,5}; //배열이 초기화하며넛 생성자 사용 ㄴㄴㄴ
//		  int arr[5]; //안됌 크기는 생성자와 함께정의
		// int[] arr[] = new int[3][];
		//
	}

	public static void ex2() {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 } };
		System.out.println(arr.length);
	}

	public static void ex3() {

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);

	}

	public static void ex4() {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int total = 0;
		float average = 0;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				average = total / (float) (arr.length * arr[0].length);
			}

		System.out.println("total = " + total);
		System.out.println("average = " + average);

	}

	public static void ex5() {

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;

		}

		// 배열 ballArr의 앞에서 3개의 수 를 배열 ball3로 복사한다.

		System.arraycopy(ballArr, 0, ball3, 0, 3);

		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

	public static void ex6() {
		int[] coinUnit = { 500, 100, 50, 10 };
		int cnt = 0;
		int money = 2680;
		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			cnt = money / coinUnit[i];
			money = money % coinUnit[i];
			System.out.printf("%3d원 : %3d", coinUnit[i], cnt);
			System.out.println("");
		}

	}

	public static void ex7() {
		int money = 3170;

		System.out.println("money : " + money);

		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			coinNum = money / coinUnit[i];

			if (coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}

			money -= coinNum * coinUnit[i];

			System.out.println(coinUnit[i] + "원 :" + coinNum);
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}

		System.out.println("= 남은 동전의 갯수 =");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + coin[i]);
		}
	}

	public static void ex8() {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println(counter[i]);

			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void ex9() {
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' }, };
		char[][] result = new char[star[0].length][star.length];

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				int x = j;
				int y = star.length - 1 - i;

				result[x][y] = star[i][j];
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	public static void ex10() {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			// '0' ~ '9' => 48 ~ 57
			if ((48 <= ch) && (ch <= 57)) {
				result += numCode[(int) (ch - 48)];
			}
			// 'a' ~ 'z' => 97 ~ 122
			else {
				result += abcCode[(int) (ch - 97)];
			}
		}

		System.out.println("src : " + src);
		System.out.println("result : " + result);
	}

	public static void ex11() {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];

				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}

			System.out.println();
		}
	}

	public static void ex12() {
		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		Scanner scanner = new Scanner(System.in);

		int score = 0;

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

			String tmp = scanner.next();

			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
				score++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}

		System.out.println("전체 " + words.length + "문제 중 " + score + "문제 맞추셨습니다.");
	}

	public static void ex13() {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();

			for (int j = 0; j < question.length; j++) {
				int index = (int) (Math.random() * question.length);

				char temp = question[index];
				question[index] = question[j];
				question[j] = temp;
			}

			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));

			String answer = scanner.nextLine();

			if (words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			} else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}

}
