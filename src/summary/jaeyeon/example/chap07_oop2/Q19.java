package summary.jaeyeon.example.chap07_oop2;

class Buyer {
	int money = 1000;
	Product19[] cart = new Product19[3];
	int i = 0;

	void buy(Product19 p) {
		System.out.println(p + " 을/를 샀습니다.");
		/*
		 * 1.가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다. 2. 가진돈이 충분하면 제품의 가격을 가진돈에서 빼고 3.
		 * 장바구니에 구입한 물건을 담는다.(add 메서드 호출)
		 */
	}

	void add(Product19 p) {
		System.out.println(p + "을/를 카트에 담습니다.");
		/*
		 * i의 값이 장바구니의 크기보다 같거나 크면 1. 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다. 2. 기존의 장바구니의 내용을 새로운
		 * 배열에 복사한다. 3. 새로운 장바구니와 기존의 장바구니를 바꾼다. 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1
		 * 증가시킨다.
		 * 
		 * 
		 */
	}

	void summary() {
		/*
		 * 장바구니에 담긴 물건들의 목록을 만들어 출력한다. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다. 물건을 사고 남은
		 * 금액(money) 을 출력한다.
		 * 
		 */
	}
}

class Product19 {
	int price; // 제품의 가격

	Product19(int price) {
		this.price = price;
	}
}

class Tv19 extends Product19 {
	Tv19() {
		super(100);

	}

	public String toString() {
		return "Tv19";
	}
}

class Computer19 extends Product19 {
	Computer19() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio19 extends Product19 {
	Audio19() {
		super(50);
	}
}

public class Q19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv19());
		b.buy(new Computer19());
		b.buy(new Tv19());
		b.buy(new Audio19());
		b.buy(new Computer19());
		b.buy(new Computer19());
		b.buy(new Computer19());

		b.summary();
	}
}
