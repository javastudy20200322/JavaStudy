package summary.jaeyeon.example.chap13_Thread;
/*
 *  Q5와는 다르게 데몬스레드로 설정하는 문장을 추가하였기 때문에
 *  th1 은 데몬스레드로 설정되었다.
 *  데몬스레드는 일반스레드가 모두 종료되면 자동종료되므로,
 *  main 스레드가 종료됨과 종시에 자동종료된다.
 *  
 *  그래서 Q5와는 다르게 th1 이 메인메서드의 종료와 동시에 종료되었음.
 *  
 */

class Q6 {
	public static void main(String[] args) throws Exception {

		Thread5 th1 = new Thread5();
		th1.setDaemon(true);//쓰레드 th1 을 데몬쓰레드로 설정한다.
		th1.start();

		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("꽝!");
	}
}

class Thread5 extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
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