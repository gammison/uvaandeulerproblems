import java.util.*;

public class largestpalindromeproduct {
	//find the largest palindrome product of two 3 digits numbers
	public static void main(String[] args)
	{	int largest = 0;
		for(int i = 100; i<=999; i++)
		{
			for(int b = 100; b<=999; b++)
			{
				String p = (new StringBuffer(""+i*b)).toString();
				String pr = (new StringBuffer(""+i*b)).reverse().toString();
				
				if(p.equals(pr))
				{	
					if(i*b > largest)
						largest = i*b;
				}
				else continue;
			}
		}
		System.out.println(largest);
	}
}
