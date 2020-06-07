package summary.jaeyeon.example.chap09_util;

public class Q10 {
	/* (1) format 메서드를 작성하시오.
	 * 1.length 의 값이 str 의 길이보다 작으면 length 만큼만 잘라서 반환한다.
	 * 2. 1의 경우가 아니면, length 크기의 char 배열을 생성하고 공백으로 채운다.
	 * 3. 정렬조건(alignment)의 값에 따라 문자열(str) 을 복사할 위치를 결정한다.
	 * (System.arraycopy() 사용)
	 * 4. 2에서 생성한 char 배열을 문자열로 만들어서 반환한다.
	 * 
	 * 반환타입 : String
	 * 매개변수 : String str - 반환할 문자열
	 * 			int length - 변환된 문자열의 길이
	 * 			int alignment - 변환된 문자열의 정렬조건
	 * 			(0 : 왼쪽정렬, 1 : 가운데정렬, 2:오른쪽정렬)
	 */
	
	static String format(String str, int length, int alignment) {
		return str;
	}
	
	
	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
	}
	
	
	
	
}
