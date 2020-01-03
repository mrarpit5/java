class factorial
{
	public static void main(String[] args) 
	{
		int i,n,s=1;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println("factorial is "+s);
	}
}