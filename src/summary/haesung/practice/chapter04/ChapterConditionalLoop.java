package summary.haesung.practice.chapter04;

import java.util.Scanner;

/**
 * <pre>
 * Date 		: 2020. 4. 3.
 * Author 		: pureboyz
 *
 * Chapter 4
 * 조건문, 반복문
 * 
 * </pre>
 */
public class ChapterConditionalLoop
{
	public static void main(String[] args)
	{
//		Example1();
//		Example2();
//		Example3();
//		Example3_();	// 답지..
//		Example4();
//		Example4_();	// 답지..
//		Example5();
//		Example6();
//		Example7();
//		Example8();
//		Example9();
//		Example10();
//		Example11();
		Example12();
		Example12_();
//		Example13();
//		Example14();
//		Example15();
	}
	
	

	public static void Example1()
	{
		int x = 15;
		if(10 < x || x < 20)
		{
			System.out.println("true");
		}
		
		char ch = 'x';
		if( !((ch == ' ') || (ch == '\t')) )
		{
			System.out.println("true");
		}
		
		if(ch == 'x' || ch == 'X')
		{
			System.out.println("true");
		}
		
		if('0' <= ch && ch <= '9')
		{
			System.out.println("true");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
		{
			System.out.println("true");
		}
		
		int year = 2020;
		if(((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)))
		{
			System.out.println("true");
		}
		
		boolean powerOn = false;
		if(!powerOn)
		{
			System.out.println("true");
		}
		
		String str = "yes";
		if(str.equals("yes"))
		{
			System.out.println("true");
		}
	}
	
	public static void Example2()
	{
		int sum = 0;
		for(int i=1; i<=20; i++)
		{
			if( ((i % 2) != 0) && ((i % 3) != 0) )
			{
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
	}

	public static void Example3()
	{
		int sum = 0;
		
		for(int i=1; i<=10; i++)
		{
			int temp = 0;
			for(int j=1; j<=i; j++)
			{
				temp += j;
			}
			sum += temp;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public static void Example3_()
	{
		int sum 		= 0;
		int totalSum 	= 0;
		
		for(int i=1; i <=10; i++)
		{
			sum 		+= i;
			totalSum 	+= sum;
		}
		
		System.out.println("totalSum="+totalSum);
	}

	public static void Example4()
	{
		boolean isRun 	= true;
		int 	i 		= 0;
		int 	sum 	= 0;
		
		while(isRun)
		{
			i++;

			int temp = 0;
			if((i % 2) == 0)
			{
				temp = i * (-1);
			}
			else
			{
				temp = i;
			}
			
			sum += temp;
			
			if(100 <= sum)
			{
				isRun = false;
			}
		}
		
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	}
	
	public static void Example4_()
	{
		int i 	= 0;
		int s 	= 1;
		int sum = 0;
		
		for(int j=1; sum<100; j++, s=-s)
		{
			sum += (j * s);
			i = j;
		}
		
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	}
	
	public static void Example5()
	{
		// for문
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// while문
		int i = 0;
		while(i<=10)
		{
			i++;
			
			int j = 0;
			while(j < i)
			{
				j++;
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void Example6()
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=6; j++)
			{
				if((i + j) == 6)
				{
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}
	
	public static void Example7()
	{
		int value = (int) (Math.random()*6) + 1;
		
		System.out.println("value : " + value);
	}
	
	public static void Example8()
	{
		int x = 0;
		int y = 0;
		
		for(x=0; x<=10; x++)
		{
			for(y=0; y<=10; y++)
			{
				if(((2 * x) + (4 * y)) == 10)
				{
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}

	public static void Example9()
	{
		String 	str = "12345";
		int 	sum = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			// '0'의 아스키코드 값 = 48
			sum += (int) str.charAt(i) - 48;
//			sum += (int) str.charAt(i) - '0';	// 답지.
		}
		
		System.out.println("sum : " + sum);
	}
	
	public static void Example10()
	{
		int num = 12345;
		int sum = 0;

		while(num > 0)
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public static void Example11()
	{
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		
		for(int i=0; i<8; i++)
		{
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
	
	public static void Example12()
	{
		int i = 2;
		
		while(i < 10)
		{
			for(int j=1; j<=3; j++)
			{
				for(int k=i; k<=i+2; k++)
				{
					if(k == 10)
					{
						continue;
					}
					System.out.print(k + "*" + j + "=" + (k*j));
					System.out.print("\t");
				}
				System.out.println();
					
			}
			System.out.println();
			System.out.println();
			
			i = i + 3;
		}
		
	}
	
	public static void Example12_()
	{
		for (int i = 1 ; i <= 9 ; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				int x = j + 1 + (i-1)/3*3;
				int y = (i % 3) == 0 ? 3 : (i % 3) ;
				
				// 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
				if(x > 9)
				{
					break;
				}
				
				System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
			}
			
			System.out.println();
			
			if((i % 3) == 0)
			{
				System.out.println();
			}
		}
	}
	
	public static void Example13()
	{
		String 	value 		= "12o34";
		char 	ch 			= ' ';
		boolean isNumber 	= true;
		
		for(int i=0; i<value.length(); i++)
		{
			ch = value.charAt(i);
			if((ch < 48) || (58 < ch))
			{
				isNumber = false;
				break;
			}
		}
		
		if(isNumber)
		{
			System.out.println(value + "는 숫자입니다.");
		}
		else
		{
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
	
	@SuppressWarnings("resource")
	public static void Example14()
	{
		int answer 	= (int) (Math.random()*100) + 1;
		int input 	= 0;
		int count 	= 0;
		
		Scanner s = new Scanner(System.in);
		
		boolean isRun = true;
		
		do
		{
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(input < answer)
			{
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(answer < input)
			{
				System.out.println("더 작은 수를 입력하세요.");
			}
			else
			{
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				isRun = false;
			}
		}
		while(isRun);
	}
	
	public static void Example15()
	{
		int number 	= 12321;
		int tmp 	= number;
		
		int result  = 0;
		
		while(tmp != 0)
		{
			result = (result * 10) + (tmp % 10);
			tmp = tmp / 10;
		}
		
		if(number == result)
		{
			System.out.println(number + "는 회문수 입니다.");
		}
		else
		{
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}

}
