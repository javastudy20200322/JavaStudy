package summary.haesung.example.chapter09;

import java.util.StringJoiner;

public class StringEx
{

	public static void main(String[] args)
	{
		String 		animals = "dog,cat,bear";
		String[] 	arr 	= animals.split(",");
		
		// '/'를 구분자로 하여 arr배열의 각 원소들을 합친다.
		System.out.println(String.join("-", arr));
		
		// '/'를 구분자로, 첫문자는 '[', 마지막문자는 ']'
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr)
		{
			sj.add(s);
		}
		
		System.out.println(sj.toString());
	}

}
