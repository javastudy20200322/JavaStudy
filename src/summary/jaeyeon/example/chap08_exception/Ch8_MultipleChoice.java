package summary.jaeyeon.example.chap08_exception;

public class Ch8_MultipleChoice {

	
	/*
	 *Q1 예외처리의 정의와 목적에 대해서 설명하시오
	 *정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
	 *목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것.
	 *
	 *에러와 예외의 차이
	 *에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
	 *예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
	 */
	
	/*
	 *Q2 다음중 실행도중 예외가 발생하여 화면에 출력된 내용이다.
	 *이에 대한 설명 중 옳지 않은 것은?
	 *
	 *java.lang.ArithmeticException : / by zero
	 *	at ExceptionEx18.method2(ExceptionEx18.java:12)
	 *	at ExceptionEx18.method1(ExceptionEx18.java:8)
	 *	at ExceptionEx18.main(ExceptionEx18.java:4)
	 *
	 *a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.
	 *b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java 파일의 12번째 줄이다.
	 *c. 발생한 예외는 ArithmeticException 이며, 0으로 나누어서 예외가 발생했다.
	 *d. method2 메서드가 method1 메서드를 호출하였고 그 위치는 ExceptionEx18.java 파일의 8번째줄이다.
	 */
	
	/*
	 *Q3 다음 중 오버라이딩 잘못된 것은? (모두 고르시오)
	 *
	 *void add(int a , int b) throws InvalidNumberException, NotANumberException{}
	 *
	 *class NumberException extends Exception {}
	 *class InvalidNumberException extends NumberException {}
	 *class NotANumberException extends NumberException {}
	 *
	 *a. void add(int a , int b ) throws InvalidNumberException, NotANumberException {}
	 *b. void add(int a , int b ) throws InvalidNumberException {}
	 *c. void add(int a , int b ) throws NotANumberException {}
	 *d. void add(int a , int b ) throws Exception {}				X
	 *e. void add(int a , int b ) throws NumberException {}			X
	 *
	 *overriding 할 때 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
	 *더불어, Exception 은 모든 예외의 최고 상위개념이므로 가장 많은 개수의 예외를 던질 수 있도록 선언한 것.
	 */
	
	/*
	 *Q4 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
	 *
	 *void method() throws InvalidNumberException, NotANumberException {}
	 *
	 *class NumberException extends RuntimeException {}
	 *class InvalidNumberException extends NumberException {}
	 *class NotANumberException extends NumberException {}
	 *
	 *a. try { method(); } catch(Exception e) {}
	 *b. try { method(); } catch(NumberException e){} catch(Exception e) {}
	 *c. try { method(); } catch(Exception e) {} catch(NumberException e) {}  X
	 *d. try { method(); } catch(InvalidNumberException e){
	 *					 } catch(NotANumberException e){}
	 *e. try { method(); } catch(NumberException e) {}
	 *f. try { method(); } catch(RuntimeException e) {}
	 *
	 *가장 상위의 예외 처리 기준인 Exception 을 처리하는 catch 블럭은 모든 catch 블럭 중 제일 마지막에
	 *있어야함.
	 */
	
}
