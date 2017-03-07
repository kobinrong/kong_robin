public class Honda implements Location 

	double x; 
	double y; 
	
	public Honda(double location)
	{
		this.x = x;
		this.y = y;
	}
	public int getID()
	{
		return 1 + (int)(Math.random() * 999999);
	}
		
	public void move(int x, int y)
	{
		this.x += x;
		this.y += y;
	}
		
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}