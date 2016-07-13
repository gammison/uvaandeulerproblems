import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class EventPlanning11559 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int part = in.nextInt();
			int budge = in.nextInt();

			int[] costs = new int[in.nextInt()];
			int weeks = in.nextInt();
			int tcost = Integer.MAX_VALUE;
			int temp = 0;
			for(int i = 0; i<costs.length; i++){
				temp = in.nextInt();

				tcost = Integer.MAX_VALUE;
				for(int a = 0; a<weeks; a++){
					int bed = in.nextInt();
					if(bed>=part && part*temp<tcost){
						tcost = part*temp;
					}
				}
				costs[i] = tcost;
			}
		//	out.println(Arrays.toString(costs));
			Arrays.sort(costs);
			if(costs[0] > budge){
				out.println("stay home");
			}
			else
				out.println(costs[0]);
		}
	}
}
