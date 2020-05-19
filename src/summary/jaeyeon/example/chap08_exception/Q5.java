package summary.jaeyeon.example.chap08_exception;

class Q5 {
	static void method(boolean b) {

		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2);//예외가 발생하면 실행되지 않는 문장
		} catch (RuntimeException e) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // 예외 발생 여부에 관계 없이 항상 실행되는 문장.

		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
		
	}
	
}
