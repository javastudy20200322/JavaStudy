package summary.jaeyeon.example.chap06_oop;

public class Q24 {

	static int abs(int value) {
		// int temp = 0;

		// 주어진 값의 절대값을 반환한다.

		// temp = Math.abs(value);

		return Math.abs(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 5;
		System.out.println(value + " 의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + " 의 절대값 : " + abs(value));

	}

}
