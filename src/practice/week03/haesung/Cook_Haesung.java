package practice.week03.haesung;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 * Date		: 2020. 4. 12.
 * Author 	: develiberta
 * Refer	: baekjoon, https://www.acmicpc.net/problem/2953
 * 
 * 요리 대회 우승자 구하기
 * 
 * 총 5명의 참가자가 있고, 각 참가자에게는 4개의 평가 점수가 주어집니다.
 * 위의 설명에 대응하는 5행 5열의 행렬은 문제에서 다음과 같이 주어집니다.
 * 각 행에 참가자 번호, 평가 점수1, 평가 점수2, 평가점수 3, 평가 점수4가 차례로 주어집니다.
 * 우승자 번호와 그가 얻은 점수를 출력하세요.
 * [예제 출력 예시] 4, 19
 * 
 * ## 출제의도
 * 2차원 배열을 이해합니다.
 * </pre>
 */
public class Cook_Haesung {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[][] cook = {
				{5, 4, 4, 5},
				{5, 4, 4, 4},
				{5, 5, 4, 4},
				{5, 5, 5, 4},
				{4, 4, 4, 5}
		};
		
		// 길이가 2인 배열 선언.
		// index0 = 우승자번호
		// index1 = 우승자가 얻은 점수
		int[] winnerInfo = new int[2];
		
		// 참가자의 점수 중에서 가장 높은 점수를 저장하는 변수.
		int maxScore = 0;
		
		for(int i=0; i<cook.length; i++)
		{
			// 참가자가 얻은 점수의 합을 currentScore에 저장.
			int currentScore = 0;
			for(int score : cook[i])
			{
				currentScore += score;
			}
			
			// maxScore보다 currentScore가 크면
			// winnerInfo배열에 참가자의 번호와 얻은 점수를 저장.
			if(maxScore < currentScore)
			{
				maxScore 		= currentScore;
				winnerInfo[0] 	= i+1;
				winnerInfo[1] 	= maxScore;
			}
		}
		
		System.out.println("우승자 번호와 그가 얻은 점수는???");
		System.out.println(winnerInfo[0] + " " + winnerInfo[1]);
		
	}
}
