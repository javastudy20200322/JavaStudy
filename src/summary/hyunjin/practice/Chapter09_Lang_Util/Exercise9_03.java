package summary.hyunjin.practice.Chapter09_Lang_Util;

public class Exercise9_03 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
				
		/*	(1) 알맞은 코드를 넣어 완성하시오. 	lastIndexOf로 하드코딩제외*/
		path = fullPath.substring(0, 15);
		fileName = fullPath.substring(15);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}
}
