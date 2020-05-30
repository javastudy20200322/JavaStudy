package summary.haesung.example.chapter10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx
{
	public static void main(String[] args)
	{
		double[] 	limits 	= {60, 70, 80, 90};		// limits는 낮은 값부터 적어야한다.
		String[] 	formats = {"D", "C", "B", "A"};	// formats는 limits와 길이가 같아야 한다.
		int[] 		scores 	= {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		for(int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
		
		System.out.println();
		
		String pattern = "60#D|70#C|80#B|90#A";	// 배열대신 패턴을 사용.
		ChoiceFormat form1 = new ChoiceFormat(pattern);
		
		for(int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i] + ":" + form1.format(scores[i]));
		}
	}
}
