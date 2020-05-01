package summary.seungha.Ch07_Exercise;

/* Exercise 7-23. 문제 7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트하시오.
 * 1. 	메서드명	:	sumArea
 * 		기능		:	주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
 *		반환타입	:	double
 *		매개변수	:	Shape1[] arr
 */
class Exercise7_23 {
	
	/* (1) sumArea메서드를 작성하시오. */
	static double sumArea(Shape1[] arr) {
		double sum = 0.0d;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Shape1[] arr = {new Circle1(5.0), new Rectangle1(3,4), new Circle1(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
}

abstract class Shape1 {
	Point1 p;
	
	Shape1() {
		this(new Point1(0,0));
	}
	
	Shape1(Point1 p) {
		this.p = p;
	}
	
	abstract double calcArea();	// 도형의 면적을 계산해서 반환하는 메서드
	
	Point1 getPosition() {
		return p;
	}
	
	void setPosition(Point1 p) {
		this.p = p;
	}
}

class Point1 {
	int x;
	int y;
	
	Point1() {
		this(0, 0);
	}
	
	Point1 (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

/* (1) Circle1 클래스 */
class Circle1 extends Shape1 {
	double r;
	
	Circle1(double r) {
		this.r = r;
	}
	
	Circle1() {
		this(0.0d);
	}
	
	Circle1(Point1 p) {
		super(p);
		this.r = 0.0d;
	}
	
	Circle1(Point1 p, double r) {
		super(p);
		this.r = r;
	}
	
	double calcArea() { return Math.PI*Math.pow(r,2); }
}

/* (2) Rectangle1 클래스 */
class Rectangle1 extends Shape1 {
	double width;
	double height;
	
	Rectangle1(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	Rectangle1() {
		this(0, 0);
	}
	
	Rectangle1(Point1 p) {
		super(p);
		this.width = 0;
		this.height = 0;
	}
	
	Rectangle1(Point1 p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double calcArea() { return width*height; }
	
	boolean isSquare() {
		if (width==height) { return true; }
		return false;
	}
}