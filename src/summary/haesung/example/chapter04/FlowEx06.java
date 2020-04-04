package summary.haesung.example.chapter04;

import java.util.Scanner;

public class FlowEx06
{

	public static void main(String[] args)
	{
		int input 	= 0;
		int answer 	= 0;
		
		answer = (int) (Math.random()*100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		// do 블럭이 먼저 실행되고 while문의 조건식을 체크한다.
		do
		{
			System.out.print("1과 100사이의 정수를 입력하세요. > ");
			
			input = scanner.nextInt();
			
			if(input > answer)
			{
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}
			else if(input < answer)
			{
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}
		while(input != answer);	// 조건식 뒤에 ;를 꼭 붙여야한다.
		
		System.out.println("정답입니다.");
	}

}
