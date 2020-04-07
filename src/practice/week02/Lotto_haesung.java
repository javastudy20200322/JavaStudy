package practice.week02;

/**
 * <pre>
 * Date		: 2020. 4. 4.
 * Author 	: pureboyz
 * 
 * Lotto 번호 추첨 프로그램 만들기.
 * 
 * 1 ~ 45 까지의 수 중에서 Lotto 당첨번호 6개 + 2등 보너스 번호
 * 총 7개의 중복되지 않는 번호를 변수 num1 ~ num6, bonusNum에 담고,
 * Lotto 당첨번호 6개 + 2등 보너스 번호를 출력하되
 * Lotto 당첨번호 6개는 작은 번호부터 오름차순으로 정렬하여 출력하세요.
 * 
 * ## 출제의도
 * 조건문과, 반복문을 연습.
 * </pre>
 */
public class Lotto_haesung
{
	static int num1 = 0;	// 첫 번째 Lotto 당첨번호
	static int num2 = 0;	// 두 번째 Lotto 당첨번호
	static int num3 = 0;	// 세 번째 Lotto 당첨번호
	static int num4 = 0;	// 네 번째 Lotto 당첨번호
	static int num5 = 0;	// 다섯 번째 Lotto 당첨번호
	static int num6 = 0;	// 여섯 번째 Lotto 당첨번호
	
	static int bonusNum = 0;	// 보너스 번호

	public static void main(String[] args)
	{
		// 보너스 번호가 추첨되면 반복문이 종료된다.
		while(bonusNum == 0)
		{
			// 랜덤으로 1~45중 하나의 숫자를 생성한다.
			int selectedNum = (int) (Math.random()*45) + 1;
			
			// selectedNum이 이미 뽑은 번호일 때.
			if((selectedNum == num1) || (selectedNum == num2) || (selectedNum == num3)
					|| (selectedNum == num4) || (selectedNum == num5) || (selectedNum == num6))
			{
				continue;
			}
			// selectedNum이 이미 뽑은 번호가 아닐 때.
			else
			{
				// num1이 0이면 처음으로 뽑은 숫자이므로 selectedNum을 num1에 담는다.
				if(num1 == 0)
				{
					num1 = selectedNum;
				}
				// num6이 0이 아니면 당첨번호 6개를 모두 뽑았으므로 bonusNum에 selectedNum을 담는다.
				else if(num6 != 0)
				{
					bonusNum = selectedNum;
				}
				// selectedNum이 num1보다 작으면, selectedNum을 num1에 저장하고
				// num1 ~ num5를  num2 ~ num6에 저장한다.
				else if(selectedNum < num1)
				{
					num6 = num5;
					num5 = num4;
					num4 = num3;
					num3 = num2;
					num2 = num1;
					num1 = selectedNum;
				}
				// selectedNum이 num2보다 작으면, selectedNum을 num2에 저장하고
				// num2 ~ num5를  num3 ~ num6에 저장한다.
				else if(selectedNum < num2)
				{
					num6 = num5;
					num5 = num4;
					num4 = num3;
					num3 = num2;
					num2 = selectedNum;
				}
				// selectedNum이 num3보다 작으면, selectedNum을 num3에 저장하고
				// num3 ~ num5를  num4 ~ num6에 저장한다.
				else if(selectedNum < num3)
				{
					num6 = num5;
					num5 = num4;
					num4 = num3;
					num3 = selectedNum;
				}
				// selectedNum이 num4보다 작으면, selectedNum을 num4에 저장하고
				// num4 ~ num5를  num5 ~ num6에 저장한다.
				else if(selectedNum < num4)
				{
					num6 = num5;
					num5 = num4;
					num4 = selectedNum;
				}
				// selectedNum이 num5보다 작으면, selectedNum을 num5에 저장하고
				// num5를  num6에 저장한다.
				else if(selectedNum < num5)
				{
					num6 = num5;
					num5 = selectedNum;
				}
				// 현재 담겨있는 번호보다 큰 숫자가 뽑히면, 값이 0인 변수를 찾아서 담는다.
				else
				{
					if(num2 == 0)
					{
						num2 = selectedNum;
					}
					else if(num3 == 0)
					{
						num3 = selectedNum;
					}
					else if(num4 == 0)
					{
						num4 = selectedNum;
					}
					else if(num5 == 0)
					{
						num5 = selectedNum;
					}
					else if(num6 == 0)
					{
						num6 = selectedNum;
					}
					else
					{
						System.out.println("문제생김.. 프로그램 종료 ㅠㅠ");
						System.exit(0);
					}
				}
			}
		}
		
		System.out.println("Lotto 당첨 번호는..");
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6);
		System.out.println("2등 보너스 번호 : " + bonusNum);
	}

}
