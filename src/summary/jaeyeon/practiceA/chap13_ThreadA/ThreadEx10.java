package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx10 implements Runnable {

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);//이 부분이 없으면 종료되지않는다.ㅡ
		t.start();
		
		for(int i = 1; i<= 10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		
		if(i == 5) {
			autoSave = true;
		}
		
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
}
