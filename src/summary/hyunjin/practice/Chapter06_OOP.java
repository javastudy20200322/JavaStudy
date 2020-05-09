package summary.hyunjin.practice;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Chapter06_OOP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 메소드 번호를 눌러주세요.");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: Exercise6_2.main(); break;
			case 2: Exercise6_4.main(); break;
			case 3: Exercise6_5.main(); break;
			case 4: Exercise6_6.main(); break;
			case 5: Exercise6_7.main(); break;
			case 6: PlayingCard.main(); break;
			case 7: Exercise6_19.main(); break;
			case 8: Exercise6_20.main(); break;
			case 9: Exercise6_21.main(); break;
			case 10: Exercise6_23.main(); break;
			case 11: Exercise6_24.main(); break;

		}
	}
}

class SutdaCard { //Exercise6_1
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang? "K" : "");
	}
}

class Exercise6_2 {
	public static void main() {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());	//3이 출력된다.
		System.out.println(card2.info());	//1K가 출력된다.
	}
}

class Student { //Exercise6_3
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	float average;
	
	Student(){}
	
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		total = this.kor + this.eng + this.math;
		return total;
	}

	public double getAverage() {
		this.average = (float)(this.kor + this.eng + this.math)/3;
		return Math.round(average*10)/10.0;
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
}

class Exercise6_4 {
	public static void main() {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
	}
}

class Exercise6_5 {
	public static void main() {
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}
}

class Exercise6_6 {
	static double getDistance(int x, int y, int xl, int yl) {
		int row = x-xl < 0 ? xl-x : x-xl;
		int colum = y-yl < 0 ? yl-y : y-yl;
		
		double length = Math.sqrt(Math.pow(row, 2) + Math.pow(colum, 2));
		return length;
	}
	
	public static void main() {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}

class MyPoint { //Exercise6_7
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int xl, int yl){
		return Math.sqrt((xl-x)*(xl-x) + (yl-y)*(yl-y));
	}
}

class Exercise6_7 {
	public static void main() {
		MyPoint p = new MyPoint(1, 1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}
}

class PlayingCard { //Exercise6_8
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
	
	public static void main() {
		PlayingCard card = new PlayingCard(1,1);
	}
	
	//클래스변수(static변수): width, height
	//인스턴스변수 : k,n
	//지역변수 : kind, num
}

class Marine {	//Exercise6_9
	int x=0, y=0;	//Marine의 위치좌표(x,y)
	int hp=60;		//현재체력
	static int weapon = 6; //공격력
	static int armor = 0;  //방어력
	
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//weapon, armor, weaponUp(), armorUp() : 모든 병사의 공격력과 방어력은 같아야 하니까 같이 올라야한다.
}

/*
 [6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 b. 생성자는 객체를 생성하기 위한 것이다.
 c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
 d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
 e. 생성자는 오버로딩 할 수 없다.
 -> b: 객체의 초기화를 위한 것으로 객체생성은 new연산자, e:오버로딩가능
 
 [6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
 a. 객체 자신을 가리키는 참조변수이다.
 b. 클래스 내에서라면 어디서든 사용할 수 있다.
 c. 지역변수와 인스턴스 변수를 구별할 때 사용한다.
 d. 클래스 메서드 내에서는 사용할 수 없다.
 -> b: 클래스멤버(static 변수or메소드)에서는 사용 불가
 
 [6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은?(모두 고르시오)
 a. 메서드의 이름이 같아야 한다.
 b. 매개변수의 개수나 타입이 달랑 한다.
 c. 리턴타입이 달라야 한다.
 d. 매개변수의 이름이 달라야 한다.
 -> c: 리턴타입 관련없음, d: 매개변수 이름과 상관없음 데이터타입이랑 상관있음

 [6-13] 다음 중 아래의 add메소드를 올바르게 오버로딩 한 것은?(모두 고르시오)
  long add(int a, int b) { return a+b; }
  a. long add(int x, int y) { return x+y; }
  b. long add(long a, long b) { return a+b; }
  c. int add(byte a, byte b) { return a+b; }
  d. int add(long a, int b) { return (int)(a+b); }
  -> b:매개변수 타입다름, c:매개변수  타입 다름, d:매개변수  타입 다름 (이름은 다같음)
  
 [6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은?(모두 고르시오)
  a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 않고도 값을 참조할 수 있다.
  b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
  c. 초기화블럭보다 생성자가 먼저 수행된다.
  d. 명시적 초기화를 제일 우선적으로 고려해야한다.
  e. 클래스변수보다 인스턴스변수가 먼저 초기화된다. 
  -> c:초기화블럭 수행후 생성자가 수행됨 ,e : 클래스변수가 먼저 초기화됨  
   
 [6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
	a. 기본값-명시적초기화-초기화블럭-생성자
	b. 기본값-명시적초기화-생성자-초기화블럭
	c. 기본값-초기화블럭-명시적초기화-생성자
	d. 기본값-초기화블럭-생성자-명시적초기화
	-> a

 [6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
	a. 자동 초기화되므로 별도의 초기화가 필요없다.
	b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
	c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
	d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
	e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
	->a: 자동초기화 되지 않음, e: stack영역에 생성 /heap영역에는 인스턴스변수

 [6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
   ---------
  | println |
   ---------   	
  | method1 |
   ---------
  | method2 |
   ---------
  | main    |
   ---------
	a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
	b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
	c. method2메서드를 호출한 것은 main메서드이다.
	d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
	e. main-method2-method1-println의 순서로 호출되었다.
	f. 현재 실행중인 메서드는 println 뿐이다.
	->b: println 아래의 메소드는 실행될 메소드이다.
*/

class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	
	//static int cv2 = iv; // 라인 A : 클래스변수(static)에 지역변수값을 넣을 수 없음.
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); // 라인 B : 클래스메소드에 지역변수 호출불가
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 라인 C : 인스턴스메소드에 지역변수 호출가능
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // 라인 D : 인스턴스메소드에 클래스메소드 호출불가
	}
	
	void instanceMethod2() {
		staticMethod1(); // 라인 E : 지역메소드에 클래스메소드 호출가능
		instanceMethod1();
	}
}

class Exercise6_19 {
	public static void change(String str) {
		str += "456";
	}
	
	public static void main()	{
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str); //ABC123456
	}
}

class Exercise6_20 {
	public static int[] shuffle (int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int num =(int)(Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = num;
			arr[num] = tmp;
		}
		return arr;
	}
	
	public static void main(){
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
	// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
	// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		if(volume<MAX_CHANNEL)
			volume++;
	}
	
	void volumeDown() {
	// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
		if(volume>MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
	// (4) channel의 값을 1증가시킨다.
	// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		if(MAX_CHANNEL==channel)
			channel = MIN_CHANNEL;
		else 
			channel++;
	}
	
	void channelDown() {
	// (5) channel의 값을 1감소시킨다.
	// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		if(MIN_CHANNEL==channel)
			channel = MAX_CHANNEL;
		else 
			channel--;
	}
	
} // class MyTv

class Exercise6_21 {
	public static void main() {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
	}
}

class Exercise6_22 {
	/*
	(1) isNumber메서드를 작성하시오.
	*/
	public static boolean isNumber(String str) {
		
		if(str==null || str.equals(""))
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if('0'<=ch && ch <'9') {
				return true;
			}
		}
		return false;
	}
	
	public static void main() {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
}

class Exercise6_23{
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		int num =arr[0]; 
		return num;
	}
	
	public static void main(){
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
	}
}

class Exercise6_24 {
	public static int abs(int num) {
		if(num<0)
			num*=(-1);
		
		return num;
	}
	
	public static void main() {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
}






