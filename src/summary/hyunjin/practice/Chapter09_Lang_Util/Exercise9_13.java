package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-13] ������ �ϳ��� �� ���ڿ�(source) �߿��� Ư�� ���ڿ��� ��ġ�ϴ� ���ڿ��� ������ ���ϴ� �����̴�. �� ���� ä�� ������ �ϼ��Ͻÿ�.
public class Exercise9_13 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa�� " + stringCount(src, "aa") +"�� ã�ҽ��ϴ�.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0)
			return 0;
		/*	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.	*/
		
		
		while(true) {
			if(src.indexOf(key,pos) != -1) {
				count++;
				index = src.indexOf(key,pos);
				pos = index + key.length();
			}else {
				break;
			}
		}
		
		return count;
	}

}
