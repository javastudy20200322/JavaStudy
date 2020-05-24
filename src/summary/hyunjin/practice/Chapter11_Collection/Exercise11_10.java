package summary.hyunjin.practice.Chapter11_Collection;
import java.util.*;

//[11-10] ���� ������ �������� 1~30������ ���ڵ�� ���� ���ε�, ���ڵ��� ��ġ�� �߼����� �ʴ´ٴ� ������ �ִ�. 
//�̷��� ������ �߻��ϴ� ������ �� ������ �����ϱ� ���� ����� �����ϰ�, �̸� ������ ���ο� �ڵ带 �ۼ��Ͻÿ�.
public class Exercise11_10 {
	public static void main(String[] args) {
//		Set set = new HashSet();  ����� ������ �������� �ʰ� ��ü �����Ŀ� ���� �����
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*30)+1+"");
		}
		
		Iterator it = set.iterator();
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ")	+ board[i][j]);
			}
			System.out.println();
		}
	} // main
}
