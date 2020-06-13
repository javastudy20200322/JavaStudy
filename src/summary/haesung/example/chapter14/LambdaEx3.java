package summary.haesung.example.chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx3
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++)
		{
			list.add(i);
		}
		
		// 변수 i는 list의 각 요소
		list.forEach(i -> System.out.print(i + ","));
		System.out.println();
		
		list.removeIf(x -> ((x % 2) == 0) || ((x % 3) == 0));
		System.out.println(list);
		
		list.replaceAll(i -> (i*10));
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// k, v는 map의 각 key와 value
		map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println();
	}

}
