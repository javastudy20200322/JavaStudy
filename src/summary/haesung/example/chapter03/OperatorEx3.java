package summary.haesung.example.chapter03;

public class OperatorEx3
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		
		// int 보다 작은 크기의 타입은 연산할 때 int로 자동 형변환이 된다.
		// 좌변의 타입에 맞게 형변환을 따로 해줘야한다.
		byte c = (byte) (a + b);
		
		System.out.println(c);
	}
}
