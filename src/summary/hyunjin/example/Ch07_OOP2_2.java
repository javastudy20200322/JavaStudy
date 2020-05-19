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
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		
		if(f instanceof Fightable)
			System.out.println("f�� Figtable�������̽��� �����߽��ϴ�.");
		
		if(f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		
		if(f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		
		if(f instanceof Object)
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

class Unit {
	int currentHP;	//������ ü��
	int x;			//������ ��ġ(x��ǥ)
	int y;			//������ ��ġ(y��ǥ)
}

interface Fightable extends Movable, Attackable { }
interface Movable {	void move (int x, int y); }
interface Attackable { void attack(Unit u); }



//7-25 - �������̽��� ������ �� �𸣰��� : �̰� �ϰ����ϴ� ���� �ᱹ ����Ÿ���� �������̽���� ������ �������̽��� �޼ҵ带 ��ȯ�Ѵٴ°� ���ϴ� �ǰ�.
interface Parseable {
	//���� �м��۾��� �����Ѵ�
	public abstract void parse(String fileName);
}

class ParserManager {
	//����Ÿ���� Parseable�������̽��̴�.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser(); //����Ÿ���� Parseable�ϱ� xml�� parse�޼ҵ� ��ȯ?
		}else {
			Parseable p = new HTMLParser();
			return p;	//html�� parse�޼ҵ� ��ȯ?
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
		super(150);		//Tank�� hp�� 150�̴�.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);		//Dropship�� hp�� 125�̴�.
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
				//Unit�� HP�� ������Ų��.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�");
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
		a.autoPlay(new B2());	// void autoPlay(I i)ȣ��
		a.autoPlay(new C2());	// void autoPlay(I i)ȣ��	
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
		System.out.println(i.toString());	//i�� ObjectŬ������ �޼��� ȣ�Ⱑ��
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



//7-30 : defalut�޼ҵ�� �߻�޼ҵ尡 �ƴѰ��ΰ�? �׷��� �� å������ �߻�޼ҵ��� �⺻���� ������ �����Ѵٰ� �ϸ鼭 �߻�޼ҵ尡 �ƴ϶���ϴ°�?
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
		System.out.println("method1() in Child");	//�������̵�
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
//		static int cv = 100;			//����.staticŬ������ �ƴϿ��� static���� ����Ұ� 
		final static int COST = 100;	//final static�� ������� ���
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;		//staticŬ����aks static����� �����Ҽ� �ִ�.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;			//error! static���� ����Ұ�
			final static int CONST = 300;	//fianl static�� ������� ���
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
	
	//�ν��Ͻ���� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	//static ��������� ���� ���������� �����ϴ�.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static����� �ν��Ͻ������ ���� ������ �� ����.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//���������Ϸ��� �Ʒ��� ���� ��ü�� �����ؾ��Ѵ�.
		//�ν��Ͻ�Ŭ������ �ʺ� Ŭ������ ���� �����ؾ߸� ������ �� �ִ�.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//�ν��Ͻ��޼ҵ忡���� �ν��Ͻ������ static��� ��� ���� �����ϴ�.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//�޼ҵ� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �� �� ����.
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
		int iiv = outerIv;	//�ܺ� Ŭ������ private����� ���ٰ����ϴ�.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//����ƽũ�������� �ܺ� Ŭ������ �ν��Ͻ������ ���� �Ҽ� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;	//jdk1.8���� final��������
		
		class LocalInner {
			int liv = outerCv;
			int liv2 = outerCv;
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
//			int liv3 = lv;	//����!!jdk1.8���� �����ƴ�
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
		//�ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		//�ܺ�Ŭ������ �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv: " + ii.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		//����ƽ����Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ��ȴ�.
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
	Object iv = new Object() {void method(){} };		//�͸�Ŭ����
	static Object cv = new Object() {void method(){} };	//�͸�Ŭ����
	
	void myMethod() {
		Object lv = new Object() {void method(){}};		//�͸�Ŭ����
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


























