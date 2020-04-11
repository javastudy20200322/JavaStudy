package summary.haesung.example.chapter05;

/**
 * <pre>
 * Date		: 2020. 4. 8.
 * Author 	: pureboyz
 * 
 * ## args 사용하기
 * 1) .java 파일 오른쪽 클릭
 * 2) Run As
 * 3) Run Configurations...
 * 4) 실행할 .java 파일 확인
 * 5) Arguments 탭 클릭
 * 6) 매개변수 입력 - 띄어쓰기를 기준으로 매개변수가 구분된다.
 * </pre>
 */
public class ArrayEx08
{

	public static void main(String[] args)
	{
		if(args != null)
		{
			System.out.println("매개변수의 개수 : " + args.length);
			
			for(int i=0; i<args.length; i++)
			{
				System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			}
		}
	}
}
