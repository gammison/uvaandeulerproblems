import java.util.*;
import static java.lang.System.*;

public class ReverseAndAdd {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
		for(int i = 0; i<n; i++)
		{
			int rev = in.nextInt();
			int snum = 0;
			do 
			{
			snum++;
			rev += reve(rev); 
			}while(!pdrome(rev));
			out.println(snum + " "+rev);
		}
		
	}
	
	public static int reve(int rev)
	{	int newnum = 0;
		while(rev>0)
		{	newnum *= 10;
			newnum+= rev%10;
			rev/=10;
			
		}
		
		return newnum;
	}
	public static boolean pdrome(int rev)
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
