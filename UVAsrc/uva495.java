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
