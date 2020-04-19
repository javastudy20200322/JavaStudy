package practice.week04.haesung;

import java.util.Scanner;

public class RunBirthday
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		// Human 객체를 담는 배열 생성.
		Human[] humanArr = new Human[scanner.nextInt()];
		
		// humanArr배열의 index 값을 대신할 변수.
		int temp = 0;
		// 반복문을 이용하여 생성한 Human객체를 humanArr배열에 담는다.
		while(temp < humanArr.length)
		{
			// 새로운 Human객체 생성.
			Human human = new Human();
			
			// 입력받은 내용을 토대로 Human객체를 만든다.
			human.setName(scanner.next());
			human.setDay(scanner.nextInt());
			human.setMonth(scanner.nextInt());
			human.setYear(scanner.nextInt());
			
			// 만들어진 Human객체를 humanArr배열의 temp인덱스에 담는다.
			humanArr[temp] = human;
			temp++;
		}

		// 가장 어린 사람의 Human객체를 담을 변수.
		Human youngerHuman = null;
		for(int i=0; i<humanArr.length; i++)
		{
			// 인덱스 값이 0인 객체는 youngerHuman 변수에 바로 담고
			if(i == 0)
			{
				youngerHuman = humanArr[0];
			}
			// 나머지 객체는 youngerHuman에 담긴 객체와 비교하여 더 어린 객체를 youngerHuman에 담는다.
			else
			{
				youngerHuman = Human.getYoungerHuman(youngerHuman, humanArr[i]);
			}
		}
		
		// 같은 방식으로 가장 나이 많은 사람의 Human객체를 olderHuman변수에 담는다.
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
		
		// 결과 출력.
		System.out.println("가장 나이가 적은 사람 : " + youngerHuman.getName());
		System.out.println("가장 나이가 많은 사람 : " + olderHuman.getName());
		
	}
	
	
	
	
	

}
