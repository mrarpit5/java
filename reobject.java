class sample
{
	int x;
	sample(int x)
	{
		this.x=x;
	}
	sample square()
	{
		sample obj = new sample(x*x);
		return obj;
	}
}
class reobject 
{
	public static void main(String[] args) 
	{
		sample s = new sample(5);
		System.out.println("x is "+s.x);//5
		s=s.square();
		System.out.println("now x "+s.x);//25
		s=s.square();
		System.out.println("ok now x "+s.x);//625
	}
}
