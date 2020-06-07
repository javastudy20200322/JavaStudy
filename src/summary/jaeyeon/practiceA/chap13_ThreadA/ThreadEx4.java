package summary.jaeyeon.practiceA.chap13_ThreadA;

class ThreadEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i< 30; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간1 : " + (System.currentTimeMillis() - startTime));
		for(int i = 0; i< 30; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
	}

}
