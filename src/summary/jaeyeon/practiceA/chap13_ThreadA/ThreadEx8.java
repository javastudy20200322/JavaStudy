package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx8 {

	static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();

		th2.setPriority(7);

		System.out.println("Priority of th1(|) : " + th1.getPriority());
		System.out.println("Priority of th2(-) : " + th2.getPriority());

		th1.start();
		th2.start();

	}

}

class ThreadEx8_1 extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.printf("%s", new String("-"));
		}
	}

}

class ThreadEx8_2 extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.printf("%s", new String("|"));
		}
	}

}