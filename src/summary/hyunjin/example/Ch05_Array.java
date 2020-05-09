package summary.hyunjin.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 메소드 번호를 눌러주세요.");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: ArrayEx1(); break;
			case 2: ArrayEx2(); break;
			case 3: ArrayEx3(); break;
			case 4: ArrayEx4(); break;
			case 5: ArrayEx5(); break;
			case 6: ArrayEx6(); break;
			case 7: ArrayEx7(); break;
			case 8: ArrayEx8(); break;
			case 9: ArrayEx9(); break;
			case 10: ArrayEx10(); break;
			case 11: ArrayEx11(); break;
			case 12: ArrayEx12(); break;
			case 13: ArrayEx13(); break;
			case 14: ArrayEx14(); break;
			case 15: ArrayEx15(); break;
			case 18: ArrayEx18(); break;
			case 19: ArrayEx19(); break;
			case 20: ArrayEx20(); break;
			case 21: ArrayEx21(); break;
		}
	
	}
	
	public static void ArrayEx1() {
		int[] score = new int[5]; //배열선언과 생성을 동시에
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70; //score[2]=70
		score[3] = 80;
		score[4] = 90; 
		
		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4];
		
		//for문으로 모든 배열의 요소를 출력
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n",i,score[i]);
		}
		
		System.out.printf("tmp:%d%n",tmp);
		System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난값
	}

	public static void ArrayEx2() {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;	// 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; //1~10의 값을 배열에 저장
		}
		
		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
	
	public static void ArrayEx3() {
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다.
		for(int i=0; i<arr.length; i++) 
			arr[i] = i + 1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0;i<arr.length;i++)
			tmp[i]=arr[i];
		
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);
	}
	
	public static void ArrayEx4() {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)를 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc와 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
	
	public static void ArrayEx5() {
		int sum = 0;		//총점을 저장하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) {
			sum+= score[i];
		}

		average = sum/(float)score.length; //계산결과를 float으로 얻기 위해서 형변환
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average );
	}
	
	public static void ArrayEx6() {
		int[] score = {78,88,91,33,100,55,95};
		
		int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화한다.
		int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화한다.
		
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}else if(score[i]<min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public static void ArrayEx7() {
		
		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i; //배열을 0~9의 숫자로 초기화한다.
			System.out.println(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10); //0~9의 임의의 값
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]);
		}
	}
	
	public static void ArrayEx8() {
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성;
		
		//배열의 각 요소에 1~45의 값을 저장한다.
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;	// ball[0]에 1이 저장된다.
		
		int temp = 0;	//두값을 바꾸는데 사용할 임시변수
		int j=0; 		//임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i=0; i<ball.length; i++) {
			j = (int)(Math.random()*5);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		//배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for(int i=0;i<6;i++)
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
	}
	
	public static void ArrayEx9() {
		int[] code = { -4, -1, 3, 6, 11 };	//불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void ArrayEx10() {
		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false;	//자리바꿈이 발생했늕 체크한다.
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) { //옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	//자리바꿈이 발생했으니 true로
				}
			}
			
			if(!changed)break;
			
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]); //정렬된 결과를 출력한다.
			}
			System.out.println();
		}
	}
	
	public static void ArrayEx11() {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = (int)(Math.random()*10); //0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수: " +counter[i]);
		}
	}
	
	public static void ArrayEx12() {
		String[] names = {"Kim","Park","Yi"};
		
		for(int i=0; i<names.length; i++) 
			System.out.println("names["+i+"]:"+names[i]);
		
		String tmp = names[2];	//배열 names의 세번째요소를 tmp에 저장
		System.out.println("tmp:"+tmp);
		names[0] = "Yu";	//배열 names의 첫번째 요소를 "Yu"로 변경
		
		for(String str : names) //향상된 for문
			System.out.println(str);
	}
	
	public static void ArrayEx13() {
		char[] hex = {'C','A','F','E'};
		String[] binary = { "0000","0001","0010","0011"
							,"0100","0101","0110","0111"
							,"1000","1001","1010","1011"
							,"1100","1101","1110","1111" };
		String result="";
		
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0'&&hex[i]<='9') {	
				result += binary[hex[i]-'0'];//'8'-'0'의 결과는 8이다.
			}else {	//A-F이면
				result +=binary[hex[i]-'A'+10]; //'C'-'A'의 결과는 2
			}
		}
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:"+result);
	}
	
	public static void ArrayEx14() {
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i); //src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch);
		}
		//String을 char[]로변환
		char[] chArr = src.toCharArray();
		
		//char배열(char[])을 출력
		System.out.println(chArr);
	}
	
	public static void ArrayEx15() {
		String source = "SOSHELP";
		String[] morse = {".-","-...","-.-","-..","."
						,"..-.","--.","....","..",".---"
						,"-.-",".-..","--","-.","---"
						,".--.","--.-",".-.","...","-"
						,"..--","...-",",--","-..-","-.--"
						,"--.."};
		String result = "";
		
		for(int i=0; i<source.length();i++) {
			result+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);
	}
	
	public static void ArrayEx18() {
		int[][] score = {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40}
						};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		
		for(int[] tmp :score) {
			for(int i : tmp) {
				sum+=i;
			}
		}
		
		System.out.println("sum="+sum);
	}
	
	public static void ArrayEx19() {
		int[][] score = {
							{100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
							,{50,50,50}
						};
		
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println(" 번호     국어     영어     수학     총점      평균 ");
		System.out.println("=============================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;		//개인별 총점
			float avg = 0.0f;	//개인별 평균
			
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;	//평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=============================");
		System.out.printf("총점:%3d %4d %4d%n",korTotal,engTotal,mathTotal);
	}
	
	public static void ArrayEx20() {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
		   // 1, 2, 3, 4, 5, 6, 7, 8, 9	
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0}, //1
			{ 1, 1, 1, 1, 0, 0, 1, 0, 0}, //2	
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0}, //3	
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0}, //4	
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0}, //5	
			{ 1, 1, 0, 1, 0, 0, 0, 0, 0}, //6	
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0}, //7	
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0}, //8	
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0}  //9	
		};
		
		// 1행에 행번호를, 1열에 열번호를 저장한다.
		for(int i=1; i<SIZE; i++) 
			board[0][i] = board[i][0] = (char)(i+'0');
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요. (종료는 00)>");
			String input = sc.nextLine();	//화면입력받은 내용을 input에 저장
			
			if(input.length()==2) {	// 두 글자를 입력한 경우
				x = input.charAt(0) - '0';	//문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)	//x와 y가 모두 0인 경우 종료
					break;
			}
			
			if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다 다시입력해주세요.");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			//배열 board의 내용을 화면에 출력한다.
			for(int i=0; i<SIZE; i++)
				System.out.println(board[i]);	//board[i]는 1차원배열
			
			System.out.println();
		}
	}
	
	public static void ArrayEx21() {
		final int SIZE = 5;
		int x=0, y=0, num=0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);
		
		//배열의 모든 요소를 1부터 SIZE+SIZE까지의 숫자로 초기화
		for(int i=0; i<SIZE; i++)
			for(int j=0; j<SIZE; j++)
				bingo[i][j] = i*SIZE+j+1;
		
		//배열에 저장된 값을 뒤섞는다.(shuffle)
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x=(int)(Math.random()*SIZE);
				y=(int)(Math.random()*SIZE);
				
				//bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) 
					System.out.printf("%2d", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
			String tmp = sc.nextLine();	//화면에서 입력받은 내용을 tmp에 저장
			num = Integer.parseInt(tmp);//입력받은 문자열(tmp)를 숫자로 변환
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer:
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(bingo[i][j]==num)
						bingo[i][j] = 0;
						break outer; //2중반복문을 벗어난다.
				}
			}
		}while(num!=0);
	}
	
	
	
	
	
	
	
	
	
	
}
