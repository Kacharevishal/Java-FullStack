package arrayexamples;

public class MergeArray {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7,8,9};
		
		int[] merge = new int[arr1.length+arr2.length];
		
		for(int i = 0;i < arr1.length;i++)
		{
			merge[i] += arr1[i];
			merge[arr1.length+i] += arr2[i];
		}
		
		for(int a : merge)
		{
			System.out.print(a+" ");
		}
	}

}
