package summary.haesung.example.chapter02;

public class CastingEx1
{

	public static void main(String[] args)
	{
		double 	d 		= 85.6;
		
		// ()는 '캐스트 연산자', '형변환 연산자'라고 한다.
		int 	score 	= (int) d;
		
		// 실수형에서 정수형으로 변환할 때 소수점 이하의 값은 반올림이 아니라 버림이다.
		System.out.println("score : " + score);
		
		// 형변환 후에도 원래 변수인 d의 값은 변함없다.
		System.out.println("d : " + d);
	}

}
