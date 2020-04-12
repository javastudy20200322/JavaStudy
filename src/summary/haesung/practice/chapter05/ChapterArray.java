package summary.haesung.practice.chapter05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 * Date 		: 2020. 4. 8.
 * Author 		: pureboyz
 *
 * Chapter 5
 * 배열
 * 
 * </pre>
 */
public class ChapterArray
{
	public static void main(String[] args)
	{
//		Example1();
//		Example2();
//		Example3();
//		Example4();
//		Example5();
//		Example6();
//		Example6_();
//		Example7();
//		Example8();
//		Example9();
//		Example10();
		Example11();
//		Example12();
//		Example13();
	}

	
	
	public static void Example1()
	{
		// int[] arr[];
		// int[] arr = {1, 2, 3,};
		// int[] arr = new int[5];
//		 int[] arr = new int[5]{1,2,3,4,5};		// 배열의 선언과 동시에 배열의 값을 초기화할 때는 배열의 길이를 지정하지 않는다.
//		 int arr[5];							// 배열의 타입이나 변수명에서 길이를 지정할 수 없다.
//		 int[] arr[] = new int[3][];
//		 System.out.println(Arrays.deepToString(arr));
	}
	
	public static void Example2()
	{
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10},
				{20, 20, 20, 20},
				{30, 30}
		};
		
		System.out.println("arr[3].length : " + arr[3].length);
	}
	
	public static void Example3()
	{
		int[] 	arr = {10, 20, 30, 40, 50};
		int 	sum = 0;
		
		for(int i : arr)
		{
			sum += i;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public static void Example4()
	{
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
		};
		
		int 	total 	= 0;
		float 	average = 0;
		
		int 	count 	= 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				count++;
				total += arr[i][j];
			}
		}
		average = total / (float) count;
		
		System.out.println("total : " + total);
		System.out.println("average : " + average);
	}
	
	public static void Example5()
	{
		int[] ballArr 	= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 	= new int[3];
		
		for(int i=0; i<ballArr.length; i++)
		{
			int j 	= (int) (Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp 		= ballArr[i];
			ballArr[i] 	= ballArr[j];
			ballArr[j] 	= tmp;
		}
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);

		System.out.print("ball3 배열 : ");
		for(int i=0; i<ball3.length; i++)
		{
			System.out.print(ball3[i]);
		}
	}
	
	public static void Example6()
	{
		int[] 	coinUnit 	= {500, 100, 50, 10};
		int 	money 		= 2680;
		
		System.out.println("money : " + money);
		
		for(int i=0; i<coinUnit.length; i++)
		{
			int count = money / coinUnit[i];
			
			money 		= money % coinUnit[i];
			coinUnit[i] = count;
		}
		
		System.out.println("500원 : " + coinUnit[0]);
		System.out.println("100원 : " + coinUnit[1]);
		System.out.println("50원 : " + coinUnit[2]);
		System.out.println("10원 : " + coinUnit[3]);
	}
	
	public static void Example6_()
	{
		int[] 	coinUnit 	= {500, 100, 50, 10};
		int 	money 		= 2680;
		
		System.out.println("money : " + money);
		
		for(int i=0; i<coinUnit.length; i++)
		{
			System.out.println(coinUnit[i] + "원 : " + (money / coinUnit[i]));
			money = money % coinUnit[i];
		}
	}
	
	public static void Example7()
	{
		int money = 3510;
		
		System.out.println("money : " + money);
		
		int[] coinUnit 	= {500, 100, 50, 10};
		int[] coin 		= {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length; i++)
		{
			int coinNum = (money / coinUnit[i]) > coin[i] ? coin[i] : (money / coinUnit[i]);
			
			coin[i] = coin[i] - coinNum;
			
			money -= coinUnit[i] * coinNum;
			
			System.out.println(coinUnit[i] + "원 : " + coinNum);
		}
		
		if(money > 0)
		{
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("= 남은 동전의 갯수 =");
		
		for(int i=0; i<coinUnit.length; i++)
		{
			System.out.println(coinUnit[i] + "원 : " + coin[i]);
		}
	}
	
	public static void Example8()
	{
		int[] answer 	= {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter 	= new int[4];
		
		for(int i=0; i<answer.length; i++)
		{
			counter[answer[i] - 1]++;
		}
		
		for(int i=0; i<counter.length; i++)
		{
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Example9()
	{
		char[][] star = {
				 {'*', '*', ' ', ' ', ' '}
				,{'*', '*', ' ', ' ', ' '}
				,{'*', '*', '*', '*', '*'}
				,{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++)
		{
			for(int j=0; j<star[i].length; j++)
			{
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++)
		{
			for(int j=0; j<star[i].length; j++)
			{
				result[j][star.length - (i+1)] = star[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Example10()
	{
		char[] abcCode = {
			'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
			'}', ';', ':', ',', '.', '/'
		};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src 		= "abc123";
		String result 	= "";
		
		for(int i=0; i<src.length(); i++)
		{
			char ch = src.charAt(i);
			// '0' ~ '9'의 아스키코드 = 48 ~ 57
			if((48 <= ch) && (ch <= 57))
			{
				result += numCode[(int) (ch - 48)];
			}
			// 'a' ~ 'z'의 아스키코드 = 97 ~ 122
			else
			{
				result += abcCode[(int) (ch - 97)];
			}
		}
		
		System.out.println("src : " + src);
		System.out.println("result : " + result);
	}
	
	public static void Example11()
	{
		int[][] score = {
			 {100, 100, 100}
			,{20, 20, 20}
			,{30, 30, 30}
			,{40, 40, 40}
			,{50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++)
		{
			for(int j=0; j<score[i].length; j++)
			{
				result[i][j] = score[i][j];
				
				result[i][score[i].length] 				+= score[i][j];
				result[score.length][j] 				+= score[i][j];
				result[score.length][score[i].length] 	+= score[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.printf("%4d",result[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static void Example12()
	{
		String[][] words = {
				 {"chair", "의자"}
				,{"computer", "컴퓨터"}
				,{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		for(int i=0; i<words.length; i++)
		{
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.next();
			
			if(tmp.equals(words[i][1]))
			{
				System.out.printf("정답입니다. %n%n");
				score++;
			}
			else
			{
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}
		
		System.out.println("전체 " + words.length + "문제 중 " + score + "문제 맞추셨습니다.");
	}
	
	public static void Example13()
	{
		String[] 	words 	= { "television", "computer", "mouse", "phone" };
		Scanner 	scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++)
		{
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length; j++)
			{
				int index = (int)(Math.random() * question.length);
				
				char temp 		= question[index];
				question[index] = question[j];
				question[j] 	= temp;
			}

			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
			{
				System.out.printf("맞았습니다.%n%n");
			}
			else
			{
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}
}
