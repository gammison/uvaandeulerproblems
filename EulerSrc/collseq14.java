


import java.util.*;
import java.math.*;
import static java.lang.System.*;

public class collseq14 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==-1)
				break;
			long largest = 0;
			int find = 0;
			for(int i = 1; i<n; i++)
			{
				long temp = collseq(i,0);
				if(temp>largest)
				{
					largest = temp; find = i;
				}
			}
			out.println(largest+ " "+find);
		}
	}
	public static long collseq(long n,long len)
	{	//out.println(n + " "+len);
		if(n==1)
			return len;
		if(n%2==0)
		{
			return collseq(n/2,++len);
		}
		else
			return collseq(3*n+1,++len);
	}
}
