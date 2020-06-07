package summary.jaeyeon.example.chap07_oop2;
//실행결과 30 20 10 순서로 출력되도록 코드를 완성하시오

class Outer3{
	int value = 10;
	
	class Inner3 {
		int value  = 20;
		void method1() {
			int value = 30;
			
			System.out.println(/*(1)    */ value);
			System.out.println(/*(2)    */this.value);
			System.out.println(/*(3)    */Outer3.this.value);
		}
	}
}
class Q27 {

	public static void main(String[] args) {

		/*
		 * (4) 알맞은 코드를 넣어 완성하시오. 
		 */
		//Outer3.Inner3 inner3 = new Inner3();
		// inner3.method1();
		
	}

}
