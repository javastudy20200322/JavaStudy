package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-6] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//�޼���� : fillZero
//�� 	    �� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����, ���� �� ������ '0'���� ä���.
//		   ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
//		   ���� �־��� length�� ���� 0���� ���ų� ���� ���̸�, �� ���ڿ�("")�� ��ȯ�Ѵ�.
//��ȯŸ�� : String
//�Ű����� : String src - ��ȯ�� ���ڿ�
//  	  int length - ��ȯ�� ���ڿ��� ����
public class Exercise9_06 {
	public static String fillZero(String src, int length) {
		/* (1) fillZero�޼��带 �ۼ��Ͻÿ�. */
//		1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
		if(src==null || src.length()==length ) {
			return src;
		}
		
//		2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�.
		if(length<=0)
			return "";
		
//		3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�.
		if(src.length() > length)
			return src.substring(0, length);
		
//		4. ���̰� length�� char�迭�� �����Ѵ�.
		char[] ch = new char[length];
		
//		5. 4���� ������ char�迭�� '0'���� ä���.
		for(int i=0; i<length; i++)
			ch[i] = 0;
		
//		6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
		System.arraycopy(src.toCharArray(), 0, ch, length-src.length(), src.length());
		
//		7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}