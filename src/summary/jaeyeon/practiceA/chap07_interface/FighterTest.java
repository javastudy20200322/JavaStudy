package summary.jaeyeon.practiceA.chap07_interface;

class Unit {
	int currentHP;
	int x;
	int y;
	
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class Fighter extends Unit implements Fightable {
	Fighter(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	public void move(int x, int y) {
	}

	public void attack(Unit u) {
	}
}

interface Fightable extends Movable, Attackable {
}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter(0);

		if (f instanceof Unit) {
			System.out.println("f 는 Unit 클래스의 자손입니다.");
		}

		if (f instanceof Fightable) {
			System.out.println("f 는  Fightable 인터페이스를 구현했니다.");
		}

		if (f instanceof Movable) {
			System.out.println("f 는  Movable 인터페이스를 구현했니다.");
		}
		if (f instanceof Attackable) {
			System.out.println("f 는  Attackable 인터페이스를 구현했니다.");
		}
		if (f instanceof Object) {
			System.out.println("f 는 Object 클래스의 자손입니다.");
		}

	}

}
