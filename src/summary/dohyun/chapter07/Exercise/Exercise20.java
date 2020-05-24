package summary.dohyun.chapter07.Exercise;

public class Exercise20 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();

		System.out.println(p.x);
		p.method();
		System.out.println(c.x);
		c.method();
	}
//인스턴스 메서드 만  재정의 
}

class Parent2 {
	int x = 100;

	void method() {
		System.out.println("부모메서드 호출");
	}
}

class Child2 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("자식 메소드 호출");
	}
}