package summary.haesung.example.chapter03;

public class OperatorEx8
{
	public static void main(String[] args)
	{
		char c1 = 'a';

		// c1변수와 'a'는 동일한 값을 가진다.
		// c1 + 1은 변수와 리터럴의 연산이며, int 타입으로 자동형변환이 되어 연산을 수행한다.
		// 'a' + 1은 리터럴 간의 연산이다.
		// 리터럴 간의 연산은 컴파일러가 미리 계산할 수 있지만, 변수가 들어있는 경우에는 미리 계산할 수 없기 때문에
		// 형변환을 해주어야 한다.
		char c2 = (char) (c1 + 1);
		char c3 = 'a' + 1;
	}
}
