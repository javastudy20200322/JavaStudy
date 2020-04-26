package summary.haesung.example.chapter07;

import java.util.Vector;

class Product
{
	int price;
	int bonusPoint;
	
	Product(int price)
	{
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tv_ extends Product
{
	Tv_()
	{
		// 조상클래스의 인스턴스변수를 초기화하기위해서.
		super(100);
	}
	
	public String toString()
	{
		return "Tv";
	}
}

class Computer extends Product
{
	Computer()
	{
		super(200);
	}
	
	public String toString()
	{
		return "Computer";
	}
}

class Audio extends Product
{
	Audio()
	{
		super(50);
	}
	
	public String toString()
	{
		return "Audio";
	}
}

//class Buyer
//{
//	int money 		= 1000;
//	int bonusPoint 	= 0;
//	
//	Product[] 	item 	= new Product[10];	// Product를 상속 받은 클래스들을 모두 담을 수 있다.
//	int 		i 		= 0;	// Product 배열에 사용될 카운터
//	
//	void buy(Product p)
//	{
//		if(money < p.price)
//		{
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		
//		money 		-= 	p.price;
//		bonusPoint 	+= 	p.bonusPoint;
//		item[i++] 	= 	p;
//		System.out.println(p + "을/를 구입하셨습니다.");
//	}
//	
//	void summary()
//	{
//		int 	sum 		= 0;
//		String 	itemList 	= "";
//		
//		for(int i=0; i<item.length; i++)
//		{
//			if(item[i] == null)
//			{
//				break;
//			}
//			else
//			{
//				sum 		+= item[i].price;
//				itemList 	+= item[i] + ", ";
//			}
//		}
//		
//		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
//		System.out.println("구입하신 제품은 " + itemList + "입니다.");
//	}
//}

class Buyer
{
	int money 		= 1000;
	int bonusPoint 	= 0;

	Vector item = new Vector();	// 동적으로 크기과 관리되는 객체배열.
	
	void buy(Product p)
	{
		if(money < p.price)
		{
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money 		-= 	p.price;
		bonusPoint 	+= 	p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p)
	{
		if(item.remove(p))
		{
			money 		+= p.price;
			bonusPoint 	-= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		else
		{
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary()
	{
		int 	sum 		= 0;
		String 	itemList 	= "";
		
		if(item.isEmpty())
		{
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++)
		{
			Product p = (Product)item.get(i);
			sum 		+= p.price;
			itemList 	+= (i == 0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}


public class PolyArgumentTest
{

	public static void main(String[] args)
	{
		Buyer b = new Buyer();
		
		Tv_ 		tv 			= new Tv_();
		Computer 	computer 	= new Computer();
		Audio 		audio 		= new Audio();
		
		// Tv_, Computer는 Product를 상속받고 있으므로 buy()의 매개변수로 사용할 수 있다.
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
		b.summary();
		System.out.println();
		
		b.refund(computer);
		b.summary();
	}

}
