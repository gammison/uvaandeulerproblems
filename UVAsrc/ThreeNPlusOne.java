import java.util.*;
import static java.lang.System.*;
import java.io.*;

 class ThreeNPlusOne {
	public static void main(String args[]) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		while(keyboard.hasNextInt())
		{
			int i = keyboard.nextInt();
			int j = keyboard.nextInt(); 
			int from = Math.min(i, j);
			int to = Math.max(i, j);
			
			int tcall = 0;
			for(int a = from; a<=to; a++)
			{
				int temp= getN(a);
				tcall = Math.max(temp, tcall);
				
			}
		
			out.printf("%d %d %d\n", i, j, tcall);
		}	
		
	}
	public static int getN(int one)
	{
		int counter = 1;
		if(one !=1)
		{
			while(one!= 1)
			{	
				if(one%2!=0)
				{
					one = (3*one)+1;	
				}
				else if (one%2==0)
				{
					one = one/2;	
				}++counter;
			}
		}
		return counter;
	}

}
