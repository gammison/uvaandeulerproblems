 import static java.lang.System.*;
 import java.io.*;
 import java.util.*;
 
 public class Factorial160
 {
 	public static void main(String[] args) throws IOException
 	{
 		Scanner in = new Scanner(System.in);
 		String dat = "";
 		while(in.hasNextLine())
 		{
 			long n = in.nextLong();
 			if(n == 0)
 				break;
 			//find primes in each less n and start count
 			//out.println(pfacs(n));
 			ArrayList<Integer> factorial = pfacs(n);
 			for(long i = n-1; i>1; i--)
 			{
 				ArrayList<Integer> temp = pfacs(i);
 				//out.println(pfacs(i));
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
 				
 			}String n1 =""+ n;
 			while(n1.length()<3)
 			{
 				n1 = " "+n1;
 			}dat = ""+n1+"! =";
 			//out.print(n1+"! =");
 			int cnt = 1; String[] nums = factorial.toString().replaceAll("[\\[\\]]|\\,0", "").replaceAll(",", "").replaceAll("0\\s", "").replaceAll("\\s0", "").split(" ");
 			for(int x = 0; x<nums.length; x++)
 			{	while(nums[x].length()<3)
 					nums[x] =" "+nums[x];
 				if(x+1-(15*cnt) <0)
 					{	dat = dat +nums[x];
 						//out.print(nums[x]+"");
 					}
 				else if(x+1-(15*cnt)<=0){
 					dat = dat +nums[x];out.print(nums[x]);
 				}
 					
 				else if(x+1-(15*cnt) == 1)
 				{	cnt++;
 					//out.print("\n      "+nums[x]);
 					dat = dat +"\n     "+nums[x];
 				}
 			}
 			out.println(dat);
 			
 			
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
