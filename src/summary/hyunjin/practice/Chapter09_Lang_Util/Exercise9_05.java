package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-5] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//메서드명 : count
//기 능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
//반환타입 : int
//매개변수 : String src
//String target

public class Exercise9_05 {
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		/*
		(1) 반복문을 사용해서 아래의 과정을 반복한다.
		*/
		while(true) {
//			1. src에서 target을 pos의 위치부터 찾는다.
			int num = src.indexOf(target, pos);	
			
//			2. 찾으면 count의 값을 1 증가 시키고, pos의 값을 target.length만큼 증가시킨다.
			if(num != -1) {
				count++;
				pos += target.length();
			}else {
//				3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
}
