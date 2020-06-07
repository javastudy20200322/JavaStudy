package summary.jaeyeon.example.chap09_util;

public class Q5 {
	public static int count(String src, String target) {
		int count = 0;// 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		/*
		 * (1) 반복문을 이용하여 아래의 과정을 반복한다.
		 * 1. src 에서 target 을 pos 의 위치부터 찾는다.
		 * 2. 찾으면 count 의 값을 1 증가시키고, pos 의 값을 target.length 만큼 증가시킨다.
		 * 3.indexOf 의 결과가 -1 이면 반복문을 빠져나가서 count 를 반환한다.
		 * 
		 */
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}

} 
