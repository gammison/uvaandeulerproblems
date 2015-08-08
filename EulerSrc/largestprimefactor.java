import java.util.*;
import java.math.*;

public class largestprimefactor {
	//what is the largest prime factor of the number 600851475143?
	public static void main(String[] args)
	{	ArrayList<Long> pfactors = new ArrayList<>();
		long num = 600851475143L;
		long div = 2;
		while(num>1)
		{
			while(num%div == 0)
			{
				pfactors.add(div);
				num/=div;
			}
			div++;
		}
		System.out.println(Collections.max(pfactors));
	}
}
