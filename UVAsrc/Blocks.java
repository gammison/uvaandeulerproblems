import java.util.*;

import static java.lang.System.*;
import java.io.*;

public class Blocks {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in); // use a stack
		int blocks =in.nextInt();
		ArrayList<Stack<Integer>> boxed = new ArrayList<Stack<Integer>>();
		for(int i=0; i<blocks; i++)
		{
			boxed.add(new Stack<Integer>());
			
		}
		while(in.hasNextLine())
		{
			String line=in.nextLine();
			if(!line.equals("quit"))
			{
				String[] command = line.split(" ");
				String ccup = command[0]+command[2];
			
				
				move(boxed,command[0],command[1]);
			} else break;
		}
		
	}
	private static void move(ArrayList<Stack<Integer>> boxy, int a, int b, String commandzo)
	{
		if(commandzo.equalsIgnoreCase("moveonto"))
		{
			
		}
		if(commandzo.equalsIgnoreCase("moveover"))
		{
			
		}
		if(commandzo.equalsIgnoreCase("pileonto"))
		{
			
		}
		if(commandzo.equalsIgnoreCase("pileover"))
		{
			
		}
	}
}
