import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[][] score = new String[n][4];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				score[i][j] = sc.next();
			}
		}
		// a.Compareto 일때 a<b이면 -1 =이면 0 a>b 이 양수 리턴

		Arrays.sort(score, new Comparator<String[]>() {
			@Override
			public int compare(String a[], String b[]) {

				if (Integer.valueOf(a[1]) > Integer.valueOf(b[1])) {
					return -1;
				} else if (Integer.valueOf(a[1]) == Integer.valueOf(b[1])) {
					if (Integer.valueOf(a[2]) == Integer.valueOf(b[2])) {
						if (Integer.valueOf(a[3]) == Integer.valueOf(b[3])) {
							return a[0].compareTo(b[0]); // compareTO하면 유니코드 문법에 맞춰서 사전상 먼저 오는애 리턴
						} // 조건2. 국어점수와 영어점수가 같으면 수학 점수가 감소하는 순서로..
							// 기준 수가 다음 수보다 작을경우 -1을 반환해 다음 수가 먼저 온다.
						return Integer.compare(Integer.valueOf(b[3]), Integer.valueOf(a[3]));
					}
					return Integer.compare(Integer.valueOf(a[2]), Integer.valueOf(b[2]));
				}
				else
					return 1;
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println(score[i][0]);
		}

	}
}