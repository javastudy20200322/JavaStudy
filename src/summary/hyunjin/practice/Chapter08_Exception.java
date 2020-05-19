package summary.hyunjin.practice;

import java.util.Scanner;

//[8-1] ����ó���� ���ǿ� ������ ���ؼ� �����Ͻÿ�.
// ���� �߻��� ������ ������ �ϱ� ����



//[8-2] ������ ���൵�� ���ܰ� �߻��Ͽ� ȭ�鿡 ��µ� �����̴�. �̿� ���� ���� �� ���� ���� ����?
//---------------------------------------------------
//	java.lang.ArithmeticException : / by zero
//		at ExceptionEx18.method2(ExceptionEx18.java:12)
//		at ExceptionEx18.method1(ExceptionEx18.java:8)
//		at ExceptionEx18.main(ExceptionEx18.java:4)
//---------------------------------------------------
//a. ���� �������� ���ܰ� �߻����� ��� ȣ�⽺�ÿ� �����ߴ� �޼��带 �� �� �ִ�.
//b. ���ܰ� �߻��� ��ġ�� method2 �޼����̸�, ExceptionEx18.java������ 12��° ���̴�.
//c. �߻��� ���ܴ� ArithmeticException�̸�, 0���� ����� ���ܰ� �߻��ߴ�.
//d. method2�޼��尡 method1�޼��带 ȣ���Ͽ��� �� ��ġ�� ExceptionEx18.java������ 8��° ���̴�.
//�� : d / �޼ҵ�1�� 2�� ȣ����



//[8-3] ���� �� �������̵��� �߸��� ����? (��� ���ÿ�)
//----------------------------------------------------------------
//	void add(int a, int b)
//		throws InvalidNumberException, NotANumberException {}
//	
//	class NumberException extends Exception {}
//	class InvalidNumberException extends NumberException {}
//	class NotANumberException extends NumberException {}
//----------------------------------------------------------------
//a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
//b. void add(int a, int b) throws InvalidNumberException {}
//c. void add(int a, int b) throws NotANumberException {}
//d. void add(int a, int b) throws Exception {}
//e. void add(int a, int b) throws NumberException {}
//�� : d, e / �������̵��Ҷ� ����Ŭ������ �޼ҵ庸�� ���� ���ܸ� �����Ҽ� ����.



//[8-4] ������ ���� �޼��尡 ���� ��, ���ܸ� �߸� ó���� ����? (��� ���ÿ�)
//----------------------------------------------------------------
// void method() throws InvalidNumberException, NotANumberException {}
//
// class NumberException extends RuntimeException {}
// class InvalidNumberException extends NumberException {}
// class NotANumberException extends NumberException {}
//----------------------------------------------------------------
//a. try {method();} catch(Exception e) {}
//b. try {method();} catch(NumberException e) {} catch(Exception e) {}
//c. try {method();} catch(Exception e) {} catch(NumberException e) {}
//d. try {method();} catch(InvalidNumberException e) {} catch(NotANumberException e) {}
//e. try {method();} catch(NumberException e) {}
//f. try {method();} catch(RuntimeException e) {}
//�� : c , Exception�� �ְ� ���� ����ó�����



//[8-5] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
class Exercise8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
			System.out.println(6);
	}
	public static void main(String[] args) {
		method(true);
		method(false);
	} // main
}
//135 1256



//[8-6] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
class Exercise8_6 {
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println(5);
		}
	}
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	} // method1()
	static void method2() {
	throw new NullPointerException();
	}
}
//35 ArithmeticException���ܴ� �������� ��������϶� ���� ����



//[8-7] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	public static void main(String[] args) {
		method(true);
		method(false);
	} // main
}
//1



//[8-8] ������ 1~100������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ��־ �߻��� �����̴�. ����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է��� �޵��� �����϶�.
//----------------------------------------------------------------
// 1�� 100������ ���� �Է��ϼ��� :50
// �� ���� ���� �Է��ϼ���.
// 1�� 100������ ���� �Է��ϼ��� :asdf
// Exception in thread "main" java.util.InputMismatchException
//	 at java.util.Scanner.throwFor(Scanner.java:819)
//	 at java.util.Scanner.next(Scanner.java:1431)
//	 at java.util.Scanner.nextInt(Scanner.java:2040)
//	 at java.util.Scanner.nextInt(Scanner.java:2000)
//	 at Exercise8_8.main(Exercise8_8.java:16)
//----------------------------------------------------------------
class Exercise8_8 { 
	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			// input = new Scanner(System.in).nextInt();
			try {
				input = new Scanner(System.in).nextInt();
			} catch(Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
				continue;	//�����
			}
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break; // do-while���� �����
			}
		} while(true); // ���ѹݺ���
	} // end of main
} // end of class HighLow



//[8-9] ������ ���� ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//[����] �����ڴ� �������� ���� �˸°� �ۼ��ؾ��Ѵ�.
//* Ŭ������ : UnsupportedFuctionException
//* ����Ŭ������ : RuntimeException
//* ������� :
//	�� �� : ERR_CODE
//	���尪 : �����ڵ�
//	Ÿ �� : int
//	�⺻�� : 100
//	������ : final private
//* �޼��� :
//	1. �޼���� : getErrorCode
//	�� �� : �����ڵ�(ERR_CODE)�� ��ȯ�Ѵ�.
//	��ȯŸ�� : int
//	�Ű����� : ����
//	������ : public
//	2. �޼���� : getMessage
//	�� �� : �޼����� ������ ��ȯ�Ѵ�.(ExceptionŬ������ getMessage()�� �������̵�)
//	��ȯŸ�� : String
//	�Ű����� : ����
//	������ : public
class Exercise8_9 {
	public static void main(String[] args) throws Exception	{
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100);
	}
}

class UnsupportedFuctionException extends RuntimeException{
	final private int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg) {
		this(msg,100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}



//[8-10] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch(Exception e) {
			System.out.println(7);
		}
	}
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
			System.out.println(5);
		} // method1()
	static void method2() {
		throw new NullPointerException();
	}
}
//247
