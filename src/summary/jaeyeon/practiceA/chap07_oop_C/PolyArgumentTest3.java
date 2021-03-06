package summary.jaeyeon.practiceA.chap07_oop_C;

import java.util.*;

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");

	}

	void summary() {
		int sum = 0;
		String itemList = "";

		/*
		 * if(item.isEmpty()) {
		 * 
		 * System.out.println("구입하신 제품이 없습니다.");
		 * 
		 * }
		 */
		
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ",";
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + " 만원입니다.");
		System.out.println("구입하신 제품은" + itemList + " 입니다.");

	}
	
	void refund(Product p ) {
		
		/*
		 * if(item.remove(p)) { money += p.price; bonusPoint -= p.bonusPoint;
		 * System.out.println(p + "을/를 반품하셨습니다."); }else {//제거에 실패한 경우
		 * 
		 * System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		 * 
		 * }
		 */
		
		
	}
	
	

}

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();

		System.out.println("현재 남은 돈은 " + b.money + " 만원입니다.");
		System.out.println("현재 보너스 점수는  " + b.bonusPoint + " 점입니다.");
	}

}
