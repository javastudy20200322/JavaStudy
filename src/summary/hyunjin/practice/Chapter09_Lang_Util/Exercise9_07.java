package summary.hyunjin.practice.Chapter09_Lang_Util;

//�޼���� : contains
//�� �� : ù ��° ���ڿ�(src)�� �� ��° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.���ԵǾ� ������ true, �׷��� ������ false�� ��ȯ�Ѵ�.
//��ȯŸ�� : boolean
//�Ű����� : String src
//		String target
public class Exercise9_07 {
	/*	(1) contains�޼��带 �ۼ��Ͻÿ�.	*/
	public static Boolean contains(String src, String target) {
		if(src.indexOf(target) != -1)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
}
