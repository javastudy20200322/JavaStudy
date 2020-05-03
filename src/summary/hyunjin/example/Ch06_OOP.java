package summary.hyunjin.example;

import java.util.Scanner;

import javax.swing.event.DocumentEvent;

class Tv {
	//TV의 속성(멤버변수)
	String color;	//색상
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	//TV의 기능(메소드)
	void power() {power = !power;}	//TV를 켜거나 끄는 기능을 하는 메소드
	void channelUp() {++channel;}	//TV의 채널을 높이는 기능을 하는 메소드
	void channelDown() {--channel;}	//TV의 채널을 낮추는 기능을 하는 메소드
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a + b; //위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long subtract (long a, long b) { return a - b; }
	long multiply (long a, long b) { return a * b; }
	double divide (double a, double b) {
		return a/b;
	}
}


public class Ch06_OOP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 메소드 번호를 눌러주세요.");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: TvTest(); break;
			case 2: TvTest2(); break;
			case 3: TvTest3(); break;
			case 4: TvTest4(); break;
			case 5: CardTest(); break;
			case 6: MyMathTest(); break;
			case 7: CallStackTest.main(); break;
			case 8: CallStackTest2.main(); break;
			case 9: PrimitiveParamEx.main(); break;
			case 10: ReferenceParamEx.main(); break;
			case 11: ReferenceParamEx2.main(); break;
			case 12: ReferenceParamEx3.main(); break;
			case 13: ReturnTest.main(); break;
			case 14: ReferenceReturnEx.main(); break;
			case 15: FactorialTest.main(); break;
			case 16: FactorialTest2.main(); break;
			case 17: main(null); break;
			case 18: PowerTest.main(); break;
			case 19: MyMathTest2.main(); break;
