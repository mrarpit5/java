class sum
{
	int a,b,c;
	int ans=0;
	void add(int x)
	{
		a=x;
		ans = a+a;
		System.out.println("ans is "+ans);
	}
	void add(int x,int y)
	{
		a=x;
		b=y;
		ans = a+b;
		System.out.println("ans is "+ans);
	}
	void add(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		ans = a+b+c;
		System.out.println("ans is "+ans);
	}
}
class methodoverload
{
	public static void main(String[] args) 
	{
		sum s = new sum();
		s.add(5);
		s.add(5,5);
		s.add(2,6,2);	
	}
}