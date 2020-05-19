package summary.hyunjin.practice.Chapter09_Lang_Util;

import java.util.Scanner;

//[9-11] 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력하는 프로그램을 작성하시오.
//		예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.
public class Exercise9_11 {
	
	public static Boolean validate(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			return false;
		}else if((1<num1 && num1 <10)||(1<num2 && num2 <10)) {
			System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int from = 0;
		int to = 0;
		

		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			if(num1 == 0 || num2 == 0) {
				System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			}else if((num1<2 || num1 >9)||(num2<2 || num2>9)) {
				System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			}else if((num1>1 && num1<10)||(num2>1 && num2<100)) {
				break;
			}
		}
		
		if(num1>num2) {
			from = num2;
			to = num1;
		}else {
			from = num1;
			to = num2;
		}

		for(int i=from; i<=to; i++)
			for(int j=1; j<10; j++)
				System.out.printf("%d * %d = %d%n", i, j, i*j);
		
	}

}
