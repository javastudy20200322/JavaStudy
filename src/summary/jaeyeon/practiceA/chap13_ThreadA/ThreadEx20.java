package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx20_1 gc = new ThreadEx20_1();

		gc.setDaemon(true);
		gc.start();
		int requiredMemory = 0;
		for (int i = 0; i < 10; i++) {
			requiredMemory = (int) (Math.random() * 10) * 20;

			/*
			 * 필요한 메모리가 사용할 수 있는 양보다 크거나
			 * 전체메모리의 60% 이상을 사용했을 경우
			 * gc를 깨운다ㅣ.
			 */
			if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();
			}
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory : " + gc.usedMemory);
		}

	}

}

class ThreadEx20_1 extends Thread {

	final static int MAX_MEMORY = 400;
	int usedMemory = 0;

	public void run() {
		while (true) {
			try {
				Thread.sleep(2 * 1000);// 2초를 기다린다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Awaken by interrupt().");
			}
			gc();
			System.out.println("Garbage Collected. FreeMemory : " + freeMemory());
		}
	}

	public void gc() {
		usedMemory -= 100;
		if (usedMemory < 0) {
			usedMemory = 0;
		}
	}

	public int totalMemory() {
		return MAX_MEMORY;
	}

	public int freeMemory() {
		return MAX_MEMORY - usedMemory;
	}

}