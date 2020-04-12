package summary.jaeyeon.example.chap05;

import java.util.Scanner;

public class BackJune_Middle1 {
	public static void main(String[] args) {
		// final int SIZE = 5;
		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		byte[][] apartMap = {
			   // 1, 2, 3, 4, 5, 6, 7
				{ 0, 1, 1, 0, 1, 0, 0 }, // 1
				{ 0, 1, 1, 0, 1, 0, 1 }, // 2
				{ 1, 1, 1, 0, 1, 0, 1 }, // 3
				{ 0, 0, 0, 0, 1, 1, 1 }, // 4
				{ 0, 1, 0, 0, 0, 0, 0 }, // 5
				{ 0, 1, 1, 1, 1, 1, 0 }, // 6
				{ 0, 1, 1, 1, 0, 0, 0 }, // 7
		};
//이게 숫자를 입력받아서 랜덤으로 0,1을 넣어줘야하는거구나.. ㅠㅠ
		
		
		for (int i = 0; i < apartMap.length; i++) {
			for (int j = 0; j < apartMap[i].length; j++) {
				System.out.printf("%5d", apartMap[i][j]);
			}
			System.out.println();
		}
	}
}
