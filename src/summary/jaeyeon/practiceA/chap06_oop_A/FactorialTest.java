package summary.jaeyeon.practiceA.chap06_oop_A;

public class FactorialTest {

	public static void main(String[] args) {

		int result = factorial(4);
		
		System.out.println(result);
		
		
		
	}
	
	
	static int factorial(int n) {
		int result = 0;
		
		if( n ==1 )
			{
			result = 1;
			}
		else
		{
			result = n * factorial(n-1);
		}
		
		
		return result;
		
		
	}

}
