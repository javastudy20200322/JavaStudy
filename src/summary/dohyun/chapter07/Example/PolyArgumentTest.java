//package summary.dohyun.chapter07.Example;
//
//class Product {
//	int price;
//	int bonusPoint;
//
//	Product(int price) {
//		this.price = price;
//		bonusPoint = (int) (price / 10.0);
//	}
//}
//
//class Tv extends Product {
//
//	Tv() {
//		super(100); // 조상클래스인 프로덕트(int price)를 호출한다. tv의가격을 100으로 한다.
//	}
//
//	public String toString() {
//		return "Tv";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		super(200);
//	}
//
//	public String toString() {
//		return "Computer";
//	}
//}
//
//class Buyer {
//	int money = 1000; // 소유 금액
//	int bonusPoint = 0;
//
//	void buy(Product p) { // 여기 주목 !!! 매개변수가 Product타입의 참조변수라는것은, 메서드의 매개변수로 Product 클래스의 자손타입의 참조변수면
//		// 어느것이나 매개변수로 받아들일수 있다는 뜻이다.
//		if (money < p.price) {
//			System.out.println("잔액이 부족함네다");
//			return;
//		}
//
//		money -= p.price; // 가진돈에서 구입한 제품 가격뺌
//		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을 구입했씁니다.");
//	}
//}
//
//public class PolyArgumentTest {
//	public static void main(String[] args) {
//
//		Buyer b = new Buyer();
//		// Tv클래스와 Computer 클래스는 프로덕트클래스의 자손이므로 위의 코드와 같이 buy (Product p) 메서드에 매개변수로
//		// Tv인스턴스와 Computer인스턴스를 제공하는것이 가능하다.
//		b.buy(new Tv());
//		b.buy(new Computer());
//		System.out.println("현재남은돈 : " + b.money + "만원입니다.");
//		System.out.println("현재 보너스 점수 : " + b.bonusPoint + "점입니다.");
//
//	}
//
//}