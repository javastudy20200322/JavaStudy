package summary.haesung.practice.chapter06.example06;

public class Example6 {

	public static void main(String[] args)
	{
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	// 두 점 사이의 거리.
	public static double getDistance(int x1, int y1, int x2, int y2)
	{
//		double x = (x2 - x1) > 0 ? (x2 - x1) : (x1 - x2);
//		double y = (y2 - y1) > 0 ? (y2 - y1) : (y1 - y2);
//		
//		return Math.sqrt(x*x + y*y);
		
		// 어차피 제곱을 하니까 절대값 신경 안써도 되네..
		// Math.sqrt는 제곱근을 구하는 메소드
		return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
	}

}
