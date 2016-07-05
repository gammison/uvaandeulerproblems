import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class LCB10114 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){

			int month = in.nextInt();
			double dp = in.nextDouble();
			double loanam = in.nextDouble();
			double pay = loanam/month;
			int deprec  = in.nextInt();

			if(month<0)
				break;
			double car = loanam+dp;
			int m = in.nextInt(); double rate = in.nextDouble();
			car-=car*rate; deprec-=1;
			int nmonth=-1; double nrate=-1;
			if(deprec!=0){
				nmonth = in.nextInt(); nrate = in.nextDouble();
			}
			while(car<loanam && month>0){
				m++;
				--month;
				if(m == nmonth){
					rate = nrate;
					deprec-=1;
					if(deprec>0){
						nmonth = in.nextInt(); nrate = in.nextDouble();
					}
				}
				loanam-=pay;
				car=car*(1-rate);
				if(car>loanam)
					break;
				//car-=car*rate;

				//out.println(m+ " " +loanam+" "+car + " "+rate);

			}
			out.println(m==1 ? m+" month": m+" months");

		}
	}
}
