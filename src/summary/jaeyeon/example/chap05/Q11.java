package summary.jaeyeon.example.chap05;

public class Q11 {

	public static void main(String[] args) {

		int[][] score = {

				{ 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 }

		};
		// 열별 총점
				int colTotal1 = 0, colTotal2 = 0, colTotal3 = 0, colTotal4 = 0;

		int[][] result = new int[score.length + 1][score[0].length + 1];

		for (int i = 0; i < score.length; i++) {
			int sum = 0; // 개인별 총점
			colTotal1 += score[i][0];
			colTotal2 += score[i][1];
			colTotal3 += score[i][2];
			
			for (int j = 0; j < score[i].length; j++) {
			
					sum += score[i][j];
				System.out.printf("%4d", score[i][j]);
			}
			System.out.printf("%5d", sum);
			colTotal4 += sum;
			System.out.println();
		}
		System.out.printf("%4d %3d %3d %4d %n", colTotal1,colTotal2 ,colTotal3,colTotal4);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				//System.out.printf("%5d", score[i][j]);
			}
		}
		//System.out.println();
	}

}
