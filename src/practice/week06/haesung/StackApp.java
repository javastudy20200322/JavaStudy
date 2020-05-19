package practice.week06.haesung;

import java.util.Scanner;

public class StackApp
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		StringStack stringStack = new StringStack();
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		
		stringStack.stackArr = new String[scanner.nextInt()];
		
		while(true)
		{
			System.out.print("문자열 입력 (종료는 0) >> ");
			
			String inputStr = scanner.next();
			
			if(inputStr.equals("0"))
			{
				break;
			}
			else
			{
				if(!stringStack.push(inputStr))
				{
					try
					{
						throw new IndexOutOfBoundsException();
					}
					catch (IndexOutOfBoundsException e)
					{
						System.out.println("Stack이 가득 차서 넣을 수 없습니다.");
					}
				}
			}
		}
		
		System.out.println(stringStack.toString());
	}

}
