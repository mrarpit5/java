class abc
{
	int a,b;
	void big(int x, int y)
	{
		a=x;
		b=y;
	}
	int big(abc z)
	{
		int k,l;
		k=z.a;
		l=z.b;
		if(k>l)
		{
			return k;
		}
		else
		{
			return l;
		}
	}
}
class objoverload
{
	public static void main(String[] args)
	{
		int s=0;
		abc o = new abc();
		o.big ob = new big(10,20);
		s=ob.big(ob);
		System.out.println("big is"+s);	
	}
}