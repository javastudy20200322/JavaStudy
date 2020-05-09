package summary.dohyun.chapter08.Excercise;

//예상 답 
/*
 * 3
 * 5
 * method -> method2 호출햇는데 throw로 강제로 예외발생시켜서 1 출력 x
 * 그리고 캐치에서 예외 검사(?) 하고 finally 호출하고 메인에서 method1()의 역활은 끝나는데 
 * 예외처리가 발생했기때문에 5 까지 출력
 */
public class Exercise6 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println();
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}

		System.out.println(4);
	}

	static void method2() {
		throw new NullPointerException();
	}

}
