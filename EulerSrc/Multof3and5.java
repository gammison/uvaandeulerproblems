import java.util.*;

public class Multof3and5 {
	//adds all mults of 3 and 5 below 1000, prob id 1
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i<1000; i++)
		{
			if(i%5==0 || i%3 ==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
