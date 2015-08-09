import java.util.*;
import java.util.Map.Entry;

public class SmallestMultiple {
	//Problem 5, what is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
	public static void main(String[] args)
	{	int n = 20;
		
		
		HashMap<Double,Double> maxocofprimes = new HashMap<Double,Double>();
		HashSet<ArrayList<Double>> pfacs = new HashSet<ArrayList<Double>>();
		for(double i = 2; i<=n; i++) //get prime factors of each number <n
		{
			
			pfacs.add(pfac(i));
		}
		
		ArrayList<Double> primeslessn = new ArrayList<Double>();
		primeslessn.add(2.0);
		for(double i = 2; i<=n; i++) //get prime numbers <n
		{	boolean p = true;
			for(double a : primeslessn)
			{
				if(i%a ==0)
					p = false;
			}
			if(p) primeslessn.add(i);
		}
		
		for(double b : primeslessn) //get max occurance of each prime number <n
		{
			double maxb = 0;
			for(ArrayList<Double> c : pfacs)
			{	int count = 0;
				for(double d : c)
				{
					if(d == b)
						count++;
				}
				if(count>maxb) maxb = count;
				
			}
			maxocofprimes.put(b, maxb);
		}
		
		double product = 1;
		for(Entry<Double,Double> me : maxocofprimes.entrySet())
		{
			product *= Math.pow(me.getKey(), me.getValue());
		}
		
		
		
		
		System.out.println(product);

			
	}
	
	public static ArrayList<Double> pfac(double tp)
	{	
		
		ArrayList<Double> prod = new ArrayList<Double>();
		
		double div = 2;
		
		while(tp>1)
		{
			while(tp%div ==0)
			{
			prod.add(div);
			tp/=div;
			}
			div++;
		}
		return prod;
	}
}
