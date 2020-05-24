package summary.dohyun.chapter11.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {

		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "이바", "010-123-1233");
		addPhoneNo("친구", "이시", "010-111-1111");
		addPhoneNo("회사", "전대표", "010-111-1111");
		addPhoneNo("회사", "박사장", "010-111-1111");
		addPhoneNo("회사", "이과장", "010-111-1111");
		addPhoneNo("친구", "이대리", "010-111-1111");
		addPhoneNo("세탁", "010-3085-3677");

		printList();

	}

	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}

	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			System.out.println("* " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
		}
	}

}
