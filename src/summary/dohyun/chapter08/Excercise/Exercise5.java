package summary.dohyun.chapter08.Excercise;
//예제 7 참고 
public class Exercise5 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}

		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
//		method(false);
	}

}

/*
 * 3에 리턴을 주석 처리하니깐 메서드를 빠져나가지 않고 6이 출력됨
 */