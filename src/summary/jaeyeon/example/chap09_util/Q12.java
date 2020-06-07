package summary.jaeyeon.example.chap09_util;

public class Q12 {
	static int getRand(int from, int to) {
		int tmp = 0;
		return tmp;
		
		/*(1) getRand 메서드를 작성하시오
		 * 주어진 범위(from ~ to) 에 속한 임의의 정수값을 반환한다.
		 * (양쪽 경계 값 모두 범위에 포함)
		 * from 의 값이 to 의 값 보다 클 경우에도 처리되어야한다.
		 * 
		 * Math.random() 과 절대값을 반환하는 Math.abs(int a),
		 * 그리고 둘 중에 작은 값을 반환하는 Math.min(int a, int b) 를 사용하라
		 * 
		 */
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
	}
}
