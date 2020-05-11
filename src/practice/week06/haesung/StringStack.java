package practice.week06.haesung;

public class StringStack implements Stack
{
	String[] stackArr = null;

	// Stack에 저장된 항목의 개수 반환
	@Override
	public int length()
	{
		int count = 0;
		for(String str : stackArr)
		{
			if(str != null)
			{
				count++;
			}
		}
		return count;
	}
	
	

	// Stack에 저장 가능한 항목의 개수 반환
	@Override
	public int capacity()
	{
		return this.stackArr.length - this.length();
	}

	// Stack에서 항목을 꺼내고 이를 반환
	@Override
	public String pop()
	{
		String resultStr = null;
		
		for(int i=this.stackArr.length-1; i>=0; i--)
		{
			if(this.stackArr[i] != null)
			{
				resultStr 			= this.stackArr[i];
				this.stackArr[i] 	= null;
			}
		}
		return resultStr;
	}

	// Stack에 항목을 저장하고 성공적으로 저장하면 true를, 실패하면 false를 반환
	@Override
	public boolean push(String str)
	{
		if(this.capacity() == 0)
		{
			return false;
		}
		else
		{
			for(int i=0; i<this.stackArr.length; i++)
			{
				if(this.stackArr[i] == null)
				{
					this.stackArr[i] = str;
					break;
				}
			}
			return true;
		}
	}
	
	public String toString()
	{
		String resultStr = "";
		
		for(int i=0; i<this.stackArr.length; i++)
		{
			if(this.stackArr[i] != null)
			{
				resultStr += this.stackArr[i] + " ";
			}
		}
		
		return resultStr;
	}

}
