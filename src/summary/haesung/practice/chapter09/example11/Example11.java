package summary.haesung.practice.chapter09.example11;

/**
 * <pre>
 * Date		: 2020. 5. 16.
 * Author 	: pureboyz
 * 
 * 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력하는 프로그램을 작성하시오.
 * 예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.
 * </pre>
 */
public class Example11
{

	public static void main(String[] args)
	{
		if(args.length <= 0) { System.exit(0); }
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if(((2 <= a) && (a <= 9)) && ((2 <= b) && (b <= 9)))
		{
			for(int i=a; i<=b; i++)
			{
				for(int j=1; j<=9; j++)
				{
					System.out.println(i + "*" + j + "=" + i*j);
				}
				System.out.println();
			}
		}
	}

}
