
public class Plot {
	
	private Coord[] points;
	private int full;
	
	public Plot()
	{
		points = new Coord[12];
	}
	
	public void add(Coord in)
	{
		points[++full] = in;
		
		//special case to allow the array to grow
		if (full == points.length)
		{
			Coord[] temp = new Coord[full];
			temp = points;
			points = new Coord[full + 1];
			points = temp;
		}
	}
	
	private double distance(Coord one, Coord two)
	{
		double i = one.getX() - two.getX();
		double j = one.getY() -two.getY();			
		double distance = Math.sqrt((i*i) - (j*j));
		
		return distance;
	}
}
