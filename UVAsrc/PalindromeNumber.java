// problem id 12050
import java.util.*;
import static java.lang.System.*;

public class PalindromeNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext())
		{
			
			int index = in.nextInt();
			if(index == 0)
				break;
			
			int lowerbound = 0;
			int pl10 = 0;
			
			while(index > pslessn(pl10))
			{
				pl10++;
				if(index<pslessn(pl10)){
					pl10--; break;
				}
				
			}
			out.println(pslessn(pl10));
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
}
