import java.util.*;
import static java.lang.System.*;
import java.math.BigInteger;
public class uva495{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BigInteger[] fib = new BigInteger[5001];
		fib[0] = BigInteger.ZERO;
		fib[1] = BigInteger.ONE;
		for(int i = 2; i<5001; i++){
			fib[i] = fib[i-1].add(fib[i-2]);
		}
		while(in.hasNextInt())
		{	
			int num = in.nextInt();
			out.printf("The Fibonacci number for %d is %s\n",num,fib[num]);
		}
	}
}
/* Alternate
//different quick ways of calculating fibonacci numbers
import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.BigInteger;

public class QuickFib {
	private static  HashMap<BigInteger,BigInteger> fibs = new HashMap<BigInteger,BigInteger>();
	
	
	
	public static void main(String[] args) throws IOException{
		fibs.put(BigInteger.ZERO,BigInteger.ZERO); fibs.put(BigInteger.ONE,BigInteger.ONE);
		Scanner in = new Scanner(System.in);
		
		
		while(in.hasNext()){
			
			BigInteger temp = new BigInteger(in.next());
			out.println("The Fibonacci number for "+temp.toString()+" is "+getfib(temp).toString());
			
		}
		System.exit(0);
	}
	
	public static BigInteger getfib(BigInteger ind){
		if(!fibs.containsKey(ind)){
			fibs.put(ind, getfib(ind.subtract(BigInteger.ONE)).add(getfib(ind.subtract(BigInteger.ONE.add(BigInteger.ONE)))));
		}
		return fibs.get(ind);
	
	}
}
*/
