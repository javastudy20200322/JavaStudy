package summary.haesung.practice.chapter07.example05;

public class Product
{
	int price;		// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수
	
	// 생성자가 아무것도 없으면 기본생성자가 자동으로 생성되지만
	// 오버로딩된 다른 생성자가 있으면 기본생성자를 반드시 추가해야한다.
	Product(){}
	
	Product(int price)
	{
		this.price 		= price;
		this.bonusPoint = (int) (price/10.0);
	}
}
