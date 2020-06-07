package summary.jaeyeon.practiceA.chap12_Anno;

import java.util.Arrays;

class MyArrayList<T>{
	T[] arr;
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList(T... arr){
		this.arr = arr;
	}
	
	
	public static <T> MyArrayList<T> asList(T... a){
		return new MyArrayList<>(a);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
	
	
}





class AnnotationEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
