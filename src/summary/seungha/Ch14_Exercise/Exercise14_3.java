package summary.seungha.Ch14_Exercise;

/* [문제] 아래의 괄호안에 알맞은 함수형 인터페이스는? */
public class Exercise14_3 {
	/*
	 
	( )  f; //함수형 인터페이스 타입의 참조변수 f를 선언 
	f = (int a, int b) -> a > b ? a : b;
	 
	a. Function
	b. BiFunction
	c. Predicate
	d. BinaryOperator
	e. IntFunction

	[답안] d

	[해설] 참조하려는 람다식의 매개변수가 int타입 두 개이고, 반환값의 타입 역시 int이므로, 하나의 매개변수만 정의되어 있는 Function, Predicate, IntFunction은 적합하지 않다. 
			 BiFunction은 두 개의 매개변수를 갖지만, int와 같은 기본형은 사용할 수 없기 때문에 IntBinaryOperator를 사용해야한다.
	 
	 */
}
