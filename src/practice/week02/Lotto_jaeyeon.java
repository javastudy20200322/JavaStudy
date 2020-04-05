package practice.week02;

public class Lotto_jaeyeon {
	static int num1 = 0; // 첫 번째 Lotto 당첨번호
	static int num2 = 0; // 두 번째 Lotto 당첨번호
	static int num3 = 0; // 세 번째 Lotto 당첨번호
	static int num4 = 0; // 네 번째 Lotto 당첨번호
	static int num5 = 0; // 다섯 번째 Lotto 당첨번호
	static int num6 = 0; // 여섯 번째 Lotto 당첨번호

	static int bonusNum = 0; // 보너스 번호

	public static void main(String[] args) {
		// 배열을 사용하지 않고 Lotto 당첨번호 추첨 프로그램을 구현하세요.

		while (true) {
			num1 = (int) (Math.random() * 45 + 1);
			num2 = (int) (Math.random() * 45 + 1);
			num3 = (int) (Math.random() * 45 + 1);
			num4 = (int) (Math.random() * 45 + 1);
			num5 = (int) (Math.random() * 45 + 1);
			num6 = (int) (Math.random() * 45 + 1);
			bonusNum = (int) (Math.random() * 45 + 1);

			if (num1 != num2 && num2 != num3 && num3 != num4 && num4 != num5 && num5 != num6 && num6 != bonusNum
					&& bonusNum != num1) {
				break;
			}
		}
		int temp = 0;
		while (true) {

			if (num1 > num2) { // 9 7
				temp = num1;
				num1 = num2;
				num2 = temp;
				temp = 0;
			} else if (num2 > num3) {
				temp = num2;
				num2 = num3;
				num3 = temp;
				temp = 0;
			} else if (num3 > num4) {
				temp = num3;
				num3 = num4;
				num4 = temp;
				temp = 0;
			} else if (num4 > num5) {
				temp = num4;
				num4 = num5;
				num5 = temp;
				temp = 0;
			} else if (num5 > num6) {
				temp = num5;
				num5 = num6;
				num6 = temp;
				temp = 0;
			}

			else if (num1 < num2 && num2 < num3 && num3 < num4 && num4 < num5 && num5 < num6) {
				break;
			} else {
				break;
			}

		}

		System.out.println("Lotto 당첨 번호는..");
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6);
		System.out.println("2등 보너스 번호 : " + bonusNum);
	}
}
