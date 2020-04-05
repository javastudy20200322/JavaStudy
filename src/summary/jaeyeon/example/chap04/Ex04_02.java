package summary.jaeyeon.example.chap04;

public class Ex04_02 {

	public static void main(String[] args) {

		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			//System.out.println(i);
			
			if (i % 2 == 1 && i % 3 == 1) {
				sum += i;
			
			}
			
			
		}
		System.out.println(sum);

	}
}
