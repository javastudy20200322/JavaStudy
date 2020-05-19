package summary.hyunjin.practice.Chapter09_Lang_Util;

//[9-2] ������ ���� �������� �򵵷� Point3DŬ������ equals()�� ��������� x, y, z �� ���� ���ϵ��� �������̵��ϰ�, toString()�� �������� �����ؼ� ������ �������̵��Ͻÿ�.

public class Exercise9_02 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	}
}

class Point3D {
	int x,y,z;
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	Point3D() {
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {
		/*(1) �ν��Ͻ����� x, y, z�� ���ϵ��� �������̵��Ͻÿ�.*/
		Point3D tmp = (Point3D)obj;
		if(this.x==tmp.x && this.y==tmp.y && this.z==tmp.z)
			return true;
		
		return false;
	}
	public String toString() {
		/*(2) �ν��Ͻ����� x, y, z�� ������ ����ϵ��� �������̵��Ͻÿ�.*/
		return "["+this.x+","+this.y+","+this.z+"]";
	}
}
