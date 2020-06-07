package summary.jaeyeon.example.chap13_Thread;
/*
 * 다음의 코드는 스레드 th1 을 생성해서 실행시킨 다음 6초후에 정지시키는 코드이다.
 * 그러나 실제로 실행시켜보면 쓰레드를 정지시킨 다음에도 몇초가 지난 후에서야 멈춘다.
 * 그 이유를 설명하고, 쓰레드를 정지시키면 바로 정지되도록 코드를 개선하시오.
 * 
 */
class Q7 {
	static boolean stopped = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread6 th1 = new Thread6();
		th1.start();

		try {
			Thread.sleep(6 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stopped = true;//쓰레드를 정지시킨다.
		th1.interrupt();//일시정지 상태에 있는 쓰레드를 깨운다.
		System.out.println("stopped");
/*
 * interrupt() 를 호출해서 자고있는 스레드르 깨워야 즉시 정지하게된다.
 * 
 */
	}

}

class Thread6 extends Thread {

	public void run() {
		// Q7 stopped 의 값이 false 인 동안 반복한다.

		for (int i = 0; !Q7.stopped; i++) {
			System.out.println(i);

			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}