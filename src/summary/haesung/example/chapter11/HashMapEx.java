package summary.haesung.example.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx
{
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args)
	{
		// 전화번호와 이름을 key와 value로 하는 HashMap을 생성 후 group에 저장
		// 그룹명과 먼저 생성한 group을 key와 value로  phoneBook에 저장.
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("회사", "김대리", "010-333-3333");
		addPhoneNo("회사", "이대리", "010-444-4444");
		addPhoneNo("회사", "박대리", "010-555-5555");
		addPhoneNo("세탁", "010-666-6666");
		
		printList();
	}
	
	static void addPhoneNo(String groupName, String name, String tel)
	{
		addGroup(groupName);
		
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addGroup(String groupName)
	{
		// groupName이 key로 저장되어있는지 확인.
		if(!phoneBook.containsKey(groupName))
		{
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNo(String name, String tel)
	{
		addPhoneNo("기타", name, tel);
	}
	
	static void printList()
	{
		Set 		set = phoneBook.entrySet();
		Iterator 	it 	= set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry)it.next();
			
			Set 		subSet 	= ((HashMap)e.getValue()).entrySet();
			Iterator 	subIt 	= subSet.iterator();
			
			System.out.println(" * " + e.getKey() + " [" + subSet.size() + "]");
			
			while(subIt.hasNext())
			{
				Map.Entry 	subE 	= (Map.Entry)subIt.next();
				String 		telNo 	= (String)subE.getKey();
				String 		name 	= (String)subE.getValue();
				
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}

}
