package summary.haesung.practice.chapter06.example08;

public class PlayingCard
{
	// 멤버 변수 = 인스턴스 변수 + 클래스 변수
	// 클래스 변수가 번저 초기화되고, 다음으로 인스턴스 변수가 초기화 된다.
	// 멤버변수는 초기화를 하지 않아도(값을 지정하지 않아도) 각 타입에 대한 기본값으로 초기화가 자동으로 이루어진다.
	// 지역변수는 반드시 초기화를 해야한다.
	
	// 인스턴스 변수
	int kind;
	int num;
	
	// 클래스 변수 (static 변수)
	static int width;
	static int height;
	
	PlayingCard(int k, int n)
	{
		// k, n은 지역변수
		// kind, num은 인스턴스변수
		kind 	= k;
		num 	= n;
	}
	
	// args는 지역변수
	public static void main(String[] args)
	{
		// card는 지역변수
		PlayingCard card = new PlayingCard(1, 1);
	}

}
