import java.util.*;
import java.math.*;

public class billiard10387 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		int hside = -1;
		int vside = -1;
		int totaltime = -1;
		int mvertb = -1;
		int nhorizb = -1;
		while(in.hasNextInt())
		{
			
			 hside = in.nextInt();
			 vside = in.nextInt();
			 totaltime =in.nextInt();
			 mvertb =in.nextInt();
			 nhorizb =in.nextInt();
			if(hside == 0 || vside == 0 || totaltime == 0 || mvertb==0 || nhorizb==0)
				break;
			double xcompv = (((double)nhorizb * hside))/2/totaltime;
			double ycompv = (((double)mvertb * vside))/2/totaltime;
			
			double resv = Math.sqrt(Math.pow(xcompv,2)+Math.pow(ycompv, 2));
			double anglez = Math.atan(ycompv/xcompv)*(180/Math.PI);
			
			
			System.out.println(hside + " "+vside+ " "+totaltime+" "+mvertb+" "+nhorizb);
			System.out.println(); System.out.printf("%.2f ",anglez); System.out.printf("%.2f", resv); 
		
		}
	}
}
