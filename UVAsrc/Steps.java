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
			
			
			long startstep = 1;
			long count = 0;
			
			long x = in.nextLong();
			long y =in.nextLong();
			while(x<y)
			{	count++;
				x+=startstep;
				
				if(x<y)
				{	count++;
					y-=startstep;
				}
		
				startstep++;
			
			}
			out.println(count);
		}
	}

}
