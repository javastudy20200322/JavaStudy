package summary.jaeyeon.example.chap06_oop;

public class Q22 {

	static boolean isNumber(String str) {
		/*
		 * 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다. 모두 숫자로만 이루어져 있으면 true 를 반환하고,
		 * 그렇지 않으면 false 를 반환한다.
		 * 만일 주어진 문자열이 null 이거나 빈문자열 "" 이라면 false 를 반환한다.
		 * 
		 */

		if (str == null || str.equals("")) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + " 는 숫자 입니까?" + isNumber(str));

		str = "1234o";
		System.out.println(str + " 는 숫자 입니까?" + isNumber(str));
		str = "";
		System.out.println(str + " 는 숫자 입니까?" + isNumber(str));
		str = null;
		System.out.println(str + " 는 숫자 입니까?" + isNumber(str));
	}

}
