package summary.hyunjin.practice.Chapter09_Lang_Util;

//메서드명 : round
//기 능 : 주어진 값을 반올림하여, 소수점 이하 n자리의 값을 반환한다.
//예를 들어 n의 값이 3이면, 소수점 4째 자리에서 반올림하여 소수점 이하 3자리의 수를 반환한다.
//반환타입 : double
//매개변수 : double d - 변환할 값
//		  int n - 반올림한 결과의 소수점 자리
public class Exercise9_08 {
	/*	(1) round메서드를 작성하시오.	*/
	public static double round(double d, int n) {
		return Math.round(d*Math.pow(10, n))/Math.pow(10, n);
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}
