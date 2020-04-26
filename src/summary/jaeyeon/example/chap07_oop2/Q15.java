package summary.jaeyeon.example.chap07_oop2;

class Unit {
}

class AirUnit extends Unit {
}

class GroundUnit extends Unit {
}

class Tank extends GroundUnit {
}

class AirCraft extends AirUnit {
}

public class Q15 {
	public static void main(String[] args) {

		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		u = (Unit)ac; 	//u 는 AirCraft 의 조상인 Unit 타입이므로 형변환이 가능하다.
		u = ac;			// 업캐스팅(자손 -> 조상) 이므로 형변환을 생략할 수 있다.
		GroundUnit gu = (GroundUnit)u;
		AirUnit au = ac;
		t = (Tank)u;  	//조상 타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
		GroundUnit gu1 = t;
		
		
	}
}
