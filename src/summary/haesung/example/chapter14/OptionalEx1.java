package summary.haesung.example.chapter14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1
{

	public static void main(String[] args)
	{
		Optional<String> 	optStr = Optional.of("abcde");
		Optional<Integer> 	optInt = optStr.map(String::length);
		
		System.out.println("optStr : " + optStr.get());
		System.out.println("optInt : " + optInt.get());
		
		int result1 = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
		int result2 = Optional.of("").filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		// ifPresent는 인자가 존재할 경우에만 함수를 실행.
		Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3 : %d%n", x));
		
		OptionalInt optInt1 = OptionalInt.of(0);
		OptionalInt optInt2 = OptionalInt.empty();
		
		// isPresent는 값이 있는지 없는지를 알려준다.
		System.out.println("optInt1 : " + optInt1.isPresent());
		System.out.println("optInt2 : " + optInt2.isPresent());
		
		System.out.println("optInt1 : " + optInt1);
		System.out.println("optInt2 : " + optInt2);
		System.out.println("optInt1.equals(optInt2)? " + optInt1.equals(optInt2));
		
		Optional<String> opt1 = Optional.ofNullable(null);
		Optional<String> opt2 = Optional.empty();
		
		System.out.println("opt1 : " + opt1);
		System.out.println("opt2 : " + opt2);
		System.out.println("opt1.equals(opt2)? " + opt1.equals(opt2));
		
		int result3 = optStrToInt(Optional.of("123"), 0);
		int result4 = optStrToInt(Optional.of(""), 0);
		
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}
	
	static int optStrToInt(Optional<String> optStr, int defaultValue)
	{
		try
		{
			return optStr.map(Integer::parseInt).get();
		}
		catch (Exception e)
		{
			return defaultValue;
		}
	}

}
