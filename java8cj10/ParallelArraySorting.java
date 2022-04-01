package java8cj10;
import java.util.Arrays;

public class ParallelArraySorting {
	public static void main(String[] args) {
		int[] arr= {5,3,6,8,0,1,9};
		System.out.println("Array elements before sorting");
		for(int i:arr) {
			System.out.println(i+"");
		}
		Arrays.parallelSort(arr);
		System.out.println("Array elements After sorting");
		for(int i : arr) {
			System.out.println(i+"");
		}
	}


}
