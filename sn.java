class sn
{
	public static void main(String[] args) 
	{
		int i,n,s=0;
		n =Integer.parseInt(args[0]);
		for(i=0;i<=n;i++)
		{
			s = s+i;
		}	
		System.out.println("sum of n is "+s);
	}
}