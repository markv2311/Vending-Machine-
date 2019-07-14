public class slot 
{
	private boolean skittles, starburst, sourpatch;
	private boolean hershey, crunch, kitkat; 
	private double skit = 1.25, star = 1.25, sour =1.25;
	private double hers = 2.00, crun = 2.00, kit = 2.00;
	
	public slot ()
	{
		this.skittles = false;
		this.starburst = false;
		this.sourpatch = false;
		this.hershey = false;
		this.crunch = false;
		this.kitkat = false;
		
	}
	
	public void setskittles()
	{
		this.skittles = true;
	}
	public double getskittles()
	{
		return this.skit;
	}
	public void setstarburst ()
	{
		this.starburst = true;
	}
	public double getstarburst()
	{
		return this.star;
	}
	public void sethershey();
	{
		this.hershey = true;
	}
	public double gethershey()
	{	
		return this.hers;
	}
	public void setsourpatch()
	{
		this.sourpatch = true; 
	}
	public double getsour()
	{
		return this.sour;
	}
	public void setcrunch()
	{
		this.crunch = true;
	}
	public double getcrun()
	{
		return this.crun;
	}
	public void setkitkat()
	{
		this.kitkat = true;
	}
	public double getkit()
	{
		return this.kit;
	}
}