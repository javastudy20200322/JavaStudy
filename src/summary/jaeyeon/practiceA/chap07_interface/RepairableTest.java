package summary.jaeyeon.practiceA.chap07_interface;

interface Repairable {
}

interface Healable {

}


class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit implements Healable {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Marine";
	}
}

class Medic extends GroundUnit implements Healable {
	Medic() {
		super(50);
		hitPoint = MAX_HP;
	}

	void heal(Healable h) {
		if (h instanceof Unit) {
			Unit u = (Unit) h;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 의 치료가 끝났습니다.");
		}
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(50);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 의 수리가 끝났습니다.");
		}
	}
}

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();
		Medic medic = new Medic();

		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
		//repair in SCV cannot be applied to (Marine)
		medic.heal(marine);
		
		
	}

}
