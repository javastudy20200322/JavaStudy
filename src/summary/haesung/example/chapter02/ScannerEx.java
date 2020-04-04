package summary.haesung.example.chapter02;

import java.util.Scanner;

public class ScannerEx
{

	public static void main(String[] args)
	{
		// Scanner 객체 생성.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요. > ");
		
		// 입력대기 상태에 있다가 엔터키를 누르면 입력한 내용이 문자열로 반환된다.
		String input = scanner.nextLine();
		
		// 입력받은 값을 int 타입으로 형변환하여 num 변수에 저장.
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num = %d%n", num);
	}

}
