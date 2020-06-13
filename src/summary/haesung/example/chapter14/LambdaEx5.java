package summary.haesung.example.chapter14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx5
{
	public static void main(String[] args)
	{
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> 	h1 = f.andThen(g);	// f 적용 후 g도 적용
		Function<Integer, Integer> 	h2 = f.compose(g);	// g 적용 후 f도 적용
		
		System.out.println(h1.apply("FF"));
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 = x -> x;
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p 	= i -> i < 100;
		Predicate<Integer> q 	= i -> i < 200;
		Predicate<Integer> r 	= i -> (i % 2) == 0;
		Predicate<Integer> notP = p.negate();
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		
		boolean result = p2.test(str2);
		System.out.println(result);
	}
	
}
