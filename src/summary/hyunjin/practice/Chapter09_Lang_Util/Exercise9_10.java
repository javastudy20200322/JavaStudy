package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-10] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//�޼���� : format
//��      �� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ�Ѵ�. ������ ������ �������� ä���.
//��ȯŸ�� : String
//�Ű����� : String str - ��ȯ�� ���ڿ�
//		  int length - ��ȯ�� ���ڿ��� ����
//		  int alignment - ��ȯ�� ���ڿ��� ��������
//		  (0:���� ����, 1: ��� ����, 2:������ ����)

public class Exercise9_10 {
	
	public static String format(String str, int length, int alignment) {
/*	(1) format�޼��带 �ۼ��Ͻÿ�.*/
//	1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
		int num = length - str.length();
		if(num<0) {
			return str.substring(0, length);
		}
//	2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
		char[] tmp = str.toCharArray();
		char[] ch = new char[length];
		
		for(int i=0; i<ch.length; i++) 
			ch[i] = ' ';
//	3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.	(System.arraycopy()���)
		switch (alignment) {
		case 0:
			System.arraycopy(tmp, 0, ch, 0, tmp.length);
			break;
			
		case 1:
			System.arraycopy(tmp, 0, ch, num/2, tmp.length);
			break;
			
		case 2:
			System.arraycopy(tmp, 0, ch, num, tmp.length);
			break;
		}
//	4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
		return new String(ch);
	}
	
	

	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}

}
