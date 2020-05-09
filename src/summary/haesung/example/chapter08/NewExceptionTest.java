package summary.haesung.example.chapter08;

public class NewExceptionTest
{

	public static void main(String[] args)
	{
		try
		{
			startInstall();
			copyFiles();
		}
		catch (SpaceException e)
		{
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치해봐..");
		}
		catch (MemoryException e)
		{
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.gc();	// Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치해봐..");
		}
		finally
		{
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException
//	static void startInstall() throws SpaceException
	{
		if(!enoughSpace())
		{
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory())
		{
			throw new MemoryException("메모리가 부족합니다.");
			
//			 RuntimeException으로 감싸면 MemoryException은 unchecked예외가 된다.
			// 따라서 throws MemoryException를 하지 않아도 된다.
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace()
	{
		return false;
	}
	
	static boolean enoughMemory()
	{
		return true;
	}

}

// 사용자정의 예외 클래스
// Exception을 상속받으면 되고, 멤버변수나 메소드도 사용가능하다.
class SpaceException extends Exception
{
	SpaceException(String msg)
	{
		super(msg);
	}
}

// 사용자정의 예외 클래스
class MemoryException extends Exception
{
	MemoryException(String msg)
	{
		super(msg);
	}
}
