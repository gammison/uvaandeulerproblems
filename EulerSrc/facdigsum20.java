


import java.util.*;
import java.math.*;
import static java.lang.System.*;

public class facdigsum20 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while(in.hasNext())
		{
			String n = in.next();
			if(n.equals("-1"))
				break;
			sum = 0;
			BigInteger nn = new BigInteger(n,10);
			//out.println(nn);
			BigInteger fac = new BigInteger("1",10);
			while(!nn.equals(BigInteger.ZERO))
			{
				fac = fac.multiply(nn);
				nn = nn.subtract(BigInteger.ONE);
				//out.println(fac);
			}
			
			for(char x : fac.toString().toCharArray())
			{
				sum+= (int)(x-48);
			}
			out.println(sum);
		}
	}
}
