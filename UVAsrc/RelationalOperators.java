import java.util.*;
import static java.lang.System.*;

public class RelationalOperator {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long sets = in.nextLong();
		for(long i = 0; i<sets; i++)
		{
			long first = in.nextLong();
			long second = in.nextLong();
			//out.println(first+" "+second);
			if(first == second)
				out.println("=");
			else if (first > second)
				out.println(">");
			else if (first < second)
				out.println("<");
		}
	}
}
