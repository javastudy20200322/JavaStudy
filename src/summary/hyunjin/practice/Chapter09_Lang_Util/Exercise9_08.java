package summary.hyunjin.practice.Chapter09_Lang_Util;

//�޼���� : round
//�� �� : �־��� ���� �ݿø��Ͽ�, �Ҽ��� ���� n�ڸ��� ���� ��ȯ�Ѵ�.
//���� ��� n�� ���� 3�̸�, �Ҽ��� 4° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� 3�ڸ��� ���� ��ȯ�Ѵ�.
//��ȯŸ�� : double
//�Ű����� : double d - ��ȯ�� ��
//		  int n - �ݿø��� ����� �Ҽ��� �ڸ�
public class Exercise9_08 {
	/*	(1) round�޼��带 �ۼ��Ͻÿ�.	*/
	public static double round(double d, int n) {
		return Math.round(d*Math.pow(10, n))/Math.pow(10, n);
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}
