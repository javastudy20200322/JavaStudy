package practice.week04.haesung;

import java.util.Scanner;

public class RunBirthday
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int arraySize = 0;
		while((arraySize < 1) || (100 < arraySize))
		{
			arraySize = scanner.nextInt();
		}
		
		Human[] humanArr = new Human[arraySize];
		
		int temp = 0;
		while(temp < humanArr.length)
		{
			Human human = new Human();
			
			EXIT_NAME:
			while(true)
			{
				String name = scanner.next();
				if((1 <= name.length()) || (name.length() <= 15))
				{
					human.setName(name);
					break EXIT_NAME;
				}
				else
				{
					System.out.println("이름을 다시 입력하세요.");
				}
			}
			
			EXIT_DAY:
			while(true)
			{
				int day = scanner.nextInt();
				if((1 <= day) && (day <= 31))
				{
					human.setDay(day);
					break EXIT_DAY;
				}
				else
				{
					System.out.println("일을 다시 입력하세요.");
				}
			}
			
			EXIT_MONTH:
			while(true)
			{
				int month = scanner.nextInt();
				if((1 <= month) || (month <= 12))
				{
					human.setMonth(month);
					break EXIT_MONTH;
				}
				else
				{
					System.out.println("월을 다시 입력하세요.");
				}
			}
			
			EXIT_YEAR:
			while(true)
			{
				int year = scanner.nextInt();
				if((1 <= year) || (year <= 12))
				{
					human.setYear(year);
					break EXIT_YEAR;
				}
				else
				{
					System.out.println("년도를 다시 입력하세요.");
				}
			}
			
			humanArr[temp] = human;
			temp++;
		}

		Human youngerHuman = null;
		for(int i=0; i<humanArr.length; i++)
		{
			if(i == 0)
			{
				youngerHuman = humanArr[0];
			}
			else
			{
				youngerHuman = Human.getYoungerHuman(youngerHuman, humanArr[i]);
			}
		}
		
		Human olderHuman = null;
		for(int i=0; i<humanArr.length; i++)
		{
			if(i == 0)
			{
				olderHuman = humanArr[0];
			}
			else
			{
				olderHuman = Human.getOlderHuman(olderHuman, humanArr[i]);
			}
		}
		
		System.out.println("가장 나이가 적은 사람 : " + youngerHuman.getName());
		System.out.println("가장 나이가 많은 사람 : " + olderHuman.getName());
		
	}
	
	
	
	
	

}
