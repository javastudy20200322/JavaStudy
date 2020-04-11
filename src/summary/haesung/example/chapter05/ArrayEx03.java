package summary.haesung.example.chapter05;

public class ArrayEx03
{

	public static void main(String[] args)
	{
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		// char 배열은 for문을 사용하지 않아도 저장된 값을 출력할 수 있다.
		System.out.println(abc);
		System.out.println(num);
		
		// 새로운 배열 생성.
		char[] result = new char[abc.length + num.length];
		
		// abc배열 0번째 index를 result배열 0번째 index에 복사하는데 abc.length만큼의 길이만큼 복사.
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
	}
}
