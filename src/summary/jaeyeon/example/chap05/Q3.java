package summary.jaeyeon.example.chap05;

public class Q3 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;
		// arr 배열에 담긴 모든 값을 더하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}
}
