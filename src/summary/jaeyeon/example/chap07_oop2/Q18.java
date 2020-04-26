package summary.jaeyeon.example.chap07_oop2;

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

public class Q18 {
	static void action(Robot r) {
		if (r instanceof DanceRobot) {
			System.out.println("This is a DanceRobot instance.");
			((DanceRobot) r).dance();
		}

		if (r instanceof SingRobot) {

			System.out.println("This is a SingRobot instance.");
			((SingRobot) r).sing();
		}
		if (r instanceof DrawRobot) {

			System.out.println("This is a DrawRobot instance.");
			((DrawRobot) r).draw();
		}
		if (r instanceof Object) {

			System.out.println("This is a Object instance.");
		}
		System.out.println(r.getClass().getName());
	}
	
	public static void main(String[] args) {
		Robot [] arr = {
				new DanceRobot(), new SingRobot(), new DrawRobot()
		};
		
		for(int i = 0 ; i< arr.length; i++) {
			action(arr[i]);
		}
		
	}
}
