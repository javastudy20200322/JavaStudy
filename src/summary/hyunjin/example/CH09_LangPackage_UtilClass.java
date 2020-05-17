package summary.hyunjin.example;

import java.util.Arrays;

public class CH09_LangPackage_UtilClass {

}

//9-1
class EquaulsEx1 {
	public static void main() {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2가 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2가 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;
	
	Value(int value){
		this.value = value;
	}
}



//9-2
class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}

class EqualsEx2 {	
	public static void main() {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2)
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}



//9-3
class HashCodeEx1 {
	public static void main() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}



//9-4
class Card1 {
	String kind;
	int number;
	
	Card1(){
		this("SPADE",1);
	}
	Card1(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {
	public static void main() {
		Card1 c1 = new Card1();
		Card1 c2 = new Card1();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}



//9-5
class ToStringTest {
	public static void main() {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
}



//9-6
class Card2 {
	String kind;
	int number;
	
	Card2(){
		this("SPADE",1);
	}
	
	Card2(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number; 
	}
}

class CardTodString2 {
	public static void main() {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}



//9-7
class Point implements Cloneable {
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" +  y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return obj;
	}
}

class CloneEx1 {
	public static void main() {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}


//9-8
class CloneEx2 {
	public static void main() {
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}



//9-9
class Circle implements Cloneable {
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {	//얇은복사
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	
	public Circle deepCopy() {		//깊은복사
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
	
	public String toString() {
		return "[p="+p+", r="+r+"]";
	}
}

class Point3 {
	int x, y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
}

class ShallowDeepCopy {
	public static void main() {
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경후 =");
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}
}



//9-10
final class Card3 {
	String kind;
	int num;
	
	Card3(){
		this("SPADE",1);
	}
	Card3(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}

class ClassEx1 {
	public static void main() throws Exception{
		Card3 c = new Card3("HEART",3);			//new 연산자로 객체생성
		Card3 c2 = Card3.class.newInstance();	//Class객체를 통해서 객체 생성
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}



//9-11
class StringEx1 {
	public static void main() {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1==str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.err.println("str3.equals(str4) ? "+str3.equals(str4));
	}
}



//9-12
class StringEx2 {
	public static void main() {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
	}
}













