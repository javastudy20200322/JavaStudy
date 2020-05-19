package summary.hyunjin.practice.Chapter09_Lang_Util;

import java.util.Scanner;

//[9-11] Ŀ�ǵ�������� 2~9������ �� ���� ���ڸ� �޾Ƽ� �� ���ڻ����� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ��� 3�� 5�� �Է��ϸ� 3�ܺ��� 5�ܱ��� ����Ѵ�.
public class Exercise9_11 {
	
	public static Boolean validate(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
			return false;
		}else if((1<num1 && num1 <10)||(1<num2 && num2 <10)) {
			System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int from = 0;
		int to = 0;
		

		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			if(num1 == 0 || num2 == 0) {
				System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
			}else if((num1<2 || num1 >9)||(num2<2 || num2>9)) {
				System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			}else if((num1>1 && num1<10)||(num2>1 && num2<100)) {
				break;
			}
		}
		
		if(num1>num2) {
			from = num2;
			to = num1;
		}else {
			from = num1;
			to = num2;
		}

		for(int i=from; i<=to; i++)
			for(int j=1; j<10; j++)
				System.out.printf("%d * %d = %d%n", i, j, i*j);
		
	}

}
