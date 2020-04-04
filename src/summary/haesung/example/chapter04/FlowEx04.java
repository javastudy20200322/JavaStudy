package summary.haesung.example.chapter04;

public class FlowEx04
{

	public static void main(String[] args)
	{
		int month = 3;
		
		switch(month)
		{
			// case문의 값으로 변수와 실수는 사용불가능.
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			// case문을 한 줄에 하나씩 쓰던, 한 줄에 붙여서 쓰던 상관없다.
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			// 해당하는 case가 없다면 default로 빠진다.
			default:
				System.out.println("현재 계절은 겨울입니다.");
		}
	}

}
