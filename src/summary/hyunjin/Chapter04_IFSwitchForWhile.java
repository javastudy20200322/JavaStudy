package summary.hyunjin;

import java.util.Scanner;

public class Chapter04_IFSwitchForWhile {

	public static void main(String[] args) {
//		Exercise4_1();
//		
//		Exercise4_2();
//		
		Exercise4_3();
//
//		Exercise3_4();

//		Exercise4_5();
		
//		Exercise4_6();
//
//		Exercise4_7();

//		Exercise4_8();
//
//		Exercise4_9();
//		
//		Exercise4_10();
		
//		Exercise4_11();
		
//		Exercise4_12();

//		Exercise4_13();

//		Exercise4_14();
//				
//		Exercise4_15();
	}

	public static void Exercise4_1() {	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String str = sc.next();
		char ch = str.charAt(0);
		int year = sc.nextInt();
		boolean powerOn = false;
		
		//1번
		if(x>10 && x<20) powerOn = true;
		//2
		if(ch!=' ' || ch!='\t') powerOn = true;
		//3
		if(ch == 'x' || ch == 'X') powerOn = true;
		//4
		if( 0<=ch && ch<=9) powerOn = true;
		//5
		if((ch>=65 && ch<=90)||(ch>=97 &&ch<=122)) powerOn = true;
		//6
		if(year%400==0 || (year%4==0 && year%100!=0)) powerOn = true;
		//7
		if(!powerOn) powerOn = true;
		//8
		if("yes".equals(str)) powerOn=true;
	}
	
	public static void Exercise4_2() {	
		int num = 0;
		for(int i=1; i<21; i++) {
			if( i%2!=0 && i%3!=0) 
				num+=i;
		}

		System.out.println(num);
	}
	
	public static void Exercise4_3() {
		int total = 0;
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
			total+=sum;			
		}
		
		System.out.println("total=" +total);
	}
	
	public static void Exercise4_4() {
		int total=0;
		for(int i=1; true; i++) {
			
			if(i%2==0)
				i*=(-1);
			
			total+=i;
			
			if(total==100) {
				System.out.println("수: " + i);
				break;
			}	
		}
	}
	
	public static void Exercise4_5() {
		int i=0;
		int j=0;
		while(i<=10) {
			while(j<=i) {
				System.out.println("*");
				j++;				
			}
			System.out.println();
			i++;
		}
		
	}
	
	public static void Exercise4_6() {
		for(int i=1;i<7;i++) {
			for(int j=1;j<7;j++) {
				if(i+j==6) 
					System.out.println("("+i+","+j+")");
			}
		}
	}
	
	public static void Exercise4_7() {
		int value = (int)(Math.random()*6) +1;
		
		System.out.println("value: " + value);
	}
	
	public static void Exercise4_8() {
		StringBuffer str = new StringBuffer();
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(2*x+4*y==10) {
					str.append("x="+x+", y="+y);
					str.append(System.getProperty("line.separator")); 
				}
			}
		}
		
		System.out.println(str.toString());
	}
	
	public static void Exercise4_9() {//답지에 -0해라는데 왜 그런지 잘 모르겟다.
		String str = "12345";//일반 십진수 더하는것 처럼 '0'의 유니코드값에다가'1'을 더하면 '1'의 유니코드값이 된다.??
		int sum = 0;
	
		for(int i=0; i<str.length(); i++) {
			String st = Character.toString(str.charAt(i));
			int num = Integer.parseInt(st);
			sum += num;
		}
		
		System.out.println("sum=" + sum);
	}
	
	
	public static void Exercise4_10() {
		int num = 12345;
		int sum = 0;

		while(num > 0) {
			sum += num%10;
			num = num / 10;
		}
		
		System.out.println("sum="+sum);
	}
	
	public static void Exercise4_11() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2);
		
		for(int i=0;i<8;i++) {
			num3= num1+num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;			
		}
	}
	
	public static void Exercise4_12() {
		
		for(int i=2;i<10;i=i+3) {
			for(int j=1;j<4;j++) {
				System.out.println(i + "*" + j + "=" + i*j +"\t" + (i+1) + "*" + j + "=" + (i+1)*j + "\t" 
				+ (i+2 > 9 ? "" : i+2 + "*") + ( i+2 > 9 ?  "" : j + "=" )  + ( i+2 > 9 ? "" :  (i+2)*j));
				
			}
			System.out.println();
		}
		
	}
	
	public static void Exercise4_13() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if(ch>='0' && ch<='9') {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
	
	public static void Exercise4_14() {
		int answer = (int)(Math.random()*10) + 1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(answer==input) {
				System.out.println(count + "번째 성공하셨습니다.");
				break;
			}else {
				if(input > answer) 
					System.out.println("입력하신 값보다 작습니다.\n");
				else 
					System.out.println("입력하신 값보다 큽니다.\n");
			}

		}while(true);
	}
	
	public static void Exercise4_15() {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			
			result = result*10 + tmp%10;
			tmp = tmp/10;
		}
		
		if(number==result) 
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
	
}
