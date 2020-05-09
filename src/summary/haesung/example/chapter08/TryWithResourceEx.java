package summary.haesung.example.chapter08;

public class TryWithResourceEx
{

	public static void main(String[] args)
	{
		// try문의 괄호안에 객체를 생성하는 문장을 넣으면 try-with-resource문
		// try문을 벗어나면 해당객체의 close()가 호출된다
		try (CloseableResource cr = new CloseableResource())
		{
			// CloseException만 발생.
			cr.exceptionWork(false);
		}
		catch(WorkException e)
		{
			e.printStackTrace();
		}
		catch(CloseException e)
		{
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource())
		{
			// WorkException이 먼저 발생하고
			// try문을 빠져나가면서 CloseException이 발생한다.
			// CloseException은 Suppressed머릿말이 붙는다.
			cr.exceptionWork(true);
		}
		catch(WorkException e)
		{
			e.printStackTrace();
		}
		catch(CloseException e)
		{
			e.printStackTrace();
		}
	}
	
}

class CloseableResource implements AutoCloseable
{
	public void exceptionWork(boolean exception) throws WorkException
	{
		System.out.println("exceptionWork("+exception+")가 호출됨.");
		if(exception)
		{
			throw new WorkException("WorkException발생!!");
		}
	}

	public void close() throws CloseException
	{
		System.out.println("close()가 호출됨.");
		throw new CloseException("CloseException발생!!");
	}
}

class WorkException extends Exception
{
	WorkException(String msg)
	{
		super(msg);
	}
}

class CloseException extends Exception
{
	CloseException(String msg)
	{
		super(msg);
	}
}
