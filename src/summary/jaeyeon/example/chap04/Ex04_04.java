package summary.jaeyeon.example.chap04;

public class Ex04_04 {

	public static void main(String[] args) {

		// 1 + (-2) + 3 + (-4) + ... 같은 식으로 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum = 0;
		int count = 0;
		// while (true) {
		for (int i = 1; i <= 5; i++) {
			// int i = 1;
			if (i % 2 == 0) {
				System.out.println(-i);
			} else {
				System.out.println(i);
			}
			sum += i;
		}
//		i++;
		count++;
		//if (sum >= 100)
	//		break;
		// }
		System.out.println(count);
		System.out.println(sum);
	}
}
