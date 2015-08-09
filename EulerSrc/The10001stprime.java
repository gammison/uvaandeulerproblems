import java.util.*;

public class The10001stprime {
	//finds the 10001st prime, problem 7, could've used a sieve 
	public static void main(String[] args)
	{
		List<Long> primes = new ArrayList<Long>();
		primes.add(2L);
		long cr = 3;
		int cnt = 1;
		while(cnt != 10001)
		{	boolean prime = true;
			for(long i : primes)
			{
				if(cr%i==0)
					prime = false;
			}
			if(prime){
				cnt++;primes.add(cr);
			}
			cr++; 
		}
		System.out.println(primes.get(10000));
	}
}
