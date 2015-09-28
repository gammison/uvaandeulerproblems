//author gammison
// UVA Prob 846
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Steps {
	public static void main(String[] args) throws IOException

	{
		Scanner in = new Scanner(System.in);
		
		int tcases = in.nextInt();
		
		for(int i = 0 ; i<tcases; i++)
		{
			int diff = Math.abs(in.nextInt()-in.nextInt());
			
			int startstep = 1;
			int count = 0;
			int toget =0;
			while(diff>0)
			{	

				diff-=startstep;
				count++;
				
				if(diff>factorial(startstep+1))
				{	startstep++;
					
				}
				else
				{
					if(startstep>1)
						startstep--;	
				}
					
			}
			out.println(count);
		}
	}
	public static long factorial(long num)
	{
		if(num == 1)
			return num;
		else return num*factorial(--num);
	}
}
