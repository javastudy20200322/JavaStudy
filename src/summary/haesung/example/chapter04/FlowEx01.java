package summary.haesung.example.chapter04;

public class FlowEx01
{

	public static void main(String[] args)
	{
		int x = 0;
		
		// 조건식은 true 또는 false 둘 중에 하나이어야 한다.
		// 조건식이 참일 때 수행되어야 하는 문장이 하나라면 블럭{}을 생략할 수 있다.
		if(x == 0) System.out.println("x == 0 은 참이다.");
		
		// 블럭{}은 수행되어야하는 부분을 표시해주는 것.
		// 블럭 내의 문장들은 탭으로 들여쓰기를 해서 블럭 안에 속한 문장이라는 것을 알기 쉽게 해주는것이 좋다.
		// 각 문장은 ;으로 끝을 표시해야한다.
		if(x == 0)
		{
			System.out.println("x == 0 은 참이다.");
		}
		
		// 블럭지정을 하지 않아서 두번째 출력문은 if문에 속한 문장이 아니다.
		// 조건식이 false인데 두번째 출력문이 실행된다.
		if(x != 0)
			System.out.println("x == 0 은 참이다.");
			System.out.println("x != 0 은 거짓이겠지?");
	}

}
