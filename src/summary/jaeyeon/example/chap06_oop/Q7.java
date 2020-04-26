package summary.jaeyeon.example.chap06_oop;

/*
 *static 메서드와 인스턴스 메서드의 차이를 이해하기 
 *static 메서드의 경우 메서드 내에서 인스턴스 변수를 사용하지 않음.
 *매개변수(지역변수)로 작업에 필요한 값을 제공받음.
 */
class MyPoint {
	int x; // 인스턴스 변수
	int y; // 인스턴스 변수

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;

	}

	double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
		//x, y 는 인스턴스 변수

	}
}

public class Q7 {

	public static void main(String[] args) {
	
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
		//System.out.println(Q6.getDistance(1, 1, 2, 2));
		
	}

}
