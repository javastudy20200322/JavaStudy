package summary.jaeyeon.practiceA.chap13_ThreadA;

import java.util.*;

/*
 * 이거 내일 물어보기
 * 
 * 왜 난 unknown source 라고 뜨는징..
 * 
 * 
 */

class ThreadEx11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
		ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");

		t1.start();
		t2.start();

	}

}

class ThreadEx11_1 extends Thread {
	ThreadEx11_1(String name) {
		super(name);

	}

	public void run() {
		try {
			sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadEx11_2 extends Thread {
	ThreadEx11_2(String name) {
		super(name);
	}

	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();

		int x = 0;

		while (it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread) obj;
			StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));

			System.out.println("[" + ++x + "] name : " + t.getName() + ", group : " + t.getThreadGroup().getName()
					+ ",daemon : " + t.isDaemon());

			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i]);

			}
			System.out.println();
		}

	}

}