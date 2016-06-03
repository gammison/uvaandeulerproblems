import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class BinPacking102 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//all possible bin arrangements
		TreeMap<Integer,Character> bins = new TreeMap<Integer,Character>();
		bins.put(0,'B');
		bins.put(1,'G');
		bins.put(2, 'C');
		int[][] perms = {{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,1,0},{2,0,1}};
		int[] bin1;int[] bin2;int[] bin3;																
		while(in.hasNext())	
		{
			int[][] bine = new int[3][3];
			for(int r = 0; r<3; r++){
				for(int c = 0; c<3; c++){
					bine[r][c] = in.nextInt();
				}
			}
			int totalwrong = Integer.MAX_VALUE;
			String min = ""; String temp; int wrongtemp;
			for(int[] p : perms){
				temp = ""; wrongtemp = 0;
				for(int r = 0; r<3; r++){ // for each bin in the perm
					temp+=bins.get(p[r]);
					for(int cc = 0; cc<bine[r].length; cc++){
						if(cc!=p[r]){
							wrongtemp+=bine[r][cc];
						}
					}
				}
				if(wrongtemp<totalwrong){
					min = temp;
					totalwrong = wrongtemp;
				}
				else if(wrongtemp==totalwrong){
					if(min.compareTo(temp)>0){
						min = temp;
					}
				}
			}
			out.println(min + " "+totalwrong);
		}
	}
}
