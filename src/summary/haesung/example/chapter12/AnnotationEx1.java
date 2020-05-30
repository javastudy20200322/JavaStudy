package summary.haesung.example.chapter12;

class NewClass
{
	int newField;
	
	int getNewField() { return newField; }
	
	// 더이상 사용하지 않는다는 의미.
	// 굳이 사용해도 문제가 생기진 않는다.
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() { return oldField; }
}

public class AnnotationEx1
{

	public static void main(String[] args)
	{
		NewClass nc = new NewClass();
		
		nc.oldField = 10;
		System.out.println(nc.getOldField());
	}

}
