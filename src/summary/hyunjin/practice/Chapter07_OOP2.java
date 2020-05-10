package summary.hyunjin.practice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import summary.hyunjin.practice.Outer2.Inner2;

public class Chapter07_OOP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
//class Car {}
//class FireEngine extends Car implements Movable {}
//class Ambulance extends Car {}
//FireEngine fe = new FireEngine();
//a. fe instanceof FireEngine
//b. fe instanceof Movable
//c. fe instanceof Object
//d. fe instanceof Car
//e. fe instanceof Ambulance
//답 :d , e



//[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
//클래스를 상속받도록 코드를 변경하시오.
class Marine2 { // 보병
	int x, y; // 현재 위치
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void stimPack() { /* 스팀팩을 사용한다.*/}
}
class Tank { // 탱크
	int x, y; // 현재 위치
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void changeMode() { /* 공격모드를 변환한다. */}
}
class Dropship { // 수송선
	int x, y; // 현재 위치
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
}

abstract class Unit {
	abstract void move(int x,int y);
	abstract void stop();
}



//[7-18] 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
//[Hint] instanceof연산자를 사용해서 형변환한다.
//메서드명 : action
//기 능 : 주어진 객체의 메서드를 호출한다.
//DanceRobot인 경우, dance()를 호출하고,
//SingRobot인 경우, sing()을 호출하고,
//DrawRobot인 경우, draw()를 호출한다.
//반환타입 : 없음
//매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
class Exercise7_18 {
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot rr = (DrawRobot)r;
			rr.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		} // main
	}
}
		
class Robot {}
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}



//[7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수로 돈(money)과 장바구니(cart)를 가지고 있다. 
//제품을 구입하는 기능의 buy메서드와 장바구니에 구입한 물건을 추가하는 add메서드, 구입한 물건의 목록과 사용금액, 그리고 남은 금액을 출력하는 summary메서드를 완성하시오.
//1. 메서드명 : buy
//기 능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고,장바구니(cart)에 담는다.만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
//반환타입 : 없음
//매개변수 : Product p - 구입할 물건
//2. 메서드명 : add
//기 능 : 지정된 물건을 장바구니에 담는다.만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
//반환타입 : 없음
//매개변수 : Product p - 구입할 물건
//3. 메서드명 : summary
//기 능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
//반환타입 : 없음
//매개변수 : 없음

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index
	void buy(Product p) {
		/*
		(1) 아래의 로직에 맞게 코드를 작성하시오.
		 */
//		1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
		if(money <p.price) {
			System.out.println("돈이 부족합니다.");
		}
//		1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
		else if(p.price <= money) {
			money--;
//		1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
			add(p);
		}
	}
	
	void add(Product p) {
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오.
		 */
//		1.1 i의 값이 장바구니의 크기보다 같거나 크면
//		1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
//		1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//		1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
		if(cart.length <= i) {
			Product[] tmp = new Product[cart.length*2];
			for(int j=0; j<cart.length; j++) {
				tmp[j] = cart[j]; 
			}
			cart = tmp;
		}
//		1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		cart[i++] = p;
	} // add(Product p)
	
	void summary() {
		/*
		(3) 아래의 로직에 맞게 코드를 작성하시오.
		 */
		String list = null;
		int sum = 0;
//		1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		for(int i=0; i<cart.length; i++) {
			if( cart[i] instanceof Tv)
				list += "TV ";
			else if( cart[i] instanceof Computer)
				list += "Computer ";
			else if( cart[i] instanceof Audio)
				list += "Audio";
			
			sum += cart[i].price;
		}
//		1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
//		1.3 물건을 사고 남은 금액(money)를 출력한다.
		System.out.println("장바구니목록 : " + list + ", 총가격 :" + sum + ", 잔액:" + (money-sum));
	} // summary()
}


class Product {
int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}


//[7-20] 다음의 코드를 실행한 결과를 적으시오.
class Exercise7_20 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);	//100
		p.method();							//Child Method
		System.out.println("c.x = " + c.x);	//200
		c.method();							//Child Method
	}
}

class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}



//[7-21] 다음과 같이 attack메서드가 정의되어 있을 때, 이 메서드의 매개변수로 가능한것 두 가지를 적으시오.
//interface Movable {
//	void move(int x, int y);
//}
//void attack(Movable f) {
//	/* 내용 생략 */
//}
//Movable f



//[7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다.
//(1) 클래스명 : Circle
//조상클래스 : Shape
//멤버변수 : double r - 반지름
//(2) 클래스명 : Rectangle
//조상클래스 : Shape
//멤버변수 : double width - 폭
//double height - 높이
//메서드 :
//1. 메서드명 : isSquare
//기 능 : 정사각형인지 아닌지를 알려준다.
//반환타입 : boolean
//매개변수 : 없음

abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	Point() {
		this(0,0);
	}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;
	Circle(double r){
		this(new Point(0,0), r);
	}
	
	Circle(Point p, double r){
		super (p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return r*r;
	}
}

class Rect extends Shape{
	double width;
	double height;
	
	Rect(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	
	public Rect(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		return width*height!=0 && width==height;
	}
}



//[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.
//1. 메서드명 : sumArea
//기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
//반환타입 : double
//매개변수 : Shape[] arr
class Exercise7_23
{
	/*
	(1) sumArea메서드를 작성하시오.
	*/
	public static int sumArea(Shape[] arr) {
		int sumArea = 0;
		
		for(int i=0; i<arr.length; i++) 
			sumArea += arr[i].calcArea();

		return sumArea;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}
}



//[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
//a. 표준화를 가능하게 해준다.
//b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
//c. 독립적인 프로그래밍이 가능하다.
//d. 다중상속을 가능하게 해준다.
//e. 패키지간의 연결을 도와준다.
//답 : e, 관련없다.



//[7-25] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer {
	class Inner {
		int iv=100;
	}
}
class Exercise7_25 {
	public static void main(String[] args) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println("iv: " + inner.iv);
	}
}



//[7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer2 {
	static class Inner2 {
		int iv=200;
	}
}
class Exercise7_26 {
	public static void main(String[] args) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		Inner2 i2 = new Inner2();
		System.out.println("i2 : " + i2);
	}
}



//[7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
class Outer3 {
	int value=10;
	class Inner3 {
		int value=20;
		void method1() {
			int value=30;

//			System.out.println(/* (1) */);			
			System.out.println(value);
//			System.out.println(/* (2) */);
			System.out.println(this.value);
//			System.out.println(/* (3) */);
			System.out.println(Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

class Exercise7_27 {
	public static void main(String args[]) {
		/*
		(4) 알맞은 코드를 넣어 완성하시오.
		*/
		Outer3 outer = new Outer3();
		Outer3.Inner3 inner = outer.new Inner3();
		
		inner.method1();
	}
}



//[7-28] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
class Exercise7_28 {
	public static void main(String[] args)	{
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}



//[7-29] 지역 클래스에서 외부 클래스의 인스턴스 멤버와 static멤버에 모두 접근할 수있지만, 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?
//지역클래스가 소멸된 지역변수를 참조하려고 할 수 있어서.










