import java.util.*;
import static java.lang.System.*;

public class ReverseAndAdd {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		long n = in.nextLong();
		for(long i = 0; i<n; i++)
		{
			long rev = in.nextInt();
			long snum = 0;
			
			while(!pdrome(rev))
			{
				snum++;
				rev += reve(rev); 
			}
			out.println(snum + " "+rev);
		}
		
	}
	
	public static long reve(long rev)
	{	int newnum = 0;
		while(rev>0)
		{	newnum *= 10;
			newnum+= rev%10;
			rev/=10;
			
		}
		
		return newnum;
	}
	public static boolean pdrome(long rev)
	{
		  long len = (int) Math.ceil(Math.log10(rev+1));
		    for (long n = 0; n < len / 2; n++)
		    {   	if ((rev / (int) Math.pow(10, n)) % 10 != (rev / (int) Math.pow(10, len - n - 1)) % 10)
		    		{  	 
		            	return false;
		    		}
		    }
		    return true;
	}
	
}
