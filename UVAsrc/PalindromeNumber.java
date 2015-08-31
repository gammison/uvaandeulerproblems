// problem id 120L50L
import java.util.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {
	public static void main(String[] args) throws IOException
	{	InputStreamReader input = new InputStreamReader(new FileInputStream(("input.in")));
	
		BufferedReader inputty = new BufferedReader(input);
		
		
		do 
		{
			String token = inputty.readLine();
			long index = Long.parseLong(token); 
			if(index == 0L)
			{	break;
			
			}
			
			long pl10L = 0L;
			long startn = 0L;
			long startcount = 0L;
			long stat = pslessn(pl10L);
			
			while(index > stat)
			{	
				pl10L++;
				stat = pslessn(pl10L);
				if(index<stat){
					pl10L--;
					startn = (int)Math.pow(10L, pl10L);
					startcount = pslessn(pl10L);
					break;
				}
				
			}
			if(index < 10L)
			{
					startn = 1; startcount = 1;
			}
			
			long upperbound = (int) Math.pow(10L, pl10L+1);
			
			/*while(startcount != index && startn<upperbound)
			{	
				if(ispalindromic(startn))
				{	startcount++;
					//out.println(startcount + " " + index);
				}
				if(startcount==index)
					break;
				startn++;
			}*/
			
			for(long i = startn; i<upperbound; i++)
			{
				if(ispalindromic(i))
				{
					startcount++;
				}
				if(startcount == index)
					break;
			}
			
			out.println(startn);
			
			
		}while(inputty.ready());
	}
	
	public static long lowerbound(long index)
	{
		long pw10L = (long) Math.ceil(Math.log10(index+1)); out.println(pw10L);
		return pslessn(pw10L);
	}
	public static long pslessn(long pw10L)
	{
		if(pw10L%2 == 0L)
		{
			return (int) (2 * (Math.pow(10L, pw10L/2)-1));
		}
		else
			return (int)(11 * Math.pow(10L, (pw10L-1)/2) - 2);
	}
	

	public static boolean ispalindromic(long i)
	{
		   long len = (int) Math.ceil(Math.log10(i+1));
		    for (long n = 0; n < len / 2; n++)
		    {   	if ((i / (int) Math.pow(10, n)) % 10 != (i / (int) Math.pow(10, len - n - 1)) % 10)
		    		{  	 
		            	return false;
		    		}
		    }
		    return true;
		
	}
}
