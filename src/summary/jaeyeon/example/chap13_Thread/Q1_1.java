package summary.jaeyeon.example.chap13_Thread;

class Q1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 th1 = new Thread1();
		
		th1. start();
	}

}


class Thread1 extends Thread{
	public void run() {
		for(int i = 0 ; i<10;i++) {
			System.out.print('-');
		}
	}
	
	
}