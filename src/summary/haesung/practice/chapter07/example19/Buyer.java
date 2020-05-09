package summary.haesung.practice.chapter07.example19;

public class Buyer
{
	int 		money 	= 1000;
	Product[] 	cart 	= new Product[3];
	int 		i		= 0;
	
	void buy(Product p)
	{
		if(p.price < this.money)
		{
			this.money -= p.price;
			add(p);
		}
		else
		{
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
		}
	}
	
	void add(Product p)
	{
		if(cart.length <= this.i)
		{
			Product[] oldCart = this.cart;
			Product[] newCart = new Product[this.cart.length*2];
			
			for(int i=0; i<oldCart.length; i++)
			{
				newCart[i] = oldCart[i];
			}
			
			newCart[oldCart.length] = p;
			
			this.cart = newCart;
			this.i++;
		}
		else
		{
			for(int i=0; i<cart.length; i++)
			{
				if(cart[i] == null)
				{
					cart[i] = p;
					this.i++;
					break;
				}
			}
		}
	}
	
	void summary()
	{
		String 	products = "";
		int 	price = 0;
		for(int i=0; i<cart.length; i++)
		{
			products += cart[i];
			products += ", ";
			
			price += cart[i].price;
		}
		
		System.out.println("구입한 물건 : " + products);
		System.out.println("사용한 금액 : " + price);
		System.out.println("남은 금액 : " + this.money);
	}
}
