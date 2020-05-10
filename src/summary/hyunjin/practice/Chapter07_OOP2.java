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

//[7-16] ���� �� �������� true�� �ƴ� ����? (��� ���ÿ�)
//class Car {}
//class FireEngine extends Car implements Movable {}
//class Ambulance extends Car {}
//FireEngine fe = new FireEngine();
//a. fe instanceof FireEngine
//b. fe instanceof Movable
//c. fe instanceof Object
//d. fe instanceof Car
//e. fe instanceof Ambulance
//�� :d , e



//[7-17] �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����, ��
//Ŭ������ ��ӹ޵��� �ڵ带 �����Ͻÿ�.
class Marine2 { // ����
	int x, y; // ���� ��ġ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void stop() { /* ���� ��ġ�� ���� */ }
	void stimPack() { /* �������� ����Ѵ�.*/}
}
class Tank { // ��ũ
	int x, y; // ���� ��ġ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void stop() { /* ���� ��ġ�� ���� */ }
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */}
}
class Dropship { // ���ۼ�
	int x, y; // ���� ��ġ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void stop() { /* ���� ��ġ�� ���� */ }
	void load() { /* ���õ� ����� �¿��.*/ }
	void unload() { /* ���õ� ����� ������.*/ }
}

abstract class Unit {
	abstract void move(int x,int y);
	abstract void stop();
}



//[7-18] ������ ���� �������� �򵵷� �ڵ带 �ϼ��Ͻÿ�.
//[Hint] instanceof�����ڸ� ����ؼ� ����ȯ�Ѵ�.
//�޼���� : action
//�� �� : �־��� ��ü�� �޼��带 ȣ���Ѵ�.
//DanceRobot�� ���, dance()�� ȣ���ϰ�,
//SingRobot�� ���, sing()�� ȣ���ϰ�,
//DrawRobot�� ���, draw()�� ȣ���Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : Robot r - Robot�ν��Ͻ� �Ǵ� Robot�� �ڼ� �ν��Ͻ�
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
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}



//[7-19] ������ ������ �����ϴ� ����� ������ BuyerŬ�����̴�. �� Ŭ������ ��������� ��(money)�� ��ٱ���(cart)�� ������ �ִ�. 
//��ǰ�� �����ϴ� ����� buy�޼���� ��ٱ��Ͽ� ������ ������ �߰��ϴ� add�޼���, ������ ������ ��ϰ� ���ݾ�, �׸��� ���� �ݾ��� ����ϴ� summary�޼��带 �ϼ��Ͻÿ�.
//1. �޼���� : buy
//�� �� : ������ ������ �����Ѵ�. ���� ��(money)���� ������ ������ ����,��ٱ���(cart)�� ��´�.���� ���� ���� ������ ���ݺ��� ���ٸ� �ٷ� �����Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : Product p - ������ ����
//2. �޼���� : add
//�� �� : ������ ������ ��ٱ��Ͽ� ��´�.���� ��ٱ��Ͽ� ���� ������ ������, ��ٱ����� ũ�⸦ 2��� �ø� ������ ��´�.
//��ȯŸ�� : ����
//�Ű����� : Product p - ������ ����
//3. �޼���� : summary
//�� �� : ������ ������ ��ϰ� ���ݾ�, ���� �ݾ��� ����Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : ����

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
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index
	void buy(Product p) {
		/*
		(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		 */
//		1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
		if(money <p.price) {
			System.out.println("���� �����մϴ�.");
		}
//		1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
		else if(p.price <= money) {
			money--;
//		1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
			add(p);
		}
	}
	
	void add(Product p) {
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		 */
//		1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
//		1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�.
//		1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�.
//		1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
		if(cart.length <= i) {
			Product[] tmp = new Product[cart.length*2];
			for(int j=0; j<cart.length; j++) {
				tmp[j] = cart[j]; 
			}
			cart = tmp;
		}
//		1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
		cart[i++] = p;
	} // add(Product p)
	
	void summary() {
		/*
		(3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		 */
		String list = null;
		int sum = 0;
//		1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
		for(int i=0; i<cart.length; i++) {
			if( cart[i] instanceof Tv)
				list += "TV ";
			else if( cart[i] instanceof Computer)
				list += "Computer ";
			else if( cart[i] instanceof Audio)
				list += "Audio";
			
			sum += cart[i].price;
		}
//		1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
//		1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		System.out.println("��ٱ��ϸ�� : " + list + ", �Ѱ��� :" + sum + ", �ܾ�:" + (money-sum));
	} // summary()
}


