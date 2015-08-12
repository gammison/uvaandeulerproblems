import java.util.*;

public class pythagoreantriplet {
	//problem 9, pythagorean triplet for which a + b + c = 10001
	public static void main(String[] args)
	{
		int a = 3; int b = 4; int c = 5; 
		for(int a1 = 3; a1<1000; a1++)
		{
			for(int b1 = 4; b1<1000; b1++)
			{
				for(int c1 = 5; c1<1000; c1++)
				{
					if(a1+b1+c1 == 1000 && a1*a1 + b1*b1 == c1*c1 && a <b && b<c)
					{
						System.out.println(a1*b1*c1);
						break;
					}
				}
			}
		}
		
	}
}
