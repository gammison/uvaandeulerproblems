import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Card {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int tcase = in.nextInt();
		for(int i = 0 ; i<tcase ; i++)
		{
			String cnum = in.next();
			String expdate = in.next();
			int ind = i+1;
			if(cnum.length() == 8)
			{	
				if((cnum.charAt(0)-48)%2 != 0)
				{
					int m = Integer.parseInt(expdate.substring(0,2));
					if(m>=1 && m<=12)
					{
						if(Integer.parseInt(cnum)%Integer.parseInt(expdate) == 0)
						{;
							out.println("Case "+ ind + ": VALID");
						}
						else out.println("Case "+ ind + ": BOGUS");
					}
					else out.println("Case "+ ind + ": BOGUS");
				}
				else out.println("Case "+ ind + ": BOGUS");
			}
			else out.println("Case "+ ind + ": BOGUS");
		}
	}
}
