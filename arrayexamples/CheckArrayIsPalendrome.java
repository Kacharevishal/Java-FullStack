package arrayexamples;

public class CheckArrayIsPalendrome {

	public static void main(String[] args) {

		int[] arr = {1,2,3,3,2,1};
		
		int leftIndex = 0;
		int rightIndex = arr.length-1;
		boolean flag = true;
		
		while(leftIndex < rightIndex)
		{
			if(arr[leftIndex] != arr[rightIndex])
			{
				flag = false;
			}
			leftIndex++;
			rightIndex--;
		}
		if(flag == true)
		{
			System.out.println("is Palindrome");
		}
		else
		{
			System.out.println("is Not Palindrome");
		}
			
	}

}
