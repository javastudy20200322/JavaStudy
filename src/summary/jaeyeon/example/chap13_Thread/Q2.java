package summary.jaeyeon.example.chap13_Thread;

/*
 * 다음 코드의 실행결과로 옳은 것은?
 * a. 01212345120212 처럼 0부터 9까지의 숫자가 섞여서 출력된다.  >> t1.start() 로 실행하면 나오는 결과.
 * b. 0123456780123456789 처럼 0부터 9까지의 숫자가 순서대로 출력된다.  (O)
 * c. illegalThreadStateException 이 발생한다.
 */

class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t1 = new Thread3();

		 t1.run();
		//t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
