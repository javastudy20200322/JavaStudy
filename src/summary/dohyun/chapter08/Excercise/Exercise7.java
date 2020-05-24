package summary.dohyun.chapter08.Excercise;
//예상

/*
 * true니깐 1 출력하고 프로그램 종료
 * 
 * 그다음에 콘솔 커서도 멈추는걸로 알고있음
 * 
 */

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit(0)실행 전 입력 하세요 : ");

		int n = sc.nextInt();

		System.exit(0);
		System.out.println("출력이 되나유?");
		int m = sc.nextInt();

	}

}
