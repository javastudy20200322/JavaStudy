package summary.jaeyeon.example.chap03;

public class Ex03_06 {

	public static void main(String[] args) {

		int fahrenheit = 100;
		float celcius = (5 / 9F * (float) (fahrenheit - 32));
		System.out.println("화씨 : " + fahrenheit);
		System.out.printf("섭씨 : %.2f", celcius);
	}
}
