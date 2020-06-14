package summary.seungha.Ch14_Exercise;

import java.util.Random;

/* [문제] 임의의 로또번호(1~45)를 정렬해서 출력하시오. */
public class Exercise14_6 {
	public static void main(String[] args) {
		new Random().ints(1,46)		// 1~45사이의 정수(46은 포함안됨)
			      .distinct()		// 중복제거
			      .limit(6)		// 6개만
			      .sorted()		// 정렬
			      .forEach(System.out::println);	//화면에 출력
	}
}
