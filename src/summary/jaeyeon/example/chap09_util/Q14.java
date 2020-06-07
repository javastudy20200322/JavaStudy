package summary.jaeyeon.example.chap09_util;

import java.util.ArrayList;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };

		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim();

			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			
			/*
			 * (1) 알맞은 코드를 넣어 완성하시오
			 * Pattern, Matcher 클래스를 사용해보기
			 */
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
				
			}else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}

	}

}
