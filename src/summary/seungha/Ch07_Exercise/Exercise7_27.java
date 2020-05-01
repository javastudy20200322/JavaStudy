package summary.seungha.Ch07_Exercise;

/* Exercise 7-27. 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
 *
 * [실행결과]
 * 30
 * 20
 * 10
 */
class Exercise7_27 {
	public static void main(String[] args) {
		/* (4) 알맞은 코드를 넣어 완성하시오. */
		Outer2 Outer2 = new Outer2();
		Outer2.Inner inner = Outer2.new Inner();

		inner.method1();	// 문제에서 주어진 부분
	}
}

class Outer2 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(/* (1) */ value);
			System.out.println(/* (2) */ this.value);
			System.out.println(/* (3) */ Outer2.this.value);
		}
	}	// Inner클래스의 끝
}	// Outer2클래스의 끝