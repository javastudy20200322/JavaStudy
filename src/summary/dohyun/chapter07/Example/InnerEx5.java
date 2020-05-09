package summary.dohyun.chapter07.Example;

public class InnerEx5 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.Method1();
	}
}

class Outer {
	int value = 10; //Outer.this.value
	
	class Inner {
		int value = 20; // this.value;
		
		void Method1() {
			int value = 30; //value
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("Outer.this.value =" + Outer.this.value);
		}
	}
}
