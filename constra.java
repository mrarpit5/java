class a
{
	int n1,n2;
	a()
	{
		System.out.println("this is difault constructor");
	}
	a(int a,int b)
	{
		n1=a;
		n2=b;
	}
	void dis()
	{
		System.out.println("n1 ->  "+n1);
		System.out.println("n2 ->  "+n2);
	}
}
class constra
{
	public static void main(String[] args) 
	{
		a ob = new a();
		a ob2 = new a(10,20);
		ob2.dis();
	}
	
}