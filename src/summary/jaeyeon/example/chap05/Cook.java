package summary.jaeyeon.example.chap05;

/**
 * <pre>
 * Date		: 2020. 4. 12.
 * Author 	: develiberta
 * Refer	: baekjoon, https://www.acmicpc.net/problem/2953
 * Editor   : jaeyeon
 * 
 * 요리 대회 우승자 구하기
 * 
 * 총 5명의 참가자가 있고, 각 참가자에게는 4개의 평가 점수가 주어집니다.
 * 위의 설명에 대응하는 5행 5열의 행렬은 문제에서 다음과 같이 주어집니다.
 * 각 행에 참가자 번호, 평가 점수1, 평가 점수2, 평가점수 3, 평가 점수4가 차례로 주어집니다.
 * 우승자 번호와 그가 얻은 점수를 출력하세요.
 * [예제 출력 예시] 4, 19
 * 
 * ## 출제의도
 * 2차원 배열을 이해합니다.
 * </pre>
 */
public class Cook {
	
	public static void main(String[] args) {
		int[][] cook = {
				{1, 5, 4, 4, 5},
				{2, 5, 4, 4, 4},
				{3, 5, 5, 4, 4},
				{4, 5, 5, 5, 4},
				{5, 4, 4, 4, 5}
		};
	
		/* 알맞은 코드를 넣어 완성하시오. */
		int num=0,max = 0;
		boolean isMax = true;
		for (int i = 0; i < cook.length; i++) {
			int sum = 0; // 개인별 총점
			for (int j = 0; j < cook[i].length-1; j++) {
				// System.out.printf("score[%d][%d] = %d%n", i, j, scoreBoard[i][j]);
				System.out.printf("%5d", cook[i][j+1]);
				// score[i][0] += scoreBoard[i][j];
				// count++;
				sum += cook[i][j+1];
			}
			System.out.printf("%5d ", sum);
			int tmp = sum;
			if (tmp > max) {
				num = cook[i][0];
				max = tmp;
				isMax = false;
			} else {
				isMax = true;
			}
			System.out.println();

		}
		System.out.print(num + "번 째 사람이 "  + max +"점으로 가장 높은 점수를 받았습니다.");
		
	}
}
