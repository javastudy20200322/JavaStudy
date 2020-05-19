package summary.jaeyeon.practiceA.chap07_interface;

interface Liftable {
	// 건물을 들어올린다.
	void liftOff();

	// 건물을 이동한다.
	void move(int x, int y);

	// 건물을 정지시킨다.
	void stop();

	// 건물을 착륙시킨다.
	void land();

}

class LiftableImpl implements Liftable {

	public void liftOff() {
	}

	public void move(int x, int y) {
	}

	public void stop() {
	}

	public void land() {
	}

}

public class BuildingTest {

}
