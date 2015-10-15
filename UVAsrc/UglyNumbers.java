import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class UglyNumbers {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Scanner in = new Scanner(System.in);
		
		int ugc = 1;
		int start = 2;
		
		while(ugc != 1500)
		{
			/*ArrayList<Integer> pfac = pfac(start);
			ArrayList<Integer> torem = new ArrayList<Integer>();
			torem.add(2);torem.add(3); torem.add(5);
			out.println(pfac);
			pfac.removeAll(torem);
			out.println(pfac); */
			
			
			if(pfacc(start))
			{
				ugc++;
			}
			start++;
		}
		
		
		out.println("The 1500'th ugly number is "+ start);
	}
	
	public static ArrayList<Integer> pfac(int n)
	{	ArrayList<Integer> pfactors = new ArrayList<>();
		int num = n;
		int div = 2;
		while(num>1)
		{ 
			while(num%div == 0)
			{
				pfactors.add(div);
				num/=div;
			}
			div++;
		}
		return pfactors;
	}
	// it should be 859963392
	public static boolean pfacc(int n)
	{
		long num = n;
		double div = (int)Math.sqrt(num);
		while(num>1)
		{ 
			while(num%div == 0)
			{
				if(div%2 != 0 && div%5 != 0 && div%3!=0)
				{
					return false;
				}
				num/=div;
			}
			div--;
		}
		
		return true;
	}
}
