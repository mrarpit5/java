interface interest
{
	final double pi = 3.14;
	double simple(double r);
	double compound(double p,double r,double n);
}
class i1 implements interest
{
	public double simple(double a)
	{
		double a1;
		a1 = pi*a*a;
		return a;
	}
	public double compound(double x,double y,double z)
	{
		double i;
		i=(x*y*z)/100;
		return i;
	}
}
class interfaced
{
	public static void main(String[] args) 
	{
		double b,c;
		interest in = new i1();
		b=in.simple(10);
		System.out.println("simple is "+b);
		c = in.compound(10,20,30);
		System.out.println("compound is "+c);
	}
}