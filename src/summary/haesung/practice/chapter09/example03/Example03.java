package summary.haesung.practice.chapter09.example03;

/**
 * <pre>
 * Date		: 2020. 5. 16.
 * Author 	: pureboyz
 * 
 * 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
 * 
 * fullPath:c:\jdk1.8\work\PathSeparateTest.java
 * path:c:\jdk1.8\work
 * fileName:PathSeparateTest.java
 * </pre>
 */
public class Example03
{

	public static void main(String[] args)
	{
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path 	= "";
		String fileName = "";
		
		// code start..
		String[] temp = fullPath.split("\\\\");
		for(int i=0; i<temp.length; i++)
		{
			if(i < temp.length-2)
			{
				path += temp[i] + "\\";
			}
			else if(i == temp.length-2)
			{
				path += temp[i];
			}
			else
			{
				fileName += temp[i];
			}
		}
		// code end..
		
		System.out.println("fullPath : " + fullPath);
		System.out.println("path : " + path);
		System.out.println("fileName : " + fileName);
	}

}
