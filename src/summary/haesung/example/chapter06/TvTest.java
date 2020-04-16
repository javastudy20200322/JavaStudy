package summary.haesung.example.chapter06;

class Tv
{
	// Tv의 속성(멤버변수)
	String 	color;
	boolean power;
	int 	channel;
	
	// Tv의 기능(메서드)
	void power() { power = !power; }
	void channerUp() { ++channel; }
	void channerDown() { --channel; }
	
}

public class TvTest
{
	public static void main(String[] args)
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t3 = t1;	// t1이 저장하고 있는 값(주소)을 t3에 저장한다.
		
		t1.channel = 7;
		t1.channerDown();
		System.out.println("t1의 현재 채널은 " + t1.channel + " 입니다.");
		System.out.println("t2의 현재 채널은 " + t2.channel + " 입니다.");	// t1의 채널을 바꾸어도 t2에는 영향이 없다.
		System.out.println("t3의 현재 채널은 " + t3.channel + " 입니다.");	// t3와 t1은 같은 객체를 참조한다.
	}
}
