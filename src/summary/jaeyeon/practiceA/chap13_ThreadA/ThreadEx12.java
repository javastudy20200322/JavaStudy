package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx12 {

	static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();

		th1.start();
		th2.start();

		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<<main 종료>>");

	}

}

class ThreadEx12_1 extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}

		System.out.println("<<th1 종료>>");
	}

}

class ThreadEx12_2 extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.print("|");
		}
		System.out.println("<<th2 종료>>");
	}

}