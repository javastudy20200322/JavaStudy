package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-12] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//[����] Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
//�޼���� : getRand
//�� �� : �־��� ����(from~to)�� ���� ������ �������� ��ȯ�Ѵ�.(���� ��谪 ��� ������ ����) 
//      from�� ���� to�� ������ Ŭ ��쵵 ó���Ǿ�� �Ѵ�.
//��ȯŸ�� : int
//�Ű����� : int from - ������ ���۰�
//		int to - ������ ����	
//[Hint] Math.random()�� ���밪�� ��ȯ�ϴ� Math.abs(int a), �׸��� �� �߿� ���� ���� ��ȯ�ϴ� Math.min(int a, int b)�� ����϶�.

public class Exercise9_12 {
	/*	(1) getRand�޼��带 �ۼ��Ͻÿ�.	*/
	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");

	}

}
