package summary.seungha.Ch07_Exercise;

/* Exercise 7-7. ★ 다음의 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
 * [호출되는 생성자의 순서]	Child() - Child(int x) - Parent() - Parent(int x) - Object
 *						호출은 이와 같이 되고, 실제 생성은 역순으로 생성
 * [실행결과]				Child 변수타입의 멤버변수 c에 든 값인, 1000 출력
 */
class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("c.x = " + c.x);				// c.x = 1000
		System.out.println("c.getX() = " + c.getX());	// c.getX() = 200
	}
}

class Parent {
	int x = 100;
	
	Parent() {
		this(200);
	}
	
	Parent(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
		this(1000);
	}
	
	Child(int x) {
		this.x = x;
	}
}