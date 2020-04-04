package summary.haesung.example.chapter03;

public class OperatorEx5
{
	public static void main(String[] args)
	{
		int a = 1_000_000;	// 1,000,000
		int b = 2_000_000;	// 2,000,000
		
		// a * b 는 int타입의 결과값이 나오고
		// 변수 c에 대입할 때 long으로 자동형변환이 이루어진다.
		// 자동 형변환이 이루어지기 전에 이미 int타입의 범위를 벗어났기 때문에
		// 오버플로우가 발생한다.
		long c = a* b;
		
		System.out.println(c);
	}
}
