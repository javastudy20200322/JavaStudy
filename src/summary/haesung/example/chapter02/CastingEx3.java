package summary.haesung.example.chapter02;

public class CastingEx3
{

	public static void main(String[] args)
	{
		// float의 최대값보다 큰 값을 d1에 저장.
		double 	d1 = 1.0e100;
		float 	f1 = (float) d1;
		
		System.out.println("f1 : " + f1);

		// float의 최소값보다 작은 값을 d2에 저장.
		double 	d2 = 1.0e-50;
		float 	f2 = (float) d2;
		
		System.out.println("f2 : " + f2);
		
		float 	f3 = 9.1234567f;
		double 	d3 = 9.1234567;
		double 	d4 = (double) f3;
		
		// 빈공간이 0으로 채워지는 것을 볼 수 있다.
		// 같은 값을 저장해도 정밀도 차이 때문에 실제로는 다른값이 저장된다.
		System.out.printf("f3 = %20.18f\n", f3);
		System.out.printf("d3 = %20.18f\n", d3);
		System.out.printf("d4 = %20.18f\n", d4);
	}

}
