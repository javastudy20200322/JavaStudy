package summary.jaeyeon.example.chap09_util;

class Point3D{
	int x,y,z;
	
	Point3D(int x , int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D(){
		this(0,0,0);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//instanceOf 사용해서
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+x+","+y+","+z+"]";
	}
	
}



public class Q2 {

	public static void main(String[] args) {

		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		System.out.println("p1 == p2  :"+(p1==p2));
		System.out.println("p1.equals(p2) : "+(p1.equals(p2)));
		
	}

}
