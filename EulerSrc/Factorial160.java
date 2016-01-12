import static java.lang.System.*;
 import java.io.*;
 import java.util.*;
 
 public class Factorial160
 {
 	public static void main(String[] args) throws IOException
 	{
 		Scanner in = new Scanner(System.in);
 		
 		while(in.hasNextLine())
 		{
 			long n = in.nextLong();
 			//find primes in each less n and start count
 			out.println(pfacs(n));
 			ArrayList<Integer> factorial = pfacs(n);
 			for(long i = n-1; i>1; i--)
 			{
 				ArrayList<Integer> temp = pfacs(i);
 				out.println(pfacs(i));
 				if(factorial.size()>=temp.size())
 				{	for(int a = 0; a<temp.size(); a++)
 					{
 						factorial.set(a, temp.get(a)+factorial.get(a));
 					}
 				}else{
 					for(int a = 0; a<factorial.size(); a++)
 					{
 						temp.set(a, temp.get(a)+factorial.get(a));
 					}
 					while(factorial.size()!=temp.size())
 					{
 						factorial.add(0);
 					}
 					for(int x: factorial)
 	 				{
 	 					factorial.set(factorial.indexOf(x),factorial.get(factorial.indexOf(x)+temp.get(factorial.indexOf(x))));
 	 				}
 				}
 				out.println(factorial);
 			}
 			
 		}
 	}
 	
 	public static ArrayList<Integer> pfacs(long n)
 	{	int div = 2;
 		ArrayList<Integer> temp = new ArrayList<Integer>();
 		int start = 0;
 		while(n>1)
 		{	int tcount = 0;
 			temp.add(0);
 			while(n%div == 0)
 			{
 				tcount++ ;
 				n/=div;
 			}
 			temp.add(start, tcount); start++;
 			div++;
 		}
 		return temp;
 	}
 	
 }
