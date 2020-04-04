package summary.haesung.example.chapter03;

public class OperatorEx12
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		
		System.out.println("a=" + a + ", b=" + b);
		
		// (a!=0)이 이미 true이므로 || 뒤를 실행하지 않는다.
		System.out.print("(a!=0) || (++b!=0) : ");
		System.out.println((a!=0) || (++b!=0));
		
		System.out.println("a=" + a + ", b=" + b);
		
		// (a==0)이 이미 false이므로 && 뒤를 실행하지 않는다.
		System.out.print("(a==0) && (++b!=0) : ");
		System.out.println((a==0) && (++b!=0));
		
		System.out.println("a=" + a + ", b=" + b);
		
		System.out.println();
		
		boolean bool = true;
		System.out.println(bool);
		System.out.println(!bool);
		System.out.println(!!bool);
		System.out.println(!!!bool);
	}
}
