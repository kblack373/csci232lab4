/*
 * @author kblack373
 * 27 11 2017
 * 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//takes in file
		File file = new File("input.txt");
		Scanner in = new Scanner(file);
		
		//initiates a plot
		Plot plot = new Plot();
		
		
		double x, y;
		
		
		while(in.hasNextDouble())
		{
			x = in.nextDouble();
			y = in.nextDouble();
			plot.add(new Coord(x, y));
			
		}
		
		in.close();
		
		
	}
}
