package summary.jaeyeon.example.chap04;

public class Ex04_03 {

	public static void main(String[] args) {

		// 1 + (1 + 2) + (1 + 2 + 3 ) + ... + (1+2+...+ 10) 의 결과를 계산하시오
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("*");
				System.out.print(j);
				sum += j;
			}
			System.out.printf("\t\t%d", sum);
			System.out.println();
		}
		System.out.println(sum);
	}
}
