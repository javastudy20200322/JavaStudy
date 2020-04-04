package summary.haesung.example.chapter04;

import java.util.Scanner;

public class FlowEx07
{

	public static void main(String[] args)
	{
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0) > ");
			
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0)
			{
				System.out.println("프로그램을 종료합니다.");
				break;	// while문을 중지시킨다. -> true를 false로 바꿔주는 작업을 하지 않아도 되구나..
			}
			else if(!(1 <= menu && menu <= 3))
			{
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
	}

}
