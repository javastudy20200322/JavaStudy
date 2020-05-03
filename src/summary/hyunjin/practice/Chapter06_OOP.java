package summary.hyunjin.practice;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Chapter06_OOP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �޼ҵ� ��ȣ�� �����ּ���.");
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

		System.out.println(card1.info());	//3�� ��µȴ�.
		System.out.println(card2.info());	//1K�� ��µȴ�.
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
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}
}

class Exercise6_5 {
	public static void main() {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
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
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
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
	
	//Ŭ��������(static����): width, height
	//�ν��Ͻ����� : k,n
	//�������� : kind, num
}

class Marine {	//Exercise6_9
	int x=0, y=0;	//Marine�� ��ġ��ǥ(x,y)
	int hp=60;		//����ü��
	static int weapon = 6; //���ݷ�
	static int armor = 0;  //����
	
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
	//weapon, armor, weaponUp(), armorUp() : ��� ������ ���ݷ°� ������ ���ƾ� �ϴϱ� ���� �ö���Ѵ�.
}

/*
 [6-10] ���� �� �����ڿ� ���� �������� ���� ���� ����? (��� ���ÿ�)
 a. ��� �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�.
 b. �����ڴ� ��ü�� �����ϱ� ���� ���̴�.
 c. Ŭ�������� �����ڰ� �ݵ�� �ϳ� �̻� �־�� �Ѵ�.
 d. �����ڰ� ���� Ŭ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
 e. �����ڴ� �����ε� �� �� ����.
 -> b: ��ü�� �ʱ�ȭ�� ���� ������ ��ü������ new������, e:�����ε�����
 
 [6-11] ���� �� this�� ���� �������� ���� ���� ����? (��� ���ÿ�)
 a. ��ü �ڽ��� ����Ű�� ���������̴�.
 b. Ŭ���� ��������� ��𼭵� ����� �� �ִ�.
 c. ���������� �ν��Ͻ� ������ ������ �� ����Ѵ�.
 d. Ŭ���� �޼��� �������� ����� �� ����.
 -> b: Ŭ�������(static ����or�޼ҵ�)������ ��� �Ұ�
 
 [6-12] ���� �� �����ε��� �����ϱ� ���� ������ �ƴ� ����?(��� ���ÿ�)
 a. �޼����� �̸��� ���ƾ� �Ѵ�.
 b. �Ű������� ������ Ÿ���� �޶� �Ѵ�.
 c. ����Ÿ���� �޶�� �Ѵ�.
 d. �Ű������� �̸��� �޶�� �Ѵ�.
 -> c: ����Ÿ�� ���þ���, d: �Ű����� �̸��� ������� ������Ÿ���̶� �������

 [6-13] ���� �� �Ʒ��� add�޼ҵ带 �ùٸ��� �����ε� �� ����?(��� ���ÿ�)
  long add(int a, int b) { return a+b; }
  a. long add(int x, int y) { return x+y; }
  b. long add(long a, long b) { return a+b; }
  c. int add(byte a, byte b) { return a+b; }
  d. int add(long a, int b) { return (int)(a+b); }
  -> b:�Ű����� Ÿ�Դٸ�, c:�Ű�����  Ÿ�� �ٸ�, d:�Ű�����  Ÿ�� �ٸ� (�̸��� �ٰ���)
  
 [6-14] ���� �� �ʱ�ȭ�� ���� �������� ���� ���� ����?(��� ���ÿ�)
  a. ��������� �ڵ� �ʱ�ȭ�ǹǷ� �ʱ�ȭ���� �ʰ� �ʰ� ���� ������ �� �ִ�.
  b. ���������� ����ϱ� ���� �ݵ�� �ʱ�ȭ�ؾ� �Ѵ�.
  c. �ʱ�ȭ������ �����ڰ� ���� ����ȴ�.
  d. ����� �ʱ�ȭ�� ���� �켱������ ����ؾ��Ѵ�.
  e. Ŭ������������ �ν��Ͻ������� ���� �ʱ�ȭ�ȴ�. 
  -> c:�ʱ�ȭ�� ������ �����ڰ� ����� ,e : Ŭ���������� ���� �ʱ�ȭ��  
   
 [6-15] ������ �ν��Ͻ������� �ʱ�ȭ ������ �ùٸ� ����?
	a. �⺻��-������ʱ�ȭ-�ʱ�ȭ��-������
	b. �⺻��-������ʱ�ȭ-������-�ʱ�ȭ��
	c. �⺻��-�ʱ�ȭ��-������ʱ�ȭ-������
	d. �⺻��-�ʱ�ȭ��-������-������ʱ�ȭ
	-> a

 [6-16] ���� �� ���������� ���� �������� ���� ���� ����? (��� ���ÿ�)
	a. �ڵ� �ʱ�ȭ�ǹǷ� ������ �ʱ�ȭ�� �ʿ����.
	b. ���������� ����� �޼��尡 ����Ǹ� ���������� �Բ� �Ҹ�ȴ�.
	c. �ż����� �Ű������� ����� ������ ���������̴�.
	d. Ŭ���������� �ν��Ͻ��������� �޸� �δ��� ����.
	e. ��(heap)������ �����Ǹ� ������ �÷��Ϳ� ���� �Ҹ�ȴ�.
	->a: �ڵ��ʱ�ȭ ���� ����, e: stack������ ���� /heap�������� �ν��Ͻ�����

 [6-17] ȣ�⽺���� ������ ���� ��Ȳ�� �� ���� ���� ������? (��� ���ÿ�)
   ---------
  | println |
   ---------   	
  | method1 |
   ---------
  | method2 |
   ---------
  | main    |
   ---------
	a. ���� ���� ȣ�⽺�ÿ� ����� ���� main�޼����̴�.
	b. println�޼��带 ������ ������ �޼������ ��� ����� �����̴�.
	c. method2�޼��带 ȣ���� ���� main�޼����̴�.
	d. println�޼��尡 ����Ǹ� method1�޼��尡 ������ �簳�Ѵ�.
	e. main-method2-method1-println�� ������ ȣ��Ǿ���.
	f. ���� �������� �޼���� println ���̴�.
	->b: println �Ʒ��� �޼ҵ�� ����� �޼ҵ��̴�.
*/

class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	
	//static int cv2 = iv; // ���� A : Ŭ��������(static)�� ������������ ���� �� ����.
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); // ���� B : Ŭ�����޼ҵ忡 �������� ȣ��Ұ�
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // ���� C : �ν��Ͻ��޼ҵ忡 �������� ȣ�Ⱑ��
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // ���� D : �ν��Ͻ��޼ҵ忡 Ŭ�����޼ҵ� ȣ��Ұ�
	}
	
	void instanceMethod2() {
		staticMethod1(); // ���� E : �����޼ҵ忡 Ŭ�����޼ҵ� ȣ�Ⱑ��
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
	// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
	// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
		if(volume<MAX_CHANNEL)
			volume++;
	}
	
	void volumeDown() {
	// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
		if(volume>MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
	// (4) channel�� ���� 1������Ų��.
	// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
		if(MAX_CHANNEL==channel)
			channel = MIN_CHANNEL;
		else 
			channel++;
	}
	
	void channelDown() {
	// (5) channel�� ���� 1���ҽ�Ų��.
	// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
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
	(1) isNumber�޼��带 �ۼ��Ͻÿ�.
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
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
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
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
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
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	}
}






