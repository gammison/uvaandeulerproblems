import java.util.*;
import static java.lang.System.*;
import java.io.*;

 class commonperm10252 {
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())
		{
			String one = in.nextLine();
			String two = in.nextLine();
			
			
			List<Character> duh = new ArrayList<Character>(); 
			if(!one.isEmpty() && !two.isEmpty())
			{
				for(int a = 0; a<one.length(); a++)
				{
				for(int b = 0; b<two.length(); b++)
				{
					if(one.charAt(a) == two.charAt(b))
					{
						duh.add(two.charAt(b));
						
						one =one.replaceFirst(""+one.charAt(a), ".");
						two = two.replaceFirst(""+two.charAt(b), ",");
						
					}
				}
			}
			Collections.sort(duh);
			
			System.out.println(duh.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").replaceAll("\\s", ""));
			
			} else System.out.println();
			
		
				
		}
	}
}
