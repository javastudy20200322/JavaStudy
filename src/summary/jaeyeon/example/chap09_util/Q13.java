package summary.jaeyeon.example.chap09_util;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}

	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;

		if (key == null || key.length() == 0) {
			return 0;
		}
		
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오
		 * 하나의 긴 문자열(source) 중에서 특정 문자열과 일치하는 문자열의 갯수를 구하는 예제이다.
		 * 빈 곳을 채워 예제를 완성하시오
		 */
		
		return count;
	}
}
