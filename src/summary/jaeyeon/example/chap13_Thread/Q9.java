package summary.jaeyeon.example.chap13_Thread;

import javax.swing.JOptionPane;

class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9_1 th1 = new Q9_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무값이나 입력하시오");
		System.out.println("입력하신 값은 " + input + "  입니다.");
		th1.interrupt();
	}

}

class Q9_1 extends Thread {

	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); // 1초 지연
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				interrupt();// 추가
			}

		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
}