//			case 20: ArrayEx20(); break;
//			case 21: ArrayEx21(); break;
		}

	}

	private static void TvTest() {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
	
	private static void TvTest2() {
		Tv t1 = new Tv();	//Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의  channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의  channel값은 " + t2.channel + "입니다.");
				
		t1.channel = 7;	//channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
	
	private static void TvTest3() {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		
		t2 = t1;	//t1이 저장하고 있는 값(주소)을 t2에 저장한다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel값은" + t1.channel + "입니다.");
		System.out.println("t2의 channel값은" + t2.channel + "입니다.");
	}

	private static void TvTest4() {
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv객체 배열
		
		//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;	// tvArr[i]의 channel에 i+10을 저장
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();   //tvArr[i]의 메소드호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
	
	private static void CardTest() {
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");
	}
	
	private static void MyMathTest() {
		
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L,3L) = " + result1);
		System.out.println("subtract(5L,3L) = " + result2);
		System.out.println("multiply(5L,3L) = " + result3);
		System.out.println("divide(5L,3L) = " + result4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	

}


class CallStackTest {
	public static void main() {
		firstMethod();
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

class CallStackTest2{
	public static void main() {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod2();
		System.out.println("main(String[] args)이 시작되었음");
	}
	
	static void firstMethod2() {
		System.out.println("firstMethod()이 시작되었음");
		secondMethod2();
		System.out.println("firstMethod()이 끝났음");
	}
	
	static void secondMethod2() {
		System.out.println("secondMethod()이 시작되었음");
		System.out.println("secondMethod()이 끝났음");
	}
}

class Data { int x; }

class PrimitiveParamEx {
	public static void main() {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	//기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
}

class ReferenceParamEx {
	public static void main() {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x " + d.x);
	}
}

class ReferenceParamEx2 {
	public static void main() {
		int[] x = {10};	//크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("man() : x = "+x[0]);
	}
	
	static void change(int[] x) {	//참조형 매개변수
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}

class ReferenceParamEx3 {
	public static void main() {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);	//배열의 모든 요소를 출력
		sortArr(arr);	//배열을 정렬
		printArr(arr);	//정렬후 결과를 출력
		System.out.println("sum="+sumArr(arr));	//배열의 총합을 출력
	}
	
	static void printArr(int[] arr) {	//배열의 모든 요소를 출력
		System.out.print("[");
		
		for(int i : arr)	//향상된 for문
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {		//배열의 모든 요소의 합을 반환
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	static void sortArr(int[] arr) {	//배열을 오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	}//sortArr(int[] arr)
}

class ReturnTest {
	public static void main(){
		int result = add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		add(3, 5, result2);
		System.out.println(result2[0]);
	}

	static int add(int a, int b) {
		return a + b;
	}
	
	static void add(int a, int b, int[] result) {
		result[0] = a + b;	//매개벼수로 넘겨받은 배열에 연산결과를 저장
	}
}

class ReferenceReturnEx{
	public static void main(){
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = "+ d.x);
		System.out.println("d2.x = "+ d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
}

class FactorialTest{
	public static void main(){
		int result = factorial(4);
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1);	//다시 메소드 자신을 호출한다.
		
		return result;
	}
}

class FactorialTest2{
	static long factorial(int n) {
		if(n<=0 || n>20) return -1;	//매개변수 유효성 검사
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(){
		int n = 21;
		long result = 0;
		
		for(int i=1; i<=n ; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n",n);
				break;
			}
			System.out.printf("%2d!=%20%n", i, result);
		}
	}
}


class PowerTest {
	public static void main(){
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x,n-1);
	}
}

class MyMath2{
	long a, b;
	
	// 인스턴스변수 a,b만을 이용해서 작업하므로 매개변수가 필요 없다.
	long add()		{ return a + b; }	// a,b는 인스턴스 변수
	long substract(){ return a - b; }
	long multiply() { return a * b; }
	long divide()	{ return a / b; }
	
	//인스턴스변수와 관계없이 매개벼수만으로 작업이 가능하다.
	static long	add(long a, long b) { return a + b; }	// a, b는 지역변수
	static long	substract(long a, long b)	{ return a - b; }
	static long	multiply(long a, long b)	{ return a * b; }
	static double	divide(double a, double b)	{ return a / b; }
}

class MyMathTest2 {
	public static void main(){
		//클래스메소드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();	//인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		
		//인스턴스메소드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	//에러.클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	//이처럼 객체를 생성해야 사용가능
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	//에러.클래스메소드에서 인스턴스변수를 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	//객체를 생성한 후에야 인스턴스 변수의 참조가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		//인스턴스메소등서는 인스턴스변수를 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	//에러. 클래스메소드에서는 인스턴스메소드를 호출할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); 	//인스턴스를 생성한 후에야 호출할 수 있음.
	}
	
	void instaneMethod2() {	//인스턴스메소드에서는 인스턴스메소드와 클래스메소드
		staticMethod1();	//모두 인스턴스 생성없이 바로 호출이 가능하다.
		instanceMethod1();
	}
}

class OverloadingTest {
	public static void main(){
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과:" + mm.add(3,3)); 
	}
}

class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.println("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {	// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.println("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result+= a[i];
		}
		return result;
	}
}

class VarArgsEx {
	public static void main(){
		String[] strArr = {"100","200","300"};
				
		System.out.println(concatenate("","100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[]{"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0]) +"]");
		System.out.println("["+concatenate(",")+"]");
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str +delim;
		}
		return result;
	}
	
//	static String concatenate (String... args) {
//		return concatenate("",args);
//	}
}

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x){	//매갠수가 있는 생성자
		value = x;
	}
}

class ConstructorTest {
	public static void main(){
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();		// complie error발생
	}
}

class Car {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car(){}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

class CarTest {
	public static void main(){
		Car c1 = new Car();
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		System.out.println("c1의 color= " + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}

class Car2 {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car2() {
		this("white","auto",4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2 {
	public static void main(){
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color= " + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}

class Car3 {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car3() {
		this("white","auto",4);
	}
	
	Car3(Car3 c1){	//인스턴스의 복사를 위한 생성자
		color = c1.color;
		gearType = c1.gearType;
		door = c1.door;
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest3 {
	public static void main(){
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	//c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color= " + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
		c1.door = 100; //c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color= " + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}

class BlockTest {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main() {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}

class StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			//1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main() {
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] : " + arr[i]);
	}
}

class Product {
	static int count = 0;	//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			//인스턴스 고유의 번호
	
	{
		++count;
		serialNo = count;
	}
	
	public Product() {}	//기본생성자, 생략가능
}

class ProductTest {
	public static void main() {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}

class Document {
	static int count = 0;
	String name;	//문서명 (Document name)
	
	Document(){		//문서생성시 문서명을 지정하지 않았을 때
		this("제목없음"+ ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main() {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}










	