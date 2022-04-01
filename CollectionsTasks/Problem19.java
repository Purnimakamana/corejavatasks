package CollectionsTasks;
/*Create a method which accepts an integer array and removes all the duplicates in the array.
Return the resulting array in descending order*/

public class Problem19 {
	public static int removeDuplicates(int array[],int n) {
		if(n==0 || n==1) {
			return 0;
		}
		int[]temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[n-1];
		for(int i=0;i<j;i++) {
			array[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int array[]= {16,16,45,45,25,38,38,39};
		int length=array.length;
		length=removeDuplicates(array,length);
		for(int i=0;i<length;i++) {
			System.out.println(array[i]+" ");
		}
	}

}
