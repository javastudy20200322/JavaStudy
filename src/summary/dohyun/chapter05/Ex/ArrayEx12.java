package chapter05.Ex;

public class ArrayEx12 {
	
	public static void main(String[] args) {
		String[] names = {"KIM", "PARK", "YI"};
		
		for(int i = 0; i<names.length; i++) {
			System.out.println("names["+i+"]: " +names[i]);
		}
	String tmp = names[2];
	System.out.println("tmp :"+ tmp);
	names[0]="Yu";
	
	for(String str : names) //향상된 for문 good~~
		System.out.println(str);
	}
}
