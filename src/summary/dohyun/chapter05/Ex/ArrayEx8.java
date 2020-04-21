package chapter05.Ex;

public class ArrayEx8 {

	public static void main(String[] args) {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1; // ball[0]에 1이 저장된다.

		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
	}
}
