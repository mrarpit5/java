class m1
{
	int a,b;
	void m()
	{
		int c = a+b;
		System.out.println(c);
	}
}
class method
{
	public static void main(String[] args)
	{
		m1 ob = new m1();
		ob.a=10;
		ob.b=20;
		ob.m();	
	}
}
