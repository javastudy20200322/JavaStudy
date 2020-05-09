package summary.dohyun.chapter07.Exercise;

//답지 참고함... 뭔 소리인지 도통 모르겠네 문제가;
abstract class Shape3 {
	Point3 p;

	Shape3() {
		this(new Point3(0, 0));
	}

	Shape3(Point3 p) {
		this.p = p;
	}

	abstract double calcArea();

	Point3 getPosition() {
		return p;
	}

	void setPosition(Point3 p) {
		this.p = p;
	}

}

class Point3 {
	int x, y;

	public Point3() {
		this(0, 0);
	}

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Rect3 extends Shape3 {

	double width;
	double height;

	Rect3(double width, double height) {
		this(new Point3(0, 0), width, height);
	}

	public Rect3(Point3 p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	boolean isSquare() {
		if (width == height) {
			return true;
		}
		return false;
	}

}

class Circle3 extends Shape3 {
	double r;

	Circle3(double r) {
		this(new Point3(0, 0), r);
	}

	Circle3(Point3 p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
}

public class Exercise22 {

	public static void main(String[] args) {
		Shape3[] arr = { new Circle3(5.0), new Rect3(3, 4), new Circle3(1) };
		
		System.out.println("합 : "+ sumArea(arr));

	}

	static double sumArea(Shape3[] arr) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i].calcArea();
		}
		return sum;
	}

}

//exercise 24
/*
* 인터페이스 장점이아닌것 : e 
* 패키지끼리는 연결안됌
* 
*/
