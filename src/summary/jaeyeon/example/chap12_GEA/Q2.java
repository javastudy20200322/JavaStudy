package summary.jaeyeon.example.chap12_GEA;

import java.util.ArrayList;

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);

	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

}

class Fruit {
	String name;
	int weight;

	Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + "(" + weight + ")";
	}
}

class FruitBox2<T extends Fruit> extends Box2<T> {
	
}


class Juicer{

	static <T extends Fruit> String makeJuice(FruitBox2<T> box) {
		String tmp = "";
		for (Fruit f : box.getList())
			tmp += f + " ";
		return tmp;
	}

}
public class Q2 {
public static void main(String[] args) {
		/*
		 * Juicer.<Apple>makeJuice(new FruitBox2<Fruit>()); Juicer.<Fruit>makeJuice(new
		 * FruitBox2<Grape>()); Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
		 */}
}
