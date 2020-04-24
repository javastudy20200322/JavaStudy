package summary.dohyun.chapter06.Practice;

public class Ex9 {

}

class Marine {
	int x=0, y=0;  //마린의 위치좌표
	int hp = 60;   // 현재 체력
	int weapon = 6; //공격력
	int armor = 0;  //방어력
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	//static 븥여하하는것은? weapon이랑 armor 왜냐면  체력과 위치는 개별적인 수치지만 공격력 방어력은 모든 병사들이 같으니깐 
}
