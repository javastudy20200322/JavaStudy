package summary.jaeyeon.example.chap07_oop2;
/*
 * 다음 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오
 * 
 * 
 */
class Parent {
	
	int x = 100;
	
	Parent(){
		this(200);
	}
	Parent(int x){
		this.x = x;
	}
	int getX() {
		return x;
	}
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000);
	}
	
	Child(int x){
		this.x = x;
	}
	void method() {
		System.out.println("Child Method");
	}
}


public class Q7 {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println("x = " + c.x);
		System.out.println("x = " + c.getX());
		
	}

}
