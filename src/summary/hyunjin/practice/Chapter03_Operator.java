package summary.hyunjin.practice;

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
		System.out.println(1 + x << 33);; // 1+x = 3, 3? 2μ§μλ₯? ?Όμͺ½μΌλ‘? 33λ²? ?΄?
		System.out.println(y >= 5 || x < 0 && x > 2); //?°? ?? : λΆ??±?Έ > && > || , xκ΄?? ¨?΄?©?? ?€  falseμ§?λ§? y? true?Ό? true
		System.out.println(y += 10 - x++); //y= (y+10) -(x=x+1 ?¨ x? ????΄κΈ°μ 2λ‘μ ?°?°?΄?¨) , y = 15 - 2 , y=12
		//++i ?? i++? μ°¨μ΄? ? ?? ?§??°?°? λ¨Όμ??κ³? κ·? ?? ???? ??κ±°κ³  ??? ???(?¬?©)? λ¨Όμ???¨ ?€?? ?§??°?°? ??€κ³? ?κ°νλ©? ??
		System.out.println(x+=2); //x=x+2, ?΄? x? ?? ?°?°? ?΅?΄ 2κ°? ?? 3?΄?¨ -> x=3+2 -> 5
		System.out.println(!('A' <= c && c <='Z')); //μ²«κ΄?Έ? κ°μ?  trueμ§?λ§? !λΆμ΄? false
		System.out.println('C'-c); // C? ? ?μ½λ κ°μ? 67 λ³?? c? κ°? A? ? ?μ½λ? 65 -> 67-65 =2 
		System.out.println('5'-'0'); //?«?λ‘? ?°?°
		System.out.println(c+1); //λ³??c? κ°? A? ?μ½λ? 65, 65+1=66;
		System.out.println(++c); //c=c+1, c= 65+1 -> 66
		System.out.println(c++); //66, ?ΈμΆ? ??΄μ§? ?? ?§???  
		System.out.println(c); //?? ?°?°?Όλ‘? c=c+1?΄ ??΄ 67 -> CμΆλ ₯
		
	}
	
	public static void Exercise3_2() {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples%sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket +1;
		
		System.out.println("??? λ°κ΅¬?? ?  : " + numOfBucket);
	}
	
	public static void Exercise3_3() {
		int num = 10;
		System.out.println( num > 0 ? "??" : num < 0 ? "??" : "0" );
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
