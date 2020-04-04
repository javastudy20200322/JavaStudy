package summary.haesung.example.chapter03;

public class OperatorEx1
{
	public static void main(String[] args)
	{
		int i = 5;
		int j = 0;
		
		// 후위형
		j = i++;	// j에 대입시킨 후 i의 값을 증가시킨다.
		System.out.println("j = i++; 실행 후, i=" + i + ", j=" + j);
		
		
		i = 5;
		j = 0;
		
		// 전위형
		j = ++i;	// i의 값을 먼저 증가시킨 후 j에 대입시킨다.
		System.out.println("j = --i; 실행 후, i=" + i + ", j=" + j);
	}
}
