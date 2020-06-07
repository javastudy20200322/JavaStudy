package summary.jaeyeon.practiceA.chap13_ThreadA;

import java.util.ArrayList;

class ThreadWaitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Customer implements Runnable {

	private Table table;
	private String food;

	public void run() {

	}

	boolean eatFood() {
		return table.remove(food);
	}
}

class Cook implements Runnable {
	private Table table;

	public void run() {

	}
}

class Table {

	String[] dishNames = { "donut1", "donut2", "burger" };
	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<>();

	public void add(String dish) {
		
	}
	public boolean remove(String dishName) {
		
		return false;
		
	}
	
	public int dishNum() {
		return dishNames.length;
	}
}