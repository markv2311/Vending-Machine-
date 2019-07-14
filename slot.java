public class slot 
{
	public boolean skittles, starburst, sourpatch;
	public boolean hershey, crunch, kitkat; 
	public double skit, star, sour; 
	public double hers, crun, kit; 
	
	public slot (double sk, double st, double so, double he, double cr, double ki)
	{
		this.skittles = false;
		this.starburst = false;
		this.sourpatch = false;
		this.hershey = false;
		this.crunch = false;
		this.kitkat = false;
		this.skit = sk; 
		this.star = st;
		this.sour = so;
		this.hers = he; 
		this.crun = cr;
		this.kit = ki;
		
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
	public void sethershey()
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