//author gammison 
import java.math.BigInteger;
import java.util.*;
import static java.lang.System.*;

public class HowManyFibs {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		BigInteger lowerbound = new BigInteger(String.valueOf(-1));
		BigInteger upperbound = new BigInteger(String.valueOf(-1));
		
		lowerbound = new BigInteger(in.next());
		upperbound = new BigInteger(in.next());
		
		while(!(lowerbound.compareTo(BigInteger.ZERO)==0) || !(upperbound.compareTo(BigInteger.ZERO)==0))
		{
			
		
				String fibb = ""+startfib(BigInteger.ZERO,lowerbound,upperbound,BigInteger.ZERO,BigInteger.ZERO,BigInteger.ZERO,BigInteger.ZERO);
				out.println(fibb);
				lowerbound = new BigInteger(in.next());
				upperbound = new BigInteger(in.next());			
		}
	}
	
	public static BigInteger startfib(BigInteger truecount, BigInteger stcount, BigInteger stpcount, BigInteger currcount, BigInteger currentfib,BigInteger prev1, BigInteger prev2 )
	{	
		if(currentfib.compareTo(stpcount)>=0)
		{
		return truecount;
		}
	
		if(currcount.compareTo(BigInteger.valueOf(2)) < 0)
		{	currcount = currcount.add(BigInteger.ONE); 
			currentfib =  BigInteger.ONE;
			prev1 =  BigInteger.ONE;
			prev2 =  BigInteger.ONE;
		}
		if(currcount.compareTo(BigInteger.valueOf(2))>=0)
		{
			currcount = currcount.add(BigInteger.ONE);
			BigInteger tprev1 = currentfib;
			currentfib=prev1.add(prev2);
			prev1= currentfib;
			prev2 = tprev1;
			
		}
		if(currentfib.compareTo(stcount)>=0 && currentfib.compareTo(stpcount)<=0)
		{
			truecount = truecount.add(BigInteger.ONE);
		}
		
		
			return startfib(truecount,stcount,stpcount,currcount,currentfib,prev1,prev2);
		
	}
}