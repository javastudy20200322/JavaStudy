package summary.jaeyeon.example.chap09_util;

public class Q8 {

	static double round(double d, int n) {

		/*
		 * (1) round 메서드를 작성하시오
		 * 주어진 값을 반올림 하여, 소숫점 이하 n 자리의 값을 반환한다.
		 * 예를 들어 n 의 값이 3이면, 소수점 4째 자리에서 반올림하여 소수점 이하 3자리의 수를 반환한다.
		 * 반환 타입 : double
		 * 매개변수 : double d 반환할 값//  int  n 반올림한 결과의 소숫점자리
		 * Math.round() 와 Math.pow() 를 이용하라.
		 */
		
		
		return d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}

}
