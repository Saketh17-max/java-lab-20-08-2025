//Implementation of Array methods
import java.util.Arrays;
public class ArrayMethods{
	public static void main(String args[]){
	//1.toString method
		System.out.println("1.toString");
		int[] a={45,56,75,87,16};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
	//2.sort() method
		Arrays.sort(a);
		System.out.println("2.sort");
		System.out.println(Arrays.toString(a));
	//3.binarySearch() method
		int index=Arrays.binarySearch(a,87);
		System.out.println("3.binarySearch");
		System.out.println("87 is found at index "+index);
	//4.equals() method()
		int[] b={22,54,48,27,98};
		System.out.println("4.equals");
		System.out.println("array a = array b is "+Arrays.equals(a,b));
	//5.fill() method
		int[] c=new int[10];
		System.out.println("5.fill");
		Arrays.fill(c,5);
		System.out.println(Arrays.toString(c));
	//6.copyOf() method
		int[] newArray=Arrays.copyOf(a,7);
		System.out.println("6.copyOf");
		System.out.println(Arrays.toString(newArray));					
	}
}
