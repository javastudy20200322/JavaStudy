package summary.hyunjin;

public class Chapter03_Operator {

	public static void main(String[] args) {

//		Exercise3_1();
//		
//		Exercise3_2();
//		
//		Exercise3_3();
//
//		Exercise3_4();

//		Exercise3_5();
		
//		Exercise3_6();
//
//		Exercise3_7();

//		Exercise3_8();
//
//		Exercise3_9();
//		
//		Exercise3_10();
	}

	public static void Exercise3_1() {
		
		int x = 2;
		int y = 5;
		char c = 'A'; 
		char test = 'B';
		System.out.println(1 + x << 33);; // 1+x = 3, 3의 2진수를 왼쪽으로 33번 이동
		System.out.println(y >= 5 || x < 0 && x > 2); //우선순위 : 부등호 > && > || , x관련내용은 다  false지만 y는 true라서 true
		System.out.println(y += 10 - x++); //y= (y+10) -(x=x+1 단 x는 후위형이기에 2로서 연산이됨) , y = 15 - 2 , y=12
		//++i 와 i++의 차이는 전자는 덧셈연산을 먼저하고 그 후에 대입을 하는거고 후자는 대입(사용)을 먼저시킨 다음에 덧셈연산을 한다고 생각하면 되나
		System.out.println(x+=2); //x=x+2, 이때 x는 위의 연산을 통해 2가 아닌 3이됨 -> x=3+2 -> 5
		System.out.println(!('A' <= c && c <='Z')); //첫괄호의 값은  true지만 !붙어서 false
		System.out.println('C'-c); // C의 유니코드 값은 67 변수 c의 값 A의 유니코드는 65 -> 67-65 =2 
		System.out.println('5'-'0'); //숫자로 연산
		System.out.println(c+1); //변수c의 값 A유니코드는 65, 65+1=66;
		System.out.println(++c); //c=c+1, c= 65+1 -> 66
		System.out.println(c++); //66, 호출 되어진 후에 덧셈예정 
		System.out.println(c); //위의 연산으로 c=c+1이 되어 67 -> C출력
		
	}
	
	public static void Exercise3_2() {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples%sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket +1;
		
		System.out.println("필요한 바구니의 수  : " + numOfBucket);
	}
	
	public static void Exercise3_3() {
		int num = 10;
		System.out.println( num > 0 ? "양수" : num < 0 ? "음수" : "0" );
	}
	
	public static void Exercise3_4() {
		int num = 111;
		System.out.println( (num/100) * 100 );
	}
	
	public static void Exercise3_5() {
		int num = 333;
		System.out.println( (num/10)*10 + 1);
	}
	
	public static void Exercise3_6() {
		int num =24;
		System.out.println(((num/10)+1)*10 - num);
	}
	
	public static void Exercise3_7() {
		int fahrenheit = 100;
		float celcius  = (int)(( 5/9 * (fahrenheit-32)) * 100 + 0.5)/100f ;
				
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
	
	public static void Exercise3_8() {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = (float)3/2;
		long l = (long)3000 * (long)3000 * (long)3000;
		
		float f2 = 0.1f;
		double d = (float)0.1;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
	
	public static void Exercise3_9() {
		char ch = 'z';
		boolean b =  (ch>=0 && ch<=9) ? true : (ch>=65 && ch<=90) ? true : (ch>=97 &&ch<=122) ? true : false; 
				
		System.out.println(b);				
	}
	
	public static void Exercise3_10() {
		char ch = 'A';
		
		char lowerCase = (char) ((ch>=65 && ch<=90) ? (ch + 32) : ch);
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
