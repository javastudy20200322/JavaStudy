package summary.jaeyeon.example.chap13_Thread;

class Q1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th2 = new Thread(new Thread2());
		
		th2. start();
	}

}


class Thread2 implements Runnable {
	public void run() {
		for(int i = 0 ; i<10;i++) {
			System.out.print('|');
		}
	}
	
}