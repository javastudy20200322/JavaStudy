package summary.jaeyeon.example.chap06_oop;

public class Ch6_MultipleChoice {
//Q10 생성자에 대한 설명으로 옳지 않은 것은?(모두 고르시오)
	/*a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다. x
	 *b. 생성자는 객체를 생성하기 위한 것이다.
	 *c. 클래스에는 생성자가 반드시 하나 이상 있어야한다.
	 *d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
	 *e. 생성자는 오버로딩 할 수 없다. x
	 * 
	 */
	
	//Q11 다음중 this 에 대한 설명으로 맞지않은 것은?(모두 고르시오)
	/* a. 객체 자신을 가리키는 참조변수이다.
	 * b. 클래스 내에서라면 어디서든 사용할 수 있다. x
	 * c. 지역변수와 인스턴스 변수를 구별할 때 사용한다.
	 * d. 클래스 메서드 내에서는 사용할 수 없다.
	 * 
	 */
	
	//Q12 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은?(모두 고르시오)
	/*
	 * a. 메서드의 이름이 같아야한다.
	 * b. 매게변수의 개수나 타입이 달라야한다. 
	 * c. 리턴타입이 달라야한다.x
	 * d. 매게변수의 이름이 달라야한다.x 
	 */
	
	//Q13 다음 중 아래의 add 메서드를 올바르게 오버로딩한 것은?(모두 고르시오)
	/*		long(add(int a, int b )		{ return a + b;}
	 * 
	 * a. long(add(int x, int y) 		{ return x + y;}			x
	 * b. long(add(long a , long b )	{ return a + b;}			o
	 * c. int add(byte a, byte b )		{ return a + b;}			o
	 * d. int add(long a, int b)		{ return (int)(a + b);}		o
	 */
	
	//Q14 다음중 초기화에 대한 설명으로 옳지 않은 것은?(모두고르시오)
	/*
	 * 
	 * a. 멤버 변수는 자동 초기화 되므로 초기화 하지 않고도 값을 참조할 수 있다.
	 * b. 지역변수는 사용하기 전에 반드시 초기화해야한다.
	 * c. 초기화 블록 보다 생성자가 먼저 수행된다.
	 * d. 명시적 초기화를 제일 우선적으로 고려해야한다.
	 * e. 클래스 변수보다 인스턴스 벼눗가 먼저 초기화된다.
	 * 
	 */
	
	//Q15 다음중 인스턴스 변수의 초기화순서가 올바른 것은?
	/*
	 * a. 기본값 - 명시적 초기화 - 초기화블럭 - 생성자  o
	 * b. 기본값 - 명시적초기화 - 생성자 - 초기화블럭
	 * c. 기본값 - 초기화블럭 - 명시적초기화 - 생성자
	 * d. 기본값 - 초기화블럭 - 생성자 - 명시적 초기화
	 */
	
	//Q16 다음 중 지역변수에 대한 설명으로 옳지않은 것은?(모두 고르시오)
	/*
	 * a. 자동 초기화 되므로 별도의 초기화가 필요없다.
	 * b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
	 * c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
	 * d. 클래스변수나 인스턴스 변수보다 메모리 부담이 적다.
	 * e. 힙(heap) 영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
	 */
	
	//Q17 호출스택이 다음과 같은 상황일때 옳지 않은 설명은?
	/*
	 * 			|			|
	 * 			|println	|
	 * 			|method1	|
	 * 			|method2	|
	 * 			|main		|
	 * 			|			|
	 * 
	 * a. 제일 먼저 호출스택에 저장된 것은 main 메서드이다.
	 * b. println 메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
	 * c. method2 메서드를 호출한 것은 main 메서드이다.
	 * d. println 메서드가 종료되면 method1 메서드가 수행을 재개한다.
	 * e. main - method2 - method1 - println 의 순서로 호출되었다.
	 * f. 현재 실행중인 메서드는 println 뿐이다.
	 */
	public static void main(String[] args) {

	}

}
