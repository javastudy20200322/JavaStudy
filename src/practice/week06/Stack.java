package practice.week06;

/** [날짜] 2020-05-10
 *  [참고] 명품 JAVA Programming
 *  [문제]
 *  1. 주어진 Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하시오.
 *  2. 다음 실행결과를 출력하도록 StackApp 클래스에 main() 메서드를 작성하시오.
 *  [실행결과]
 *  총 스택 저장 공간의 크기 입력 >> 3
 *  문자열 입력 >> hello
 *  문자열 입력 >> world
 *  문자열 입력 >> java
 *  문자열 입력 >> try
 *  스택이 꽉 차서 푸시 불가!
 *  문자열 입력 >> 0
 *  스택에 저장된 모든 문자열 출력 : java world hello
 */
public interface Stack {
	
	int length();							// Stack에 저장된 항목의 개수 반환
	int capacity();						// Stack에 저장 가능한 항목의 개수 반환
	String pop();							// Stack에서 항목을 꺼내고 이를 반환
	boolean push(String str);		// Stack에 항목을 저장하고 성공적으로 저장하면 true를, 실패하면 false를 반환

}
