package summary.haesung.practice.chapter06.example09;

public class Marine
{
	int x = 0, y = 0;	// Marine의 위치좌표 (x, y)
	
	int hp 		= 60;	// 현재 체력
	
	// 모든 marine 객체에 대해 동일한 값이어야 하므로 static 변수여야 한다.
	static int weapon 	= 6;	// 공격력
	static int armor 	= 6;	// 방어력
	
	// static 변수를 사용하는 메소드이므로 static 메소드여야 한다.
	static void weaponUp()
	{
		weapon++;
	}
	
	// static 변수를 사용하는 메소드이므로 static 메소드여야 한다.
	static void armorUp()
	{
		armor++;
	}
	
	void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
