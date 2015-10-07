import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Thankful {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int tcase = in.nextInt();
		for(int i = 0; i<tcase; i++)
		{
			int nnums = in.nextInt();
			String[] data = new String[nnums];
			for(int a = 0; a<nnums; a++)
			{
				data[a] = in.next();
				
				
			}
			int ind = i+1;
			out.println("Case "+ind+": "+findallmin(data)+ " "+findallmax(data));
		}
	}
	
	private static int findallmax(String[] datatomax)
	{	int max = 0;
		for(String d : datatomax)
		{
				max+= findmax(new StringBuilder(d));	
		}
		return max;
	}

	private static int findallmin(String[] datatomin)
	{
		int min = 0;
		for(String d : datatomin)
		{
				min+= findmin(new StringBuilder(d));	
		}
		return min;
	}
	
	
	
	
	private static int findmax(StringBuilder dats)
	{	
		if(dats.charAt(0) == '-')
		{
			for(int a = 1; a<dats.length(); a++)
			{
				if(dats.charAt(a) == '#' && a==1)
					{	
						dats.setCharAt(a, '1');
					}
				else if(dats.charAt(a) == '#')
				{
					dats.setCharAt(a, '0');
				}
			
					
			}
		}
		else
		{
			for(int a = 0; a<dats.length(); a++)
			{
				if(dats.charAt(a) == '#')
				{
					dats.setCharAt(a, '9');
				}
				
					
			}
		}
		
		return Integer.parseInt(dats.toString());
	}
	
	private static int findmin(StringBuilder dats)
	{
		if(dats.charAt(0) == '-')
		{
			for(int a = 1; a<dats.length(); a++)
			{
				if(dats.charAt(a) == '#')
				{
					dats.setCharAt(a, '9');
				}
				
					
			}
		}
		else
		{
			for(int a = 0; a<dats.length(); a++)
			{	
				if(dats.charAt(a) == '#' && a== 0)
				{	
					dats.setCharAt(a, '1');
				}
				else if(dats.charAt(a)== '#')
					dats.setCharAt(a, '0');
			
					
			}
		} 
		return Integer.parseInt(dats.toString());
	}
}
