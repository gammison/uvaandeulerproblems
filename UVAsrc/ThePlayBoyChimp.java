import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class ThePlayBoyChimp {
	//UVA Problem ID 10611
	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
	
			int numladychimp = in.nextInt();
			int[] ladychimpheights = new int[numladychimp];
			for(int a = 0; a<numladychimp; a++)
			{
				ladychimpheights[a] = in.nextInt();
			}
			int luchuheight = in.nextInt();
			//int[] luchuheights = new int[luchuheight];
			
			for(int a = 0; a<luchuheight; a++)
			{
				int i2 = in.nextInt();
				
			
				int ladymin = Integer.MAX_VALUE;
				int ladymax = 0;
				for(int k : ladychimpheights)
				{	
					if(k > i2 && k< ladymin)
					{	
						ladymin = k;
					}
					if(k <i2 && k>ladymax)
					{
						ladymax = k;
					}
				}
				if(ladymax != 0 && ladymin<Integer.MAX_VALUE)
					out.println(ladymax + " "+ladymin);
				else if(ladymax == 0 && ladymin<Integer.MAX_VALUE) 
					out.println("X"+" "+ladymin);
				else
					out.println(ladymax+ " X");
				
				
				
					
				
			}

	}
}
