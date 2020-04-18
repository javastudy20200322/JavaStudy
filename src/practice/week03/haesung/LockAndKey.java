package practice.week03.haesung;

import java.util.Scanner;

public class LockAndKey
{
	static Scanner scanner = new Scanner(System.in);
	
	static int M = 0;	// 열쇠의 크기
	static int N = 0;	// 자물쇠의 크기

	public static void main(String[] args)
	{
		// 열쇠와 자물쇠의 크기를 입력받는다.
		M = getSize();
		N = getSize();
		
		// 입력받은 크기의 열쇠와 자물쇠 생성.
		int[][] key 	= new int[M][M];
		int[][] lock 	= new int[N][N];
		
		// 열쇠와 자물쇠의 값을 입력받음.
		key 	= createArray(key);
		lock 	= createArray(lock);
		
		// 자물쇠를 열 수 있는 열쇠이면 true, 그렇지 않으면 false.
		boolean isKey = false;
		
		// cnt가 1씩 증가할 때마다 key를 90도씩 회전시킨다.
		// 자물쇠를 열 수 있는지 확인하고
		// 열 수 있다면 반복문을 빠져나가며, 그렇지 않으면 key를 90도 회전시킨다.
		EXIT:
		for(int cnt=0; cnt<4; cnt++)
		{
			// lock을 key가 열 수 있는지 확인.
			isKey = isKey(lock, key);
			
			if(isKey) { break EXIT; }	// lock을 key가 열 수 있다면 반복문 종료.
			else { key = turn90(key); }	// lock을 key가 열 수 없다면 key를 90도 회전.
		}
		
		System.out.println(isKey);
	}
	
	
	
	
	
	// 열쇠와 자물쇠의 크기를 입력받는다.
	public static int getSize()
	{
		while(true)
		{
			int input = scanner.nextInt();
			
			if((3 <= input) && (input <= 20))
			{
				return input;
			}
			else
			{
				System.out.println("3과 20사이의 숫자를 입력하세요.");
			}
		}
	}
	
	// 열쇠와 자물쇠의 값을 입력받음.
	public static int[][] createArray(int[][] array)
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				array[i][j] = scanner.nextInt();
			}
		}
		
		return array;
	}
	
	// lock을 key가 열 수 있는지 확인.
	public static boolean isKey(int[][] lock, int[][] key)
	{
		// 자물쇠를 열 수 있는 열쇠이면 true, 그렇지 않으면 false.
		boolean isKey = false;
		
		// 자물쇠에 키를 놓을 수 있는 만큼만 반복.
		EXIT:
		for(int i=0; i<lock.length-key.length+1; i++)
		{
			for(int j=0; j<lock[i].length-key.length+1; j++)
			{
				// tmpArr에 자물쇠를 복사하고
				// key를 놓은 부분을 반복문을 사용하여 lock과 key 둘 중에 하나라도 1이 있으면 tmpArr의 해당 위치의 값을 1로 변경한다.
				// tmpArr의 값 중에 0이 없다면 isKey를 true로 변경 후 반복문을 종료.
				
				// 자물쇠를 복사하여 tmpArr에 저장.
				int[][] tmpArr = copyArray(lock);
				
				// lock과 key 둘 중에 하나라도 1이 있으면 tmpArr의 해당 위치의 값을 1로 변경한다.
				for(int x=0; x<key.length; x++)
				{
					for(int y=0; y<key[x].length; y++)
					{
						if((key[x][y] == 1) || (lock[x+i][y+j] == 1))
						{
							tmpArr[x+i][y+j] = 1;
						}
					}
				}
				
				// tmpArr의 값 중에 0이 있다면 isEmptyPoint는 true, 그렇지 않으면 false.
				boolean isEmptyPoint = false;
				
				// tmpArr의 값 중에 0이 있다면 isEmptyPoint를 true로 변경 후 반복문을 종료.
				EXIT_EMPTY_POINT:
				for(int a=0; a<lock.length; a++)
				{
					for(int b=0; b<lock[a].length; b++)
					{
						if(tmpArr[a][b] == 0)
						{
							isEmptyPoint = true;
							break EXIT_EMPTY_POINT;
						}
					}
				}
				
				// isEmptyPoint가 false이면 비어있는 부분이 없으므로, isKey를 true로 변경 후 반복문 종료.
				if(!isEmptyPoint)
				{
					isKey = true;
					break EXIT;
				}
			}
		}
		
		return isKey;
	}
	
	// key를 90도 회전.
	public static int[][] turn90(int[][] key)
	{
		int[][] tmpArr = copyArray(key);
		
		for(int i=0; i<key.length; i++)
		{
			for(int j=0; j<key[i].length; j++)
			{
				key[j][key.length - (i+1)] = tmpArr[i][j];
			}
		}
		
		return key;
	}
	
	// 배열 복사.
	// 매개변수로 받은 배열을 tmpArr에 복사하여, tmpArr를 반환한다.
	public static int[][] copyArray(int[][] arr)
	{
		int[][] tmpArr = new int[arr.length][arr.length];
		
		for(int i=0; i<tmpArr.length; i++)
		{
			for(int j=0; j<tmpArr[i].length; j++)
			{
				tmpArr[i][j] = arr[i][j];
			}
		}
		
		return tmpArr;
	}

}
