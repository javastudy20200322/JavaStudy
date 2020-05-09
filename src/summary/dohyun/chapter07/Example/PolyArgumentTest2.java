package summary.dohyun.chapter07.Example;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {

	Tv() {
		super(100); // 조상클래스인 프로덕트(int price)를 호출한다. tv의가격을 100으로 한다.
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000; // 소유 금액
	int bonusPoint = 0;

	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열 item에 사용될 index

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족함네다");
			return;
		}

		money -= p.price; // 가진돈에서 구입한 제품 가격뺌
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품 Product[] item에 저장한다.

		System.out.println(p + "을 구입했씁니다.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {

		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		System.out.println("현재남은돈 : " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수 : " + b.bonusPoint + "점입니다.");

	}

}


