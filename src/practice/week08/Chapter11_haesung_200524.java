package practice.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Chapter11_haesung_200524
{

	public static void main(String[] args)
	{
//		example01();
		example02();
	}
	
//	문제1) "그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 다음 해시맵을 이용하라.
//	
//	나라 이름과 인구를 입력하세요.(예: Korea 5000)
//	나라 이름, 인구 >> Korea 5000
//	나라 이름, 인구 >> USA 1000000
//	나라 이름, 인구 >> Swiss 2000
//	나라 이름, 인구 >> France 3000
//	나라 이름, 인구 >> 그만
//	인구 검색 >> France
//	France의 인구는 3000
//	인구 검색 >> 스위스
//	스위스 나라는 없습니다.
//	인구 검색 >> 그만
	static void example01()
	{
		HashMap nations = new HashMap();
		Scanner scanner = new Scanner(System.in);
//		Scanner scanner = new Scanner(System.in).useDelimiter(" ");
		
		
		// 코드 작성
		EXIT:
		while(true)
		{
			while(true)
			{
				System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
				System.out.print("나라 이름, 인구 >> ");
				
				String input = scanner.nextLine();
				
				if(input.equals("그만"))
				{
					break;
				}
				else
				{
					try
					{
						String[] tempArr = input.split(" ");
						nations.put(tempArr[0], tempArr[1]);
					}
					catch (Exception e)
					{
						System.out.println("다시 입력해봐.");
					}
				}
			}
			
			while(true)
			{
				System.out.print("인구 검색 >> ");
				String input = scanner.next();
				
				if(input.equals("그만"))
				{
					break EXIT;
				}
				else
				{
					String value = (String) nations.get(input);
					
					if(value != null)
					{
						System.out.println(input + "의 인구는 " + value);
					}
					else
					{
						System.out.println(input + " 나라는 없습니다.");
					}
				}
				
			}
		}
	}
	
//	문제2) 이진검색 구현하기.
//	주어진 arrayList에서 찾고자하는 value를 이진검색으로 찾고, 몇 번만에 찾는지 출력하는 findValue()를 완성하세요.
//	
//	예시)
//	findValue(arrayList, 10);
//	[10, 35, 45, 50]
//	[10, 35]
//	[10]
//	10
//	10를 찾는데 4번 소요되었습니다.
//	
//	findValue(arrayList, 95);
//	[65, 80, 95, 100]
//	95
//	95를 찾는데 2번 소요되었습니다.
	static void example02()
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(80);
		arrayList.add(95);
		arrayList.add(50);
		arrayList.add(35);
		arrayList.add(55);
		arrayList.add(45);
		arrayList.add(65);
		arrayList.add(10);
		arrayList.add(100);
		
		Collections.sort(arrayList);
		
		findValue(arrayList, 55);
//		findValue(arrayList, 10);
//		findValue(arrayList, 95);
	}
	
	static void findValue(ArrayList arrayList, int value)
	{
		// 코드 작성
		int count = 1;	// 검색 횟수
		
		while(true)
		{
			int midIndex 	= arrayList.size() / 2;				// arrayList의 가운데 index 번호
			int tempValue 	= (int) arrayList.get(midIndex);	// arrayList의 가운데 index에 저장된 값
			
			if(tempValue == value)
			{
				System.out.println(tempValue);
				System.out.println(value + "를 찾는데 " + count + "번 소요되었습니다.");
				break;
			}
			else if(tempValue < value)
			{
				arrayList = new ArrayList(arrayList.subList(midIndex, arrayList.size()));
				System.out.println(arrayList);
				count++;
			}
			else
			{
				arrayList = new ArrayList(arrayList.subList(0, midIndex));
				System.out.println(arrayList);
				count++;
			}
		}
	}

}
