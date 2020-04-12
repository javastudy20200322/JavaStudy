package summary.jaeyeon.example.chap05;

public class Q10 {

	public static void main(String[] args) {

		char[] abcCode = {

				'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}',
				';', ':', ',', '.', '/'

		};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		// 문자열 src 의 문자를 charAt 으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			if (((byte) ch >= 65 && (byte) ch <= 90) || ((byte) ch >= 97 && (byte) ch <= 122)) {
				char code = abcCode[i];
				System.out.print(ch + " : " + code + " : " + (byte) ch +"\n");
				result += code;
			} 
			
			//어디서 i = 0 으로 만들어야되는뎅..
			if (((byte) ch >= 48 && (byte) ch <= 57)) {
				char code = numCode[i];
				System.out.print(ch + " : " + code + " : " + (byte) ch +"\n");
				result += code;
			}
		}
		System.out.println("src : " + src);
		System.out.println("result : " + result);
	}

}
