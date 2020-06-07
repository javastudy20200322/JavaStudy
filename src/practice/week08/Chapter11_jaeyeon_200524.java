package practice.week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter11_jaeyeon_200524 {

	public static void main(String[] args) {
		// example01();
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
	static void example01() {
		HashMap nations = new HashMap();
		Scanner scanner = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		// 코드 작성
		while (true) {
			System.out.print(">> ");

			String input = scanner.nextLine();

			// 코드작성.
			if (input.equals("그만")) {
				System.out.println("종료합니다...");
				System.exit(0);
			} else {

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
	static void example02() {
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

		findValue(arrayList, 10);
		System.out.println("======================================");
		findValue(arrayList, 95);
		System.out.println("======================================");
		findValue(arrayList, 55);
	}

	static void findValue(ArrayList arrayList, int value) {
		// 코드 작성

		int mid;
		int left = 0;
		int right = arrayList.size() - 1;
		int count = 1;
		System.out.println(arrayList);
		System.out.println("**찾는 값는 : " + value + "****");
		while (right >= left) {
			mid = (right + left) / 2;
			System.out.println(value + " 을 / 를 " + count + " 번째 찾는 중...");
			System.out.println("left : " + left + "  mid : " + mid + "  right : " + right);
			System.out.println("찾고자 하는 값 : " + value + " 리스트의 중간 값 :  " + arrayList.get(mid));
			if (value == (int) arrayList.get(mid)) {
				System.out.println(count + " 번 만에 " + value + " 을/를 찾았습니다.");
				break;
			}

			if (value < (int) arrayList.get(mid)) {
				
				System.out.println("찾고자 하는 값이 중간 값 보다 작습니다.");
				right = mid - 1;
				count++;
			} else {
				System.out.println("찾고자 하는 값이 중간 값 보다 급니다.");
				left = mid + 1;
				count++;
			}
		}
	}

}
