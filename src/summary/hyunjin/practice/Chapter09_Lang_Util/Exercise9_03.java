package summary.hyunjin.practice.Chapter09_Lang_Util;

public class Exercise9_03 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
				
		/*	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 	lastIndexOf�� �ϵ��ڵ�����*/
		path = fullPath.substring(0, 15);
		fileName = fullPath.substring(15);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}
}
