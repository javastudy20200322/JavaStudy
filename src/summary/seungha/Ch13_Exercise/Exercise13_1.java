package summary.seungha.Ch13_Exercise;

class Exercise13_1 {
	public static void main(String args[]) {
		Thread1 th1 = new Thread1();
		th1.start();
	}
}



class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}