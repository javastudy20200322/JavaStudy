package summary.haesung.example.chapter03;

public class OperatorEx14
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 5;
		int z = 10;
		
		int result = 0;
		
		result = (x < y) ? z : -z;	// 조건식이 참
		System.out.println("result : " + result);
		result = (x > y) ? z : -z;	// 조건식이 거짓
		System.out.println("result : " + result);
	}
}
