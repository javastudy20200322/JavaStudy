package summary.jaeyeon.example.chap08_exception;

import java.util.Scanner;

class Q8 {
	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer 에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : ");

			
			/*사용자로부터 값을 입력받는 경우에는 유효성 검사를 철저하게 해야한다.
			 * 예외적으로 사용자가 성경문구를 db요청문에 넣어버리는 바람에
			 * 서버가 제대로 처리하지 못하고 뻗어버리는 사태가 발생하기도 함.
			 */
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요");
				continue;
			}

			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break; // do~while 문을 벗어난다.
			}

		} while (true);

	}

}
