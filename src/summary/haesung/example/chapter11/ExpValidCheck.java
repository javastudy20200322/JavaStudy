package summary.haesung.example.chapter11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck
{

	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.exit(0);
		}
		
		Stack 	st 			= new Stack();
		String 	expression 	= args[0];
		
		System.out.println("expression : " + expression);
		
		try
		{
			for(int i=0; i<expression.length(); i++)
			{
				char ch = expression.charAt(i);
				
				if(ch == '(')
				{
					st.push(ch + "");
				}
				else if(ch == ')')
				{
					// 괄호를 열어야 닫을 수 있는데, 닫을 때 꺼낼 것이 없으면 catch로 넘어감.
					st.pop();
				}
			}
			
			// 괄호를 맞게 사용했다면 stack이 비어있어야한다.
			if(st.isEmpty())
			{
				System.out.println("괄호가 일치합니다.");
			}
			else
			{
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}
		catch (EmptyStackException e)
		{
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}

}
