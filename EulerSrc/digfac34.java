import java.util.*;
import static java.lang.System.*;

public class digfac34 {
	public static void main(String[] args) 
	{
		int sum =0;
		for(int i = 3 ; i < 2540161; i++)
		{	int temp = 0;
			int number = i;
			while(number>0)
			{
				int dig = number%10;
				temp +=fac(dig);
				number/=10;
			}
			if(temp ==i)
			{
				sum+=i;
			}
		}
		out.println(sum);
	}
	public static int fac(int n)
	{
		if(n==0)
			return 1;
		return n*fac(n-1);
	}
}
