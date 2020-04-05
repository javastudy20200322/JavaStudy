package summary.haesung.example.chapter02;

public class CastingEx4
{

	public static void main(String[] args)
	{
		int 	i 	= 91234567;
		float 	f 	= (float) i;
		int 	i2 	= (int) f;
		
		double 	d 	= (double) i;
		int 	i3 	= (int) d;
		
		float 	f2 	= 1.666f;
		int 	i4 	= (int) f2;
		
		System.out.printf("i=%d\n", i);
		
		// int는 10자리의 정밀도를 요구하지만 float은 7자리의 정밀도를 제공하므로 오차가 생김.
		System.out.printf("f=%f i2=%d\n", f, i2);
		
		// double는 15자리의 정밀도를 제공하므로 오차가 생기지 않는다.
		System.out.printf("d=%f i3=%d\n", f, i3);
		
		// 실수형을 정수형으로 형변환 하는 경우 소수점 이하의 값은 버려진다.
		System.out.printf("(int) %f=%d\n", f2, i4);
	}

}
