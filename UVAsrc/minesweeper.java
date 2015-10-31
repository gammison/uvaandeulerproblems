import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class minesweeper {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		int a = 0;
		int ind = 0;
		int sx = in.nextInt();
		int sy = in.nextInt();
		while(in.hasNext())
		{	ind++;
			
			if(sx == 0 || sy == 0)
			{
				break;
			}
			
			char[][] grid = new char[sx][sy];
			in.nextLine();
			
			for(int i = 0; i<grid.length; i++)
			{
				String line = in.nextLine();
				a = 0;
				for(char x : line.toCharArray())
				{
					if(x != '.')
						grid[i][a] = x;
					else
						grid[i][a] = '0';
					a++;
				}
				
			}
			/*for(char[] b : grid)
			{
				out.println(Arrays.toString(b));
			}*/
			
			for(int r = 0; r < grid.length; r++)
			{
				for(int c = 0; c<grid[r].length; c++)
				{
					if(grid[r][c] == '*')
					{
						if(r+1 < grid.length && c < grid.length && grid[r+1][c] != '*')
						{
							grid[r+1][c] = (char) (grid[r+1][c]+1);
						}
						if(r+1 < grid.length && c-1 > -1 && grid[r+1][c-1] != '*')
						{
							grid[r+1][c-1] = (char)(grid[r+1][c-1]+1);
						}
						if(r+1 < grid.length && c+1 < grid[r+1].length && grid[r+1][c+1] != '*')
						{
							grid[r+1][c+1] = (char)(grid[r+1][c+1]+1);
						}
						if(r-1 > -1 && c < grid.length && grid[r-1][c] != '*')
						{
							grid[r-1][c] = (char)(grid[r-1][c]+1);
						}
						if(r-1 >-1 && c-1 >-1 && grid[r-1][c-1] != '*')
						{
							grid[r-1][c-1] = (char)(grid[r-1][c-1]+1);
						}
						if(r-1 >-1 && c+1 < grid[r-1].length && grid[r-1][c+1] != '*')
						{
							grid[r-1][c+1] = (char)(grid[r-1][c+1]+1);
						}
						if(r < grid.length && c < grid[r].length && grid[r][c] != '*')
						{
							grid[r][c] = (char)(grid[r][c]+1);
						}
						if(r < grid.length && c-1 >-1 && grid[r][c-1] != '*')
						{
							grid[r][c-1] = (char)(grid[r][c-1]+1);
						}
						if(r < grid.length && c+1 <grid[r].length && grid[r][c+1] != '*')
						{
							grid[r][c+1] = (char)(grid[r][c+1]+1);
						}
						
					}
				}
			}
			out.println("Field #"+ind+":");
			for(char[] b : grid)
			{
				out.println(Arrays.toString(b).replaceAll("[\\,\\[\\]]", "").replaceAll(" ", ""));
			}
			sx = in.nextInt();
			sy = in.nextInt();
			if(sx != 0 || sy!=0)
				out.println();
			else
				break;
			
		}
	}
}
