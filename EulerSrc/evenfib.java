import java.util.*;

public class evenfib {
	//adds all even terms of fib sequence <4 million, prob id 2
	
	public static void main(String[] args)
	{
		int term = 1;
		int prevterm = 1;
		int sum = 0;
		int tempterm = 0;
		while(term<4000000)
		{
			if(term % 2 ==0)
			{
				sum+= term;
			} tempterm = term;
			term += prevterm;
			prevterm=tempterm;
		}
		System.out.println(sum);
	}
}
