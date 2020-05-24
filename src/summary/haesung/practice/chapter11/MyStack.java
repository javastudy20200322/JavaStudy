package summary.haesung.practice.chapter11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector
{
	public Object push(Object item)
	{
		addElement(item);
		
		return item;
	}
	
	public Object pop()
	{
		Object obj = peek();	// 마지막 요소를 가져오고
		
		removeElementAt(size() - 1);	// 마지막 요소를 제거한다.
		
		return obj;
	}
	
	// 마지막 요소를 리턴한다.
	public Object peek()
	{
		int len = size();
		
		if(len == 0)
		{
			throw new EmptyStackException();
		}
		
		return elementAt(len - 1);
	}
	
	public boolean empty()
	{
		return size() == 0;
	}
	
	public int search(Object o)
	{
		// Vector 클래스에 이미 정의되어있는 메소드.
		// 끝에서부터 객체를 찾아 해당 인덱스 값을 리턴한다.
		int i = lastIndexOf(o);
		
		if(i >= 0)
		{
			return size() - i;
		}
		
		return i;
	}
}
