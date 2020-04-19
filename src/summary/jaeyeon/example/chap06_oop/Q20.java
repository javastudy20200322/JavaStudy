package summary.jaeyeon.example.chap06_oop;

public class Q20 {
	static int[] shuffle(int[] array) {
		int temp = 0;
		for(int i = 0 ; i<array.length-1;i++) {
			int r = (int)(Math.random() * 10 )+1;
			temp = array[r-i];
			array[r-i] = array[r+1-i];
			array[r+1-i] = temp;
		}
		
		return array;

	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
