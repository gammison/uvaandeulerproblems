import java.util.*;
import java.io.*;

public class AdjacentDigits {
	// Problem 8, find 13 adjacent digits that have the greatest product
	
	public static void main(String[] args) throws IOException
	{	
		
		Scanner in = new Scanner(new File("numbergrid.in"));
		int r = in.nextInt();
		int c = in.nextInt();
		in.nextLine();
		char[][] value= new char[r][c];
		String line = "";
		for(int r1 = 0; r1<r; r1++)
		{
			
			line = line+in.nextLine();
			
		}
	
		long maxprod = 1L;
		for(int b = 0; b<line.length(); b++)
		{
			if(b+12<line.length())
			{
				String temp = line.substring(b, b+13);
				long product = 1L;
				for(char y : temp.toCharArray())
				{
					product*= (long)(y-48);
				}
				if(product>maxprod) maxprod = product;
			}
		}
		System.out.println(maxprod);
	}
}
	

