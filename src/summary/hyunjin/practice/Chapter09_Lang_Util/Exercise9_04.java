package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-4] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//�޼���� : printGraph
//��      �� : �־��� �迭�� ��� ����ŭ �־��� ���ڸ� ���η� ����� ��, ���� ����Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : int[] dataArr - ����� �׷����� ������
//char ch - �׷����� ����� ����.

public class Exercise9_04 {
	static void printGraph(int[] dataArr, char ch) {
		/*		(1) printGraph�޼��带 �ۼ��Ͻÿ�.		*/
		for(int i=0; i<dataArr.length; i++) {
			for(int j=0;j<dataArr[i];j++) {
				System.out.print("*");
				if(dataArr[i]-1==j) 
					System.out.print(dataArr[i]);					
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');
	}
}
