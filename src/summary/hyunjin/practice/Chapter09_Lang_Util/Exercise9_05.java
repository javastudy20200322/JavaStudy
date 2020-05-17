package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-5] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//�޼���� : count
//�� �� : �־��� ���ڿ�(src)�� ã������ ���ڿ�(target)�� �� �� �������� ��� ��ȯ�Ѵ�.
//��ȯŸ�� : int
//�Ű����� : String src
//String target

public class Exercise9_05 {
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		
		/*
		(1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�.
		*/
		while(true) {
//			1. src���� target�� pos�� ��ġ���� ã�´�.
			int num = src.indexOf(target, pos);	
			
//			2. ã���� count�� ���� 1 ���� ��Ű��, pos�� ���� target.length��ŭ ������Ų��.
			if(num != -1) {
				count++;
				pos += target.length();
			}else {
//				3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�.
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
}
