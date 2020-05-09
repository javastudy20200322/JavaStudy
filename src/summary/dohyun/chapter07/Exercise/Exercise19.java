//package summary.dohyun.chapter07.Exercise;
//
//public class Exercise19 {
////무슨 문제인지 모르겠넹...
//	
//	public static void main(String[] args) {
//		Buyer b = new Buyer();
//		b.buy(new Tv2());
//		b.buy(new Computer());
//		b.buy(new Tv2());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.summary();
//	}
//
//}
//
//class Buyer {
//	int money = 1000;
//	Product[] cart = new Product[3];
//	int i = 0;
//
//	void buy(Product p) {
//		if (money < p.price) {
//			System.out.println("돈 없어서 프로그램 종료");
//			return;
//		} else {
//			money = money - p.price;
//			add(p);
//		}
//	}
//
//	void add(Product p) {
//		if (i >= cart.length) {
//			Product[] tmp = new Product[cart.length * 2];
//			System.arraycopy(cart, 0, tmp, 0, cart.length);
//			cart = tmp;
//		}
//		cart[i++] = p;
//	}
//
//	void summary() {
//		String item = "";
//		int sum = 0;
//
//		for (int i = 0; i < cart.length; i++) {
//			if (cart[i] == null) {
//				break;
//			}
//			item = item + cart[i];
//			sum = sum + cart[i].price;
//		}
//		System.out.println("구입한 물건 : " + item);
//		System.out.println("사용한 금액 : " + sum);
//		System.out.println("남은 금액 : " + money);
//	}
//
//	class Product {
//		int price;
//
//		Product(int price) {
//			this.price = price;
//		}
//	}
//
//	class Tv2 extends Product {
//		Tv2() {
//			super(100);
//		}
//
//		public String toString() {
//			return "TV";
//		}
//	}
//
//	class Computer extends Product {
//		Computer() {
//			super(200);
//		}
//
//		public String toString() {
//			return "Computer";
//		}
//	}
//
//	class Audio extends Product {
//		Audio() {
//			super(50);
//		}
//
//		public String toString() {
//			return "Audio";
//		}
//	}
//}
