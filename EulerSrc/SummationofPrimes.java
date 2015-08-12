import java.util.*;

public class SummationofPrimes {
	//Euler Problem 9, 
	
	public static void main(String[] args)
	{
		long sum = 0;
		
		
		int ind = 2;
		while(ind < 2000000)
		{	
			if(isprime(ind))
			{
				sum+=ind;
			}
			ind++;
			 System.out.println(sum+ " "+ind);
		}
		System.out.println(sum);
	}
	
	public static boolean isprime(int ind)
	{
		boolean isp = true;
		for(int i = 2; i<Math.sqrt((double)ind+1); i++)
		{
			if(ind%i==0)
			{
				isp= false;
				break;
			}
		}
		return isp;
	}
	
}
