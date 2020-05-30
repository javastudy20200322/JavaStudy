package summary.haesung.example.chapter12;

import java.util.ArrayList;

public class FruitBoxEx
{

	public static void main(String[] args)
	{
		Box<Fruit> 	fruitBox 	= new Box<Fruit>();
		Box<Apple> 	appleBox 	= new Box<Apple>();
		Box<Toy> 	toyBox 		= new Box<Toy>();
//		Box<Grape> 	grapeBox 	= new Box<Apple>();		// 제네릭의 타입이 일치하지 않는다.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}

interface Eatable {}

// Fruit의 자손이면서 Eatable를 구현한 클래스만 가능.
class FruitBox<T extends Fruit & Eatable> extends Box<T> { public String toString() { return "Fruit"; } }

class Fruit { public String toString() { return "Fruit"; } }
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy { public String toString() { return "Toy"; } }

class Box<T>
{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}
