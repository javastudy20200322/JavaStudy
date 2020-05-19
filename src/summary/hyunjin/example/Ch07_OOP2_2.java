package summary.hyunjin.example;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sun.management.counter.Units;

public class Ch07_OOP2_2 {
	
}

//7_24
class FighterTest {
	public static void main() {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		
		if(f instanceof Fightable)
			System.out.println("f는 Figtable인터페이스를 구현했습니다.");
		
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

class Unit {
	int currentHP;	//유닛의 체력
	int x;			//유닛의 위치(x좌표)
	int y;			//유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable { }
interface Movable {	void move (int x, int y); }
interface Attackable { void attack(Unit u); }



//7-25 - 인터페이스의 형변형 잘 모르겟음 : 이게 하고자하는 말이 결국 리턴타입이 인터페이스라건 구현된 인터페이스의 메소드를 반환한다는걸 말하는 건가.
interface Parseable {
	//구문 분석작업을 수행한다
	public abstract void parse(String fileName);
}

class ParserManager {
	//리턴타입이 Parseable인터페이스이다.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser(); //리턴타입이 Parseable니까 xml의 parse메소드 반환?
		}else {
			Parseable p = new HTMLParser();
			return p;	//html의 parse메소드 반환?
			//return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}

class ParserTest {
	public static void main() {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}



//7-26
class RepairableTest {
	public static void main() {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}
}

interface Repairable {}

class Unit2 {
	int hitPoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit2 {
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);		//Tank의 hp는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);		//Dropship의 hp는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint!=u.MAX_HP) {
				//Unit의 HP를 증가시킨다.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다");
		}
	}
}



//7-27
class A {
//	public void methodA(B b) {
//		b.methodB();
//	}
	
	public void methodA(I i) {
		i.methodB();
	}
}

interface I {
	public abstract void methodB();
}

class B implements I {
	public void methodB() {
		System.out.println("methodB()");
	}
}


class InterfaceTest {
	public static void main() {
		A a = new A();
		a.methodA(new B());
	}
}



//7-28
class A2 {
	void autoPlay(I2 i) {
		i.play();
	}
}

interface I2 {
	public abstract void play();
}

class B2 implements I2 {
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I2 {
	public void play() {
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {
	public static void main() {
		A2 a = new A2();
		a.autoPlay(new B2());	// void autoPlay(I i)호출
		a.autoPlay(new C2());	// void autoPlay(I i)호출	
	}
}



//7-29
class InterfaceTest3 {
	public static void main() {
		A3 a = new A3();
		a.methodA();
	}
}

class A3 {
	void methodA() {
		I3 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());	//i로 Object클래스의 메서드 호출가능
	}
}

interface I3 {
	public abstract void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() { return "class B"; }
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}



//7-30 : defalut메소드는 추상메소드가 아닌것인가? 그런데 왜 책에서는 추상메소드의 기본적인 구현을 제공한다고 하면서 추상메소드가 아니라고하는가?
class DefaultMethodTest {
	public static void main() {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child extends Parent implements MyInterface,MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child");	//오버라이딩
	}
}

class Parent {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2" );
	}
}



//7-31
class InnerEx1 {
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;			//에러.static클래스가 아니여서 static변수 선언불가 
		final static int COST = 100;	//final static으 상수여서 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;		//static클래스aks static멤버를 정의할수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;			//error! static변수 선언불가
			final static int CONST = 300;	//fianl static은 상수여서 허용
		}
	}
	
	public static void main() {
		System.out.println(InstanceInner.COST);
		System.out.println(StaticInner.cv);
	}
}



//7-32
class InnerEx2 {
	class InstanceInner {}
	static class StaticInner {}
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//static 멤버간에는 서로 직접접근이 가능하다.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static멤버는 인스턴스멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//굳이접근하려며 아래와 같이 객체를 생성해야한다.
		//인스턴스클래스는 ㅚ부 클래스를 먼저 생성해야만 생성할 수 있다.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//인스턴스메소드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}



//7-3
class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;	//외부 클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//스태틱크르래스는 외부 클래스의 인스턴스멤버에 접근 할수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;	//jdk1.8부터 final생략가능
		
		class LocalInner {
			int liv = outerCv;
			int liv2 = outerCv;
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
//			int liv3 = lv;	//에러!!jdk1.8부터 에러아님
			int liv4 = LV;	//OK
		}
	}
}



//7-34
class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

class InnerEx4 {
	public static void main() {
		//인스턴스클래스의 인스턴스를 생성하려면
		//외부클래스의 인스턴스를 먼저 생성해야한다.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv: " + ii.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		//스태틱내부클래스의 인스턴스는 외부 클래스를 머저 생성하지 않아도된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}
}



//7-35
class Outer2 {
	int value = 10; // Outer.this.value;
	
	class Inner {
		int value = 20; // this.value
		
		void method1() {
			int value = 30;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer2.this.value );
		}
	}
}

class InnerEx5 {
	public static void main() {
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.method1();
	}
}



//7-36
class InnerEx6 {
	Object iv = new Object() {void method(){} };		//익명클래스
	static Object cv = new Object() {void method(){} };	//익명클래스
	
	void myMethod() {
		Object lv = new Object() {void method(){}};		//익명클래스
	}
}



//7-37
class InnerEx7 {
	public static void main() {
		Button b = new Button("Start!!");
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!");
	}
}



//7-38
class InnerEx8 {
	public static void main() {
		Button b = new Button("Start!!");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occuerred!!!");
			}
		} );
	}
}


























