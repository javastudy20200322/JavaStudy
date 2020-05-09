package practice.week05.haesung;

import java.util.Scanner;

class Bean_
{
	String 	name;
	int 	kor;
	int 	eng;
	int 	math;
	
	public String toString()
	{
		return name + " " + kor + " " + eng + " " + math;
	}
}


public class Main
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		Bean_[] beanArr = new Bean_[scanner.nextInt()];
		
		for(int i=0; i<beanArr.length; i++)
		{
			Bean_ bean = new Bean_();
			
			bean.name 	= scanner.next();
			bean.kor 	= scanner.nextInt();
			bean.eng 	= scanner.nextInt();
			bean.math 	= scanner.nextInt();
			
			beanArr[i] = bean;
		}
		
		beanArr = sorting(beanArr);
		
		for(int i=0; i<beanArr.length; i++)
		{
			System.out.println(beanArr[i]);
		}
	}
	
	
	
	
	
	public static Bean_[] sorting(Bean_[] beanArr)
	{
		Bean_[] tempArr = copyArray(beanArr);
		
		for(int i=0; i<tempArr.length; i++)
		{
			for(int j=i+1; j<tempArr.length; j++)
			{
				if(tempArr[i].kor < tempArr[j].kor)
				{
					Bean_ temp = tempArr[i];
					tempArr[i] = tempArr[j];
					tempArr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<tempArr.length; i++)
		{
			for(int j=i+1; j<tempArr.length; j++)
			{
				if((tempArr[i].kor == tempArr[j].kor) && (tempArr[i].eng > tempArr[j].eng))
				{
					Bean_ temp = tempArr[i];
					tempArr[i] = tempArr[j];
					tempArr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<tempArr.length; i++)
		{
			for(int j=i+1; j<tempArr.length; j++)
			{
				if(((tempArr[i].kor == tempArr[j].kor) && (tempArr[i].eng == tempArr[j].eng)) && (tempArr[i].math < tempArr[j].math))
				{
					Bean_ temp = tempArr[i];
					tempArr[i] = tempArr[j];
					tempArr[j] = temp;
				}
			}
		}
		
		EXIT:
		for(int i=0; i<tempArr.length; i++)
		{
			for(int j=i+1; j<tempArr.length; j++)
			{
				if(((tempArr[i].kor == tempArr[j].kor) && (tempArr[i].eng == tempArr[j].eng)) && (tempArr[i].math == tempArr[j].math))
				{
					int a = tempArr[i].name.length();
					int b = tempArr[j].name.length();
					int c = (a < b) ? a : b;
					
					for(int k=0; k<c; k++)
					{
						char c1 = tempArr[i].name.charAt(k);
						char c2 = tempArr[j].name.charAt(k);
						
						if(c1 > c2)
						{
							Bean_ temp = tempArr[i];
							tempArr[i] = tempArr[j];
							tempArr[j] = temp;
							break EXIT;
						}
					}
				}
			}
		}
		
		return tempArr;
	}
	
	public static Bean_[] copyArray(Bean_[] arr)
	{
		Bean_[] tmpArr = new Bean_[arr.length];
		
		for(int i=0; i<tmpArr.length; i++)
		{
			tmpArr[i] = arr[i];
		}
		
		return tmpArr;
	}

}
