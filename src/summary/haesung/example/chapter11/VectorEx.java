package summary.haesung.example.chapter11;

import java.util.*;

public class VectorEx
{

	public static void main(String[] args)
	{
		Vector v = new Vector(5);
		v.add(1);
		v.add(2);
		v.add(3);
		print(v);
		
		// 빈 공간을 없앤다. -> Vector에 빈 공간이 있었기 때문에 Vector의 길이가 줄어들었다.
		v.trimToSize();
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		// Vector의 size를 7로 늘렸다. -> 늘어난 공간은 null로 자동 초기화. 
		v.setSize(7);
		System.out.println("=== After setSize() ===");
		print(v);
		
		// Vector에 저장되어 있는 값들을 모두 지운다. -> size는 그대로임.
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}
	
	public static void print(Vector v)
	{
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}

}
