import java.util.*;
import static java.lang.System.*;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.io.*;

public class FarAbove {
	
	private  static int smallsum = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		
		int tcase = in.nextInt();
		for(int a = 0; a<tcase; a++)
		{
			int fx = in.nextInt();
			int fy = in.nextInt();
			Point2D.Double floyd = new Point2D.Double();
			floyd.setLocation(fx, fy);
			
			int sx = in.nextInt();
			int sy = in.nextInt();
			Point2D.Double ship = new Point2D.Double();
			ship.setLocation(sx,sy);
			
			int ast = in.nextInt();
			Point2D[] asts = new Point2D[ast];
			
			for(int i = 0; i<ast; i++)
			{
				asts[i].setLocation(in.nextInt(),in.nextInt());
			}
			
		}
	}
	//move to every valid point
	private static int getdasum(int bigsum,int cursum, boolean canmove, point2D[] asts, Point2D floyd, Point2D ship,Point2D movingto)
	{
		if(floyd.equals(ship))
		{
			return bigsum;
		}
		
		if(!canmove)
			break;
		cursum+=move(currdir,floyd,asts);
		for(Point2D b : asts)
		{	
			floyd.setLocation()
			getdasum(bigsum, cursum+move(floyd,b),canmove,asts)
		}
			
		getdasum(bigsum,cursum)
		
	}
	
	
	
	private static int move(Point2D floyd, Point2D chosen)
	{
		return (int) floyd.distance(chosen);
	}
}
