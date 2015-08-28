// problem id 12050
import java.util.*;
import static java.lang.System.*;

public class PalindromeNumbers {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext())
		{
			
			int index = in.nextInt();
			if(index == 0)
			{	break;
			
			}
			
			int lowerbound = 0;
			int pl10 = 0;
			int startn = 0;
			int startcount = 0;
			int stat = pslessn(pl10);
			while(index > stat)
			{	
				pl10++;
				stat = pslessn(pl10);
				if(index<stat){
					pl10--; startn = (int)Math.pow(10, pl10); startcount = stat; break;
				}
				
			}
			 if(index < 10){
					startn = 0; startcount = 1;
				}
			
			while(startcount != index)
			{
				if(startn == revdig(startn))
				{	
					startcount++;
				}
				startn++;
			}
			out.println(startn);
			
			
		}
	}
	
	public static int lowerbound(int index)
	{
		int pw10 = 0;
		while(index/10 > 0)
		{
			pw10++;
			index/=10;
		}
		return pslessn(pw10);
	}
	public static int pslessn(int pw10)
	{
		if(pw10%2 == 0)
		{
			return (int) (2 * (Math.pow(10, pw10/2)-1));
		}
		else
			return (int)(11 * Math.pow(10, (pw10-1)/2) - 2);
	}
	
	public static int revdig(int num)
	{
		int tempn = 0;
		while(num>0)
		{
			tempn *= 10;
			tempn+= num%10;
			num/=10;
		}
		
		
		
		return tempn;
	}
}
