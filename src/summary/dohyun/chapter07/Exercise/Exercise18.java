package summary.dohyun.chapter07.Exercise;

public class Exercise18 {
//실제 인스턴스와 같은 타입의 참조변수로 형변환을 해야만 인스턴스의 멤버들을 사용 
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if (r instanceof DanceRobot) {
			SingRobot dr2 = (SingRobot) r;
			dr2.sing();
		} else if (r instanceof DanceRobot) {
			DrawRobot dr3 = (DrawRobot) r;
			dr3.draw();
		}
	}

	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++)
			action(arr[i]);

	}

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
