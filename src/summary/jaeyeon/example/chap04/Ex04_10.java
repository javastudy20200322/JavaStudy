package summary.jaeyeon.example.chap04;

import java.util.Scanner;

public class Ex04_10 {

	public static void main(String[] args) {

		
		/**
		 * 숫자맞히기 게임
		 * 1~100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞히면 게임이 끝난다.
		 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 알려준다.
		 * 사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇번만에 숫자를 맞혔는지 알려준다.
		 */
		
		int answer; // answer 에 적당한 코드를 작성하세요
		
		int input =0;
		
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			count ++;
			System.out.print("1과 100 사이의 값을 입력하세요. : ");
			input = scanner.nextInt();
			
			// 나머지 코드를 작성하세요
			
			
		}
		while(true);
		

	}
}
