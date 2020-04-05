package summary.haesung.example.chapter02;

public class VarEx2
{

	public static void main(String[] args)
	{
		// 변수의 선언과 초기화
		int x = 10, y = 20;
		int tmp = 0;
		
		// x, y의 값 확인
		System.out.println("x : " + x + " y : " + y);
		
		// x, y의 값 교환
		tmp = x;
		x 	= y;
		y 	= tmp;
		
		// 교환된 x, y의 값 확인
		System.out.println("x : " + x + " y : " + y);
	}

}
