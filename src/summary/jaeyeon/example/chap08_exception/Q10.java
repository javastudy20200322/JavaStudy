package summary.jaeyeon.example.chap08_exception;

public class Q10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}
	}

	static void method1() throws Exception {

		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;//새로운 e 오류를 발생시킴.
		} catch (Exception e) {

		}

	}

	static void method2() {
		throw new NullPointerException();
	}

}
