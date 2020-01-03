class fac
{
	int fact(int n)
	{
		int result;
		if(n==1)
		{
			//return 1;
			result = fact(n-1)*n;
			return result;
		}
	}
}
class recursion 
{
	public static void main(String[] args)
	 {
		fac f = new fac();
		System.out.println("factorial is "+f.fact(3));
		System.out.println("factorial is "+f.fact(4));
		System.out.println("factorial is "+f.fact(5));	
	}
}