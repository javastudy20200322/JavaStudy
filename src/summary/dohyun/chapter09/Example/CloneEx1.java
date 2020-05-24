package summary.dohyun.chapter09.Example;

class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x = " + x + ",y= " + y;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();   //clone()은 반드시 예외처리해줘야한다.
		}catch (CloneNotSupportedException e) {
		}
		return obj;
	}

}

public class CloneEx1 {

	public static void main(String[] args) {
		
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();
		
		System.out.println(original);
		System.out.println(copy);

	}

}