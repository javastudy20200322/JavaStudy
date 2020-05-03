package summary.hyunjin.practice;

import java.util.Scanner;

public class Chapter05_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 메소드 번호를 눌러주세요.");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: Exercise1(); break;
			case 2: Exercise2(); break;
			case 3: Exercise3(); break;
			case 4: Exercise4(); break;
			case 5: Exercise5(); break;
			case 6: Exercise6(); break;
			case 7: Exercise7(); break;
			case 8: Exercise8(); break;
			case 9: Exercise9(); break;
			case 10: Exercise10(); break;
			case 11: Exercise11(); break;
			case 12: Exercise12(); break;
			case 13: Exercise13(); break;
		}
	}

	public static void Exercise1() {
		int[] arr[]; //변수명 뒤에 []붙이지 않는다.
		//int[] arr1 = {1,2,3,}; //마지막 데이터 뒤에  , 붙이면 안된다.
		int[] arr2 = new int[5]; 
		//int[] arr3 = new int[5] {1,2,3,4,5}; //초기화형태이상
		//int arr4[5]; //초기화 형태 이상
		int[] arr5[] = new int[3][];
	}
	
	public static void Exercise2() {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};
		//arr[3].length = 2
	}
	
	public static void Exercise3() {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		
		System.out.println("sum="+sum);
	}
	
	public static void Exercise4() {
		int[][] arr = {
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
			average = (float)total/(arr[i].length * arr.length);
		}
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
	
	public static void Exercise5() {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length; i++) {
			int j=(int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = j;
			ballArr[j] = tmp;
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3를 복사한다.
		for(int i=0; i<3; i++)
			ball3[i] = ballArr[i];
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
	
	public static void Exercise6() {
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			if(i==0) {
				System.out.println("500원:"+money/500);
				money%=500;
			}if(i==1) {
				System.out.println("100원:"+money/100);
				money%=100;
			}
			if(i==2) {
				System.out.println("50원:"+money/50);
				money%=50;
			}
			if(i==3) {
				System.out.println("10원:"+money/10);
				money%=10;
			}
		}
	}
	
	public static void Exercise7() {
		
		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = sc.nextInt();
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500,100,50,10};	//동전의 단위
		int[] coin = {5,5,5,5};				//단위별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			coinNum = money/coinUnit[i];
			
			if(coinNum > coin[i]) 
				coinNum = coin[i];
				
			money -= coinUnit[i]*coinNum;
			coin[i] -= coinNum;
			
			System.out.println(coinUnit[i]+"원:"+coinNum);
			
		}
		
		if(money>0) {
			System.out.println("거스름돈이 부족합니다.");
			System.out.println(0);//프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 갯수 =");
		
		for(int i=0; i<coinUnit.length; i++)
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		
	}
	
	public static void Exercise8() {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			counter[answer[i]-1]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	public static void Exercise9() {

		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				result[j][i] = star[star.length-i-1][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Exercise10() {
		char[] abcCode = {
			'`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'
		};
		//				   0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("ch:"+ch);
			
			if(ch>=48 && ch<=57) {
				int num = ch;
				result+=numCode[ch-48];
			}else {
				result+=abcCode[ch-97];
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
	
	public static void Exercise11() {
		
		int[][] score = {
				{100,100,100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1]; // 4행 6열
		
		for(int i=0; i<score.length; i++) {//i<5
			for(int j=0; j<score[i].length; j++) {	//j<3	
				result[i][j] = score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
			}
			
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Exercise12() {
	
		 String[][] words = {
			 {"chair" 	 , "의자" },
			 {"computer" , "컴퓨터"},
			 {"integer"  , "정수" }
		 };
		 
		 Scanner sc = new Scanner(System.in);
		 int cnt = 0;
		 
		 for(int i=0;i<words.length;i++) {
			 System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			 String tmp = sc.nextLine();
			 
			 if(tmp.equals(words[i][1])) {
				 System.out.printf("정답입니다.%n%n");
				 cnt++;
			 }else {
				 System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			 }
		 }
		 
		 System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, cnt);
	}
	
	public static void Exercise13() {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); //String을 char[]로 변환
			
			for(int j=0; j<question.length; j++) {
				int num = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[num];
				question[num] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = sc.nextLine();
			
			//trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
		 
	}
	
	
	
	
}
