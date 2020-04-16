package summary.haesung.example.chapter06;

public class BlockTest
{
	// static 초기화 블럭. class가 메모리에 처음 로딩될 때 단 한번만 수행된다.
	static
	{
		System.out.println("static { }");
	}
	
	// 인스턴스 초기화 블럭. 생성자가 호출될 때마다 수행된다.
	{
		System.out.println("{ }");
	}
	
	public BlockTest()
	{
		System.out.println("생성자.");
	}

	public static void main(String[] args)
	{
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}

}
