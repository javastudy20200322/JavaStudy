package summary.jaeyeon.example.chap05;

public class Q7 {

	public static void main(String[] args) {
		//다시풀어보기
		if (args.length != 1) {
			System.out.println("USAGE : java Q7 3120");
			System.exit(0);
		}

		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);

		System.out.println("money = " + money);

		int[] coinUnit = { 500, 100, 50, 10 };// 동전의 단위
		int[] coin = { 5, 5, 5, 5 };// 단위별 동전의 갯수
		// int money = 3710;
		int five_hundred = 0;
		int one_hundred = 0;
		int fifty = 0;
		int ten = 0;
		int change = 0;
		System.out.println("money = " + money);

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			/**
			 * 아래의 로직에 맞게 코드를 작성하시오 1. 금액(money) 을 동전단위로 나눠서 필요한 동전의 갯수(coinNum)를 구한다. 2. 배열
			 * coin 에서 coinNum 만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin 에 있는 만큼만 뺀다. 3. 금액에서 동전의
			 * 갯수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */
			// System.out.println(coinUnit[i]);
			if (coinUnit[i] == 500) {
				change = money % coinUnit[i];
				five_hundred = money / coinUnit[i];
				money = change;
			} else if (coinUnit[i] == 100) {
				change = money % coinUnit[i];
				one_hundred = money / coinUnit[i];
				money = change;
			} else if (coinUnit[i] == 50) {
				change = money % coinUnit[i];
				fifty = money / coinUnit[i];
				money = change;
			} else {
				change = money % coinUnit[i];
				ten = money / coinUnit[i];
				money = change;
			}

		}
		System.out.println("500원 : " + five_hundred);
		System.out.println("100원 : " + one_hundred);
		System.out.println("50원 : " + fifty);
		System.out.println("10원 : " + ten);

	}

}
