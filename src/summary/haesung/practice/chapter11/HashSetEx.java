package summary.haesung.practice.chapter11;

import java.util.HashSet;
import java.util.Set;

import summary.haesung.example.chapter09.ToStringTest;

public class HashSetEx
{

	public static void main(String[] args)
	{
		Object[] 	objArr 	= {"1", new Integer(1), "2", "2", "3", "3", "3", "4"};
		Set 		set 	= new HashSet();	// 중복값을 허용하지 않는다.
		
		for(int i=0; i<objArr.length; i++)
		{
			set.add(objArr[i]);
		}
		
		// "1"은 String객체, new Integer(1)은 Integer객체로 서로 다른 객체이므로 중복이 아니다.
		System.out.println(set);
		
		
		// 서로 다른 객체이므로 둘 다 set에 담긴다.
		HashSet set2 = new HashSet();
		set2.add(new Person("David", 10));
		set2.add(new Person("David", 10));
		
		System.out.println(set2);
	}

}

class Person
{
	String 	name;
	int 	age;
	
	Person(String name, int age)
	{
		this.name 	= name;
		this.age 	= age;
	}
	
	public String toString()
	{
		return this.name + ":" + this.age;
	}
	
	// HashSet의 add()는 새로운 요소를 추가하기 전에 equals()와 hashCode()를 호출한다.
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person tmp = (Person) obj;
			return this.name.equals(tmp.name) && (this.age == tmp.age);
		}
		
		return false;
	}
	
	public int hashCode()
	{
		return (name+age).hashCode();
	}
}
