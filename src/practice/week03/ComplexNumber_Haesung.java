package practice.week03;

import java.util.Scanner;

/**
 * <pre>
 * Date		: 2020. 4. 12.
 * Author 	: pureboyz
 * 
 * 일단.. 지도가 변경되도 얼추 되는 것처럼 보이지만..
 * 문제가 많은 코드임 ㅠㅠ
 * 왜 잘되는지 나도 이해가 안되니까 다시 보자 ㅠ
 * </pre>
 */
public class ComplexNumber_Haesung
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		// 원래는 입력을 받아야하지만, 그냥 초기화해버림.. ㅋㅋ
		int[][] map = {
				 {0, 1, 1, 0, 1, 0, 0}
				,{0, 1, 1, 0, 1, 0, 1}
				,{1, 1, 1, 0, 1, 0, 1}
				,{0, 0, 0, 0, 1, 1, 1}
				,{0, 1, 0, 0, 0, 0, 0}
				,{0, 1, 1, 1, 1, 1, 0}
				,{0, 1, 1, 1, 0, 0, 0}
		};
		
		// 단지의 번호가 될 변수. 0과 1은 집이 있는지 없는지 판단하는 역할이기 때문에 2로 초기화.
		int complex = 2;
		
		// 배열 map을 이중for문으로 반복.
		for(int i=0; i<map.length; i++)
		{
			for(int j=0; j<map[i].length; j++)
			{
				// Step1
				// 현재집, 오른쪽집, 아랫집의 값을 변수에 담는다.
				
				int currentHouse 	= map[i][j];	// 현재 집의 값.
				int eastHouse 		= 0;			// 오른쪽 집의 값.
				int southHouse 		= 0;			// 아래쪽 집의 값.
				
				// 오른쪽집, 아랫집의 존재여부를 변수에 담는다. (값이 0이냐 1이냐가 아니라, 오른쪽집, 아랫집이 배열의 길이를 벗어나는지 안벗어나는지의 여부)
				boolean isExistEastHouse 	= (j != (map[i].length - 1));	// 오른쪽 집의 존재여부.
				boolean isExistSouthHouse 	= (i != (map.length - 1));		// 아래쪽 집의 존재여부.

				// 오른쪽 집과 아래쪽 집이 존재하면 값을 변수에 저장한다.
				if(isExistEastHouse) { eastHouse = map[i][j+1]; }
				if(isExistSouthHouse) { southHouse = map[i+1][j]; }
				
				
				
				
				
				// Step2
				// 현재 집이 없다면 0, 존재한다면 1, 존재하는데 이미 단지에 속해있다면 단지번호(1보다 큰 수)가 currentHouse에 저장되어있다.
				// 현재집의 오른쪽 집과 아래쪽 집의 값을 확인 후 0이 아니면 현재집과 동일한 단지번호를 넣어준다.
				// 만약 오른쪽 집과 아래쪽 집이 이미 단지번호가 있다면,
				// 현재집과 오른쪽 집 또는 아래쪽 집의 단지번호를 둘 중에서 작은 단지번호로 일치시킨 후
				// 큰 단지번호를 사용하던 집을 찾아서 모두 작은 단지번호로 바꾸어준다.
				
				// 현재 집이 없다면, 작업이 필요없음.
				if(currentHouse == 0)
				{
					continue;
				}
				// 현재 집이 존재하나 단지에 속해있지 않은 경우.
				else if(currentHouse == 1)
				{
					// 현재집의 위치에 단지번호를 넣어준다.
					map[i][j] = complex;
					
					// 오른쪽 집이 존재하는 경우(오른쪽 집이 배열의 길이를 벗어나지 않는경우)
					if(isExistEastHouse)
					{
						// 오른쪽 집이 존재하지만, 단지에 속하지 않은 경우
						if(eastHouse == 1)
						{
							// 현재집과 같은 단지번호를 넣어준다.
							map[i][j+1] = complex;
						}
						// 오른쪽집이 존재하고, 단지에 속한 경우
						else if(eastHouse > 1)
						{
							// 오른쪽 집과 현재집의 단지 번호를 비교 후 작은번호로 통일시킨다.
							// 현재 집의 단지번호가 오른쪽 집의 단지번호보다 큰 경우
							if(map[i][j] > eastHouse)
							{
								// 더 큰 단지번호를 임시로 저장.
								int tmp = map[i][j];
								
								// 현재 집의 단지번호를 오른쪽 집의 단지번호와 일치시킨다.
								map[i][j] = map[i][j+1];
								
								// 더 큰 단지번호를 사용하던 집을 찾아서 일치시킨 단지번호로 바꾸어준다.
								for(int x=0; x<map.length; x++)
								{
									for(int y=0; y<map[x].length; y++)
									{
										if(map[x][y] == tmp)
										{
											map[x][y] = map[i][j];
										}
									}
								}
								
								// 단지번호가 하나 사라졌으므로 1을 빼준다.
								complex--;
							}
							// 오른쪽 집의 단지번호가 현재 집의 단지번호보다 큰 경우
							else if(currentHouse < eastHouse)
							{
								// 더 큰 단지번호를 임시로 저장.
								int tmp = map[i][j+1];
								
								// 현재 집의 단지번호를 오른쪽 집의 단지번호와 일치시킨다.
								map[i][j+1] = map[i][j];
								
								// 더 큰 단지번호를 사용하던 집을 찾아서 일치시킨 단지번호로 바꾸어준다.
								for(int x=0; x<map.length; x++)
								{
									for(int y=0; y<map[x].length; y++)
									{
										if(map[x][y] == tmp)
										{
											map[x][y] = map[i][j];
										}
									}
								}
								
								// 단지번호가 하나 사라졌으므로 1을 빼준다.
								complex--;
							}
						}
					}
					
					// 아래쪽 집이 존재하는 경우(아래쪽집이 먼저 단지번호가 배정되는 경우는 없다.)
					if(isExistSouthHouse && (southHouse == 1))
					{
						// 현재집의 단지번호를 아래쪽집에 넣어준다.
						map[i+1][j] = map[i][j];
					}
					
					// 단지번호를 1증가.
					complex++;
				}
				// 현재 집이 존재하고 단지에 속해있는 경우.(현재집이 단지에 속해있지 않은경우와 다른점은 현재집에 단지번호를 넣어주는 작업이 없다는 점.)
				else
				{
					if(isExistEastHouse)
					{
						if(eastHouse == 1)
						{
							map[i][j+1] = map[i][j];
						}
						else if(eastHouse > 1)
						{
							if(map[i][j] > eastHouse)
							{
								int tmp = map[i][j];
								
								map[i][j] = map[i][j+1];
								
								// 같은 값인걸 교체
								for(int x=0; x<map.length; x++)
								{
									for(int y=0; y<map[x].length; y++)
									{
										if(map[x][y] == tmp)
										{
											map[x][y] = map[i][j];
										}
									}
								}
								
								complex--;
							}
							else if(map[i][j] < eastHouse)
							{
								int tmp = map[i][j+1];
								
								map[i][j+1] = map[i][j];
								
								// 같은 값인걸 교체
								for(int x=0; x<map.length; x++)
								{
									for(int y=0; y<map[x].length; y++)
									{
										if(map[x][y] == tmp)
										{
											map[x][y] = map[i][j];
										}
									}
								}
								
								complex--;
							}
							
							
						}
					}
					
					if(isExistSouthHouse && (southHouse == 1))
					{
						if(southHouse == 1)
						{
							map[i+1][j] = map[i][j];
						}
						else if(southHouse > 1)
						{
							map[i][j] = map[i+1][j];
						}
					}
				}
			}
		}
		
		// 길이가 complex인 배열 complexArr를 선언 후 초기화.
		int[] complexArr = new int[complex];
		
		// 단지번호와 같은 index의 값을 1증가시킨다.
		for(int[] i : map)
		{
			for(int j : i)
			{
				complexArr[j]++;
			}
		}
		
		// 0과 1은 단지번호가 아닌 집의 존재여부를 의미하므로 (배열의 길이 - 2)가 총 단지의 수
		System.out.println(complexArr.length - 2);
		
		// 단지번호는 2부터 시작.
		for(int i=2; i<complex; i++)
		{
			System.out.println(complexArr[i]);
		}
		
		
		
		System.out.println("\n----------------------------");
		System.out.println("단지 번호!!");
		for(int[] i : map)
		{
			for(int j : i)
			{
				System.out.printf("%2d ", j);
			}
			System.out.println();
		}
	}

}
