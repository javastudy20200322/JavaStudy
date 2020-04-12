package summary.jaeyeon.example.chap05;

import java.util.Scanner;

public class BackJune_Middle1 {
	public static void main(String[] args) {
		// final int SIZE = 5;
		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		byte[][] apartMap1 = {
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
System.out.print("5~25 사이의 정수를 입력해주세요>");
		int tmp = sc.nextInt();
		boolean isTrue = true;
		byte[][] apartMap = new byte[tmp][tmp];

		while (isTrue) {
			if (tmp < 5 || tmp > 25) {
				System.out.println("5~25 사이의 숫자를 입력해주세요");
				isTrue = false;
			} else {
				
				for (int i = 0; i < apartMap.length; i++) {
					for (int j = 0; j < apartMap[i].length; j++) {
						int rndNum = (int) (Math.random() *2 );
						apartMap[i][j] = (byte) rndNum;
						System.out.printf("%5d", apartMap[i][j]);
					}
					System.out.println();
				}
				isTrue = false;
			}
		}
		
		if(apartMap != null) {
			int number = 1, cnt = 1;
			
			for (int i = 0; i < apartMap.length-1; i++) {
				for (int j = 0; j < apartMap[i].length-1; j++) {
					/*
					 * if(apartMap[i][j] == apartMap[i][j+1] || apartMap[i][j] == apartMap[i+1][j])
					 * {
					 * 
					 * }
					 */
					
					
				}
				System.out.println();
			}
		}
	}
}