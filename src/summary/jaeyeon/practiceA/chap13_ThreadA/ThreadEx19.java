package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx19 {

	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx19_1 th1 = new ThreadEx19_1();
		ThreadEx19_2 th2 = new ThreadEx19_2();

		th1.start();
		th2.start();

		startTime = System.currentTimeMillis();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("소요시간 : " + (System.currentTimeMillis() - ThreadEx19.startTime));

	}

}

class ThreadEx19_1 extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.print(new String("-"));
		}
	}

}

class ThreadEx19_2 extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.print(new String("|")); //속도가 거의 10배차이..ㄷㄷㄷ
			//System.out.printf("%s", new String("|"));
		}
	}

}