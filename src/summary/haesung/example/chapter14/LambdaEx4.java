package summary.haesung.example.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx4
{
	public static void main(String[] args)
	{
		Supplier<Integer> 			s = () -> (int) (Math.random()*100) + 1;
		Consumer<Integer> 			c = i -> System.out.print(i + ",");
		Predicate<Integer> 			p = i -> ((i % 2) == 0);
		Function<Integer, Integer> 	f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}
	
	static <T> List<T> doSomething(Function<T, T> f, List<T> list)
	{
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list)
		{
			// 1의 자리의 수를 버리고 새로운 리스트에 저장한다.
			newList.add(f.apply(i));
		}
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list)
	{
		System.out.print("[");
		
		for(T i : list)
		{
			// 짝수인지 확인하고, true면 accept()를 호출하는데.. 왜 출력이 되는거지?
			if(p.test(i))
			{
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list)
	{
		for(int i=0; i<10; i++)
		{
			// 1~100 까지의 수 중에서 랜덤으로 생성된 값이 list에 저장된다.
			list.add(s.get());
		}
	}

}
