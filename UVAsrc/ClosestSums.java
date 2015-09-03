import java.util.*;
import static java.lang.System.*;
//author gammison
// UVA prob ID 10487
public class ClosestSums {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casee = 0;
		while(in.hasNextLine())
		{	casee++;
			int casesize = in.nextInt();
			if(casesize == 0)
			{
				break;
			}
		
			out.println("Case "+casee+":");
			
		
			int[] setone = new int[casesize];
			
			for(int i = 0; i<setone.length; i++)
			{
				setone[i] = in.nextInt(); 
			}
			
			int[] queries = new int[in.nextInt()];
			
			for(int ii = 0; ii<queries.length; ii++)
			{
				queries[ii] = in.nextInt();
			}
			
			for(int i : queries)
			{	
				int closestsum = Integer.MAX_VALUE-i;
				
				for(int a = 0; a< setone.length-1; a++)
				{	int asum = setone[a];
					for(int b = a+1; b<setone.length; b++)
					{
						int bsum = setone[b];
						if(Math.abs(asum+bsum - i) <Math.abs(closestsum-i))	
							closestsum = asum+bsum;
						
					}
				}
				out.println("Closest sum to "+i+ " is "+closestsum+".");
			}
		}
	}
}
