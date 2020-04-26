package summary.jaeyeon.example.chap07_oop2;

class Product {

	int price;
	int bonusPoint;

	
	  Product() { 
		/* 기본 생성자 Product(){} 가 없기 때문에 에러가 발생한다.
		 * 생성자가 아무것도 없으면 자동으로 생성되지만
		 * 뭐라도 하나 있으면 자동으로 생성되지 않음.
		 */
	  }
	  
	  Product(int price) { this.price = price; bonusPoint = (int) (price / 10.0);
	  
	  }
	 

}

class Tv extends Product {

	Tv() {
	}

	public String toString() {
		return "Tv";
	}
}

public class Q5 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}

}
