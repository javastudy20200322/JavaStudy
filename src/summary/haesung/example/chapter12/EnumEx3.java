package summary.haesung.example.chapter12;

enum Transportation
{ 
	// 각 상수의 블럭에 추상메소드를 추가.
	// 각 상수가 하나의 객체이다.
	BUS(100) { int fare(int distance) { return distance*BASIC_FARE;}},
	TRAIN(150) { int fare(int distance) { return distance*BASIC_FARE;}},
	SHIP(100) { int fare(int distance) { return distance*BASIC_FARE;}},
	AIRPLANE(300) { int fare(int distance) { return distance*BASIC_FARE;}};

	protected final int BASIC_FARE; // protected로 해야 각 상수에서 접근가능
	
	Transportation(int basicFare)
	{
		BASIC_FARE = basicFare;
	}

	public int getBasicFare()
	{
		return BASIC_FARE;
	}

	// 추상메소드
	abstract int fare(int distance);
}

class EnumEx3
{
	public static void main(String[] args) {
		System.out.println("bus fare=" + Transportation.BUS.fare(100));
		System.out.println("train fare=" + Transportation.TRAIN.fare(100));
		System.out.println("ship fare=" + Transportation.SHIP.fare(100));
	    System.out.println("airplane fare=" + Transportation.AIRPLANE.fare(100));
	}
}
