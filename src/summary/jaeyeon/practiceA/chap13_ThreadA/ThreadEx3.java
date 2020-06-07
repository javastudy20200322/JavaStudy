package summary.jaeyeon.practiceA.chap13_ThreadA;

public class ThreadEx3 {
	public static void main(String[] args) {

		ThreadEx3_1 t1 = new ThreadEx3_1();

		t1.run();

	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}