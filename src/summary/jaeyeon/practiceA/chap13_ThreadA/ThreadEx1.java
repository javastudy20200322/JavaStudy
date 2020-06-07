package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();

		Thread t2 = new Thread(r);// 생성자 Thread(Runnable target)

		t1.start();
		
		//만약 쓰레드 t1을 다시실행하고 싶다면 새로운 스레드를 생성하고나서 실행해야한다. 
		
		/*
		 * t1 = new ThreadEx1_1();
		 * t1.start();
		 * 
		 */
		t2.start();

	}

}

class ThreadEx1_1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}

}

class ThreadEx1_2 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.currentThread();
			System.out.println(Thread.currentThread().getName());
		}
	}

}