class Product {
int price; // ��ǰ�� ����
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


//[7-20] ������ �ڵ带 ������ ����� �����ÿ�.
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



//[7-21] ������ ���� attack�޼��尡 ���ǵǾ� ���� ��, �� �޼����� �Ű������� �����Ѱ� �� ������ �����ÿ�.
//interface Movable {
//	void move(int x, int y);
//}
//void attack(Movable f) {
//	/* ���� ���� */
//}
//Movable f



//[7-22] �Ʒ��� ������ ������ ShapeŬ�����̴�. �� Ŭ������ �������� �ϴ� CircleŬ������ RectangleŬ������ �ۼ��Ͻÿ�. �� ��, �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ��Ѵ�.
//(1) Ŭ������ : Circle
//����Ŭ���� : Shape
//������� : double r - ������
//(2) Ŭ������ : Rectangle
//����Ŭ���� : Shape
//������� : double width - ��
//double height - ����
//�޼��� :
//1. �޼���� : isSquare
//�� �� : ���簢������ �ƴ����� �˷��ش�.
//��ȯŸ�� : boolean
//�Ű����� : ����

abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
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



//[7-23] ����7-22���� ������ Ŭ�������� ������ ���ϴ� �޼��带 �ۼ��ϰ� �׽�Ʈ �Ͻÿ�.
//1. �޼���� : sumArea
//�� �� : �־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ�Ѵ�.
//��ȯŸ�� : double
//�Ű����� : Shape[] arr
class Exercise7_23
{
	/*
	(1) sumArea�޼��带 �ۼ��Ͻÿ�.
	*/
	public static int sumArea(Shape[] arr) {
		int sumArea = 0;
		
		for(int i=0; i<arr.length; i++) 
			sumArea += arr[i].calcArea();

		return sumArea;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
		System.out.println("������ ��:"+sumArea(arr));
	}
}



//[7-24] ���� �� �������̽��� ������ �ƴ� ����?
//a. ǥ��ȭ�� �����ϰ� ���ش�.
//b. ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
//c. �������� ���α׷����� �����ϴ�.
//d. ���߻���� �����ϰ� ���ش�.
//e. ��Ű������ ������ �����ش�.
//�� : e, ���þ���.



//[7-25] OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.
class Outer {
	class Inner {
		int iv=100;
	}
}
class Exercise7_25 {
	public static void main(String[] args) {
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println("iv: " + inner.iv);
	}
}



//[7-26] OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.
class Outer2 {
	static class Inner2 {
		int iv=200;
	}
}
class Exercise7_26 {
	public static void main(String[] args) {
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Inner2 i2 = new Inner2();
		System.out.println("i2 : " + i2);
	}
}



//[7-27] ������ ���� �������� �򵵷� (1)~(4)�� �ڵ带 �ϼ��Ͻÿ�.
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
	} // InnerŬ������ ��
} // OuterŬ������ ��

class Exercise7_27 {
	public static void main(String args[]) {
		/*
		(4) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer3 outer = new Outer3();
		Outer3.Inner3 inner = outer.new Inner3();
		
		inner.method1();
	}
}



//[7-28] �Ʒ��� EventHandler�� �͸� Ŭ����(anonymous class)�� �����Ͻÿ�.
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



//[7-29] ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� ����� static����� ��� ������ ��������, ���������� final�� ���� ����� ������ �� �ִ� ���� �����ΰ�?
//����Ŭ������ �Ҹ�� ���������� �����Ϸ��� �� �� �־.










