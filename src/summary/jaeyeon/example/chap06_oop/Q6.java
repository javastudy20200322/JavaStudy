package summary.jaeyeon.example.chap06_oop;

public class Q6 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

/*
 * 두 점 사이의 거리 제곱근 계산은 Math.sqrt(double a)		
 * 피타고라스의 정리!
 */

	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
