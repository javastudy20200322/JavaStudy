package summary.jaeyeon.example.chap07_oop2;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {

	double r;

	@Override
	double calcArea() {
		return 0;
	}

}

class Rectangle extends Shape {

	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		}
	}

	@Override
	double calcArea() {
		return 0;
	}

	boolean isSquare() {
		if (width == height) {
			System.out.println("정사각형입니다.");
			return true;
		}
		System.out.println("정사각형이 아닙니다.");
		return false;
	}

}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Q22 {
	public static void main(String[] args) {

	}
}
