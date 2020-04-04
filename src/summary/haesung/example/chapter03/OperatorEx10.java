package summary.haesung.example.chapter03;

public class OperatorEx10
{
	public static void main(String[] args)
	{
		// float 타입으로 자동형변환된 다음에 비교
		System.out.printf("10 == 10.0f	\t %b%n", 10==10.0f);
		
		// 유니코드값으로 변환하여 비교
		System.out.printf("'0' == 0 	\t %b%n", '0' == 0);		// 48 == 0
		System.out.printf("'A' == 65	\t %b%n", 'A' == 65);		// 65 == 65
		System.out.printf("'A' > 'B'	\t %b%n", 'A' > 'B');		// 65 > 66
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');	// 66 != 66
	}
}
