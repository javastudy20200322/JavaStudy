package summary.jaeyeon.example.chap13_Thread;
/*
 * main 과 th1 두개의 쓰레드는 별도의 호출스택(call stack) 에서 실행된다.
 * 그래서 main 에서 예외가 발생하여 종료되고 호출스택이 없어져도,
 * 쓰레드 th1 이 실행되는 호출스택에서는 아무런 영향을 미치지 못한다.
 * 
 */

class Q5 {
	public static void main(String[] args) throws Exception {

		Thread4 th1 = new Thread4();
		th1.start();

		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("꽝!");
	}
}

class Thread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}