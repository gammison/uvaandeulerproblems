import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Skyline105 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] heights = new int[10000];
		int leftc,rightc,height; String dat;
		while(in.hasNextLine()){
			dat = in.nextLine();
			if(dat.equals("")) break;
			String[] data = dat.split(" ");
			
			leftc =Integer.parseInt(data[0]);
			height = Integer.parseInt(data[1]);
			rightc = Integer.parseInt(data[2]);
			for(int x = leftc; x<rightc; x++){
				if(height > heights[x]){
					heights[x] = height;
				}
			}
		}
		//out.println(Arrays.toString(heights));
		for(int a = 1; a<10000; ++a){ 
			
			
			//out.println(heights[a] + " "+heights[a-1]);
			if(heights[a]!=heights[a-1]){
				if(a>1) 
				{
					out.print(" ");
				}
				out.print(a + " "+heights[a]); 
			}
		}
		out.println();
	}
}
