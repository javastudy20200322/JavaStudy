package summary.jaeyeon.example.chap13_Thread;

import java.util.Scanner;
import java.util.Vector;

class Q8 {

	Vector words = new Vector();
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	int interval = 2 * 1000; // 2초

	WordGenerator wg = new WordGenerator();

	public static void main(String[] args) {

		Q8 game = new Q8();

		game.wg.start();

		Vector words = game.words;

		while (true) {
			System.out.println(words);

			String prompt = ">>";
			System.out.println(prompt);

			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();

			int index = words.indexOf(input);//입력받은 단어를 words에서

			if(index != -1) {//찾으면
				words.remove(index);//words에서 해당단어를 삭제한다.
			}
			
		}

	}

	class WordGenerator extends Thread {

		public void run() {

			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오
			 * 1. interval(2초) 마다 배열 data의 값 중 하나를 임의로 선택
			 * 2. words 에 저장한다.
			 * 
			 */
			while (true) {

				//interval(2초) 마다 배열 data의 값 중 하나를 임의로 선택
				int rand = (int)(Math.random()*data.length);
				
				//words 에 저장한다.
				words.add(data[rand]);
				
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		}
	}

}
