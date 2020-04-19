package summary.jaeyeon.example.chap06_oop;
class Marine{
	int x = 0, y = 0;//Marine 의 위치좌표(x,y)
	int hp = 60;//현재 체력
	int weapon = 6; // 공격력
	int armor = 0;//방어력
	
	
	//모든 병사의 공격력과 방어력은 같아야한다. static을 붙여야하는 멤버는 ??
	
	
	void weaponUp() {
		weapon++;
	}
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class Q9 {

	public static void main(String[] args) {

	}

}
