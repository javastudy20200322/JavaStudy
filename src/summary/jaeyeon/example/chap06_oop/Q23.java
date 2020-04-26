package summary.jaeyeon.example.chap06_oop;

public class Q23 {

	static int max(int[] arr) {
		int temp = 0;
		/*
		 * 주어진 int 형 배열의 값 중에서 제일 큰 값을 반환한다. 만일 주어진 배열이 null 이거나 크기가 0 인경우, -999999 를
		 * 반환한다.
		 * 
		 */
		 if (arr.length == 0 || arr == null) {
			return temp = -999999;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (temp < arr[i]) {
					temp = arr[i];
				}
			}
			return temp;
		}
	}

	public static void main(String[] args) {

		int[] data = { 3, 2, 9, 7, 4 };

		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
	 System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
	}

}
