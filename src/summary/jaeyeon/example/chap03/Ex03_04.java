package summary.jaeyeon.example.chap03;

public class Ex03_04 {

	public static void main(String[] args) {

		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples % sizeOfBucket != 0
				? (numOfApples / sizeOfBucket) + 1
				: (numOfApples / sizeOfBucket);

		System.out.println("필요한 바구니의 수 : " + numOfBucket);

	}
}
