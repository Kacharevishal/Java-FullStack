package practice;

public class CheckPrimeNo {

	public static void main(String[] args) {
		int num = 25;
		
		boolean isPrime = true;
		
		for(int i = 2;i < num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(num+": is Not a Prime Number...");
				isPrime = false; 
				break;
			}
		}
		if(isPrime == true)
		{
			System.out.println(num+": is Prime Number...");
		}

	}

}
