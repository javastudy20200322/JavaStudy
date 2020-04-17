package practice.week03.haesung;

import java.util.Scanner;

/**
 * <pre>
 * Date		: 2020. 4. 17.
 * Author 	: pureboyz
 * 
 * 나름 잘 된거같은데..?
 * 동서남북으로 확인하는 코드를 좀 심플하게 할 수 없나.. ㅠㅠ
 * </pre>
 */
public class U_Turn_Haesung
{
	static Scanner scanner = new Scanner(System.in);

	static int R = 0;	// 지도의 행의 수
	static int C = 0;	// 지도의 열의 수
	
	public static void main(String[] args)
	{
		// 지도의 크기를 입력받음.
		R = getMapSize();
		C = getMapSize();
		
		// 입력받은 크기의 지도를 생성.
		String[][] map = new String[R][C];
		
		// 지도를 그린다.
		for(int i=0; i<map.length; i++)
		{
			map[i] = scanner.next().split("");
		}
		
		// 막다른 길이 없다면 0을, 그렇지 않다면 1을 출력한다.
		System.out.println(isExistMoreTwoRoad(map) ? 0 : 1);
		
		
		// 그냥.. 지도 보여줌. ㅋㅋㅋ
		System.out.println("\n지도!");
		for(int i=0; i<map.length; i++)
		{
			for(int j=0; j<map[i].length; j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	// 지도의 크기를 입력받음.
	static int getMapSize()
	{
		while(true)
		{
			int input = scanner.nextInt();
			
			// 입력받은 수가 3과 10사이의 수이면 해당 값을 리턴한다.
			if((3 <= input) && (input <= 10))
			{
				return input;
			}
			else
			{
				System.out.println("3과 10사이의 숫자를 입력해주세요.");
			}
		}
	}
	
	// 현재 길에서 갈 수 있는 길이 하나 이하인지 확인한다.
	// 갈 수 있는 길의 수가 1 또는 0인 경우 막다른 길이므로 false를 리턴한다.
	static boolean isExistMoreTwoRoad(String[][] map)
	{
		// 갈 수 있는 길이 2개 이상이면 true, 그렇지 않으면 false
		boolean isExistMoreTwoRoad = true;
		
		EXIT:
		for(int i=0; i<map.length; i++)
		{
			for(int j=0; j<map[i].length; j++)
			{
				// 현재 위치가 빌딩이 아닌 길인경우.
				if(map[i][j].equals("."))
				{
					// 동서남북으로 지도가 존재하는지 확인.
					boolean isExistEastMap 	= (j != (C - 1));
					boolean isExistWestMap 	= (j != 0);
					boolean isExistSouthMap = (i != (R - 1));
					boolean isExistNorthMap = (i != 0);
					
					// 갈 수 있는 길의 수
					int numberOfRoads = 0;
					
					// 동쪽으로 지도가 있고, 그 지도가 길이면 numberOfRoads를 1증가시킨다.
					if(isExistEastMap && (map[i][j+1].equals(".")))
					{
						numberOfRoads++;
					}
					
					// 서쪽으로 지도가 있고, 그 지도가 길이면 numberOfRoads를 1증가시킨다.
					if(isExistWestMap && (map[i][j-1].equals(".")))
					{
						numberOfRoads++;
					}
					
					// 남쪽으로 지도가 있고, 그 지도가 길이면 numberOfRoads를 1증가시킨다.
					if(isExistSouthMap && (map[i+1][j].equals(".")))
					{
						numberOfRoads++;
					}
					
					// 북쪽으로 지도가 있고, 그 지도가 길이면 numberOfRoads를 1증가시킨다.
					if(isExistNorthMap && (map[i-1][j].equals(".")))
					{
						numberOfRoads++;
					}
					
					// 현재 지도에서 갈 수 있는 길의 수가 1개 이하이면 isExistMoreTwoRoad를 false로 변경 후 메소드 종료.
					if(numberOfRoads <= 1)
					{
						isExistMoreTwoRoad = false;
						break EXIT;
					}
				}
			}
		}
		
		return isExistMoreTwoRoad;
	}

}
