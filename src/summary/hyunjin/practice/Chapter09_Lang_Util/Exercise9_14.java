package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-14] ������ ȭ�����κ��� ��ȭ��ȣ�� �Ϻθ� �Է¹޾� ��ġ�ϴ� ��ȭ��ȣ�� �־��� ���ڿ� �迭���� ã�Ƽ� ����ϴ� ���α׷��̴�. �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
//[Hint] Pattern, MatcherŬ������ ����� ��
import java.util.*;
import java.util.regex.*;

public class Exercise9_14 {

	public static void main(String[] args) {
		String[] phoneNumArr = {
			"012-3456-7890",
			"099-2456-7980",
			"088-2346-9870",
			"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			/* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.	*/				
			for(int i=0; i<phoneNumArr.length; i++) {
				String tmp = phoneNumArr[i].replace("-", "");
				
				if(tmp.indexOf(input) != -1) {
					list.add(phoneNumArr[i]);
				}
			}
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}

	}

}
