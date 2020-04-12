package summary.jaeyeon.example.chap05;

public class BackJune_Ha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램을 작성하시오.
		/**
		 * [입력] 총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다. 첫 번째 참가자부터 다섯 번째 참가자까지
		 * 순서대로 주어진다. 항상 우승자가 유일한 경우만 입력으로 주어진다.
		 * 
		 * [출력] 첫째 줄에 우승자의 번호와 그가 얻은 점수를 출력한다.
		 * 
		 * 
		 * 
		 */

		// final int SIZE = 5;
		int x = 0, y = 0;

		byte[][] scoreBoard = {
				// 1, 2, 3, 4
				{ 5, 4, 4, 5 }, // 1
				{ 5, 4, 4, 4 }, // 2
				{ 5, 5, 4, 4 }, // 3
				{ 5, 5, 5, 4 }, // 4
				{ 4, 4, 4, 5 }, // 5
		};
		// int[][] max = new int[1][1];
		int max = 0;
		boolean isMax = true;
		for (int i = 0; i < scoreBoard.length; i++) {
			int sum = 0; // 개인별 총점
			for (int j = 0; j < scoreBoard[i].length; j++) {
				// System.out.printf("score[%d][%d] = %d%n", i, j, scoreBoard[i][j]);
				System.out.printf("%5d", scoreBoard[i][j]);
				// score[i][0] += scoreBoard[i][j];
				// count++;
				sum += scoreBoard[i][j];
			}
			System.out.printf("%5d ", sum);
			int tmp = sum;
			if (tmp > max) {
				max = tmp;
				isMax = false;
			} else {
				isMax = true;
			}
			System.out.printf("%d 가 max : %5d 점으로 가장 높은 점수를 얻었습니다.", scoreBoard[i][0], max);
			System.out.println();

		}
	}
}
