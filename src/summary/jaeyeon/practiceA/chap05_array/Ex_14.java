package summary.jaeyeon.practiceA.chap05_array;

public class Ex_14 {

	public static void main(String[] args) {

		String src = "ABCDE";
		
		for(int i = 0; i<src.length(); i++) {
		
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):"+ch);
			
		}
		//String 을 char[] 로 변환
		char[] chArr = src.toCharArray();
		
		
		//char배열(char[])을 출력
		System.out.println(chArr);
		
	}

}
