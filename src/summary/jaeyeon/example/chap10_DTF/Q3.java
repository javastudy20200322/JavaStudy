package summary.jaeyeon.example.chap10_DTF;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Q3 {

	public static void main(String[] args) {

		String data = "123,456,789.5";
		
		//소숫점 첫번째 자리에서 반올림하고, 그 값을 만 단위로 콤마(,)로 구분해서 출력하시오.
		
		//변환할 문자열의 형식을 지정
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("##,###");
		
		
		try {
			Number num = df.parse(data);
			double d = num.doubleValue();
			
			System.out.println("data : "+data);
			System.out.println("반올림 : "+Math.round(d));
			System.out.println("만단위 : "+df2.format(d));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
