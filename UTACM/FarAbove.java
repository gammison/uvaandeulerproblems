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
			out.println(ast);
			for(int i = 0; i<ast; i++)
			{	int tx = in.nextInt(); int ty= in.nextInt();
			
				asts[i]= new Point2D.Double(tx,ty);
			}
			out.println("Case "+(a+1)+": "+getdasum(Integer.MAX_VALUE,0,asts,floyd,ship));
			
		}
	}
	//move to every valid point
	private static int getdasum(int bigsum,int cursum, Point2D[] asts, Point2D floyd, Point2D ship)
	{
		if(floyd.equals(ship))
		{	
			return bigsum;
		}
		 
		
			
		for(Point2D b : asts)
		{	
			if(floyd.getX()==ship.getX())
			{	cursum+= floyd.distance(ship);
				floyd.setLocation(floyd.getX(),ship.getY());
				
			}
			else if (floyd.getY()==ship.getY())
			{
				cursum+=floyd.distance(ship);
				floyd.setLocation(ship.getX(),floyd.getY());
			}
			if(floyd.equals(ship) && cursum <bigsum)
			{
				bigsum = cursum;
			
			}
			if(!(floyd.getY()==ship.getY()) && !(floyd.getY()==ship.getY()))
			{	if(floyd.getX() == b.getX()) // also put in check for ship
				{	cursum+= floyd.distance(b);
					floyd.setLocation(floyd.getX(),b.getY());
					
				}
				else if(floyd.getY()==b.getY())
				{	cursum+= floyd.distance(b);
					floyd.setLocation(b.getX(), floyd.getY());
					
				}
				
			}
			getdasum(bigsum, cursum,asts,floyd,ship);
		}
			
		
	}
	

}
