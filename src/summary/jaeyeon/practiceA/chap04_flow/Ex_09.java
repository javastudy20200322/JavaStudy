package summary.jaeyeon.practiceA.chap04_flow;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {

		char grade = ' ';

		System.out.print("당신의 점수를 입력하세요. (1~100)");

		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();

		switch (score) {

		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			grade = 'A';
			break;

		case 90:
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
			grade = 'B';
			break;

		case 80:
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
			grade = 'C';
			break;

		case 70:
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
			grade = 'D';
			break;
		default:
			grade ='F';
		
		}
		
	}

}
