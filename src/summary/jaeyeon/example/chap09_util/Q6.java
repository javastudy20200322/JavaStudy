package summary.jaeyeon.example.chap09_util;

public class Q6 {

	public static String fillZero(String src, int length) {
		
		String answer = "";
		
		/*(1) fillZero 메서드를 작성하시오
		 * 1. src 의 넓이거나 src.length() 가 length 와 같으면 src 를 그대로 반환한다.
		 * 2. length 의 값이 0보다 같거나 작으면 빈 문자열("") 을 반환한다.
		 * 3. src의 길이가 length 의 값 보다 크면 src 를 length 만큼 잘라서 반환한다.
		 * 4. 길이가 length 인 char 배열을 생성한다.
		 * 5. 4에서 생성한 배열을 '0'으로 채운다.
		 * 6. src에서 문자배열을 뽑아내서 4에서 생성한 배열에 복사한다.
		 * 7. 4에서 생성한 배열로 String 을 생성해서 반환한다.
		 * 
		 */
		return answer;
		
		
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -3));
		System.out.println(fillZero(src, 3));
	}

}
