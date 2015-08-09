import java.util.*;

public class SumSquareDifference {
	//finds the difference of natural numbers - their squares, problem 6
	public static void main(String[] args)
	{
		int sumsquare = 0;
		int sumofsumsq = 0;
		for(int i = 1; i<=100; i++)
		{
			sumsquare+= i*i;
			sumofsumsq +=i;
		}
		System.out.println(sumofsumsq*sumofsumsq - sumsquare);
	}
}
