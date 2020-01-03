class sd
{
	public static void main(String[] args) 
	{
		int s=0,n,r;
		n = Integer.parseInt(args[0]);
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
			
		}
		System.out.println("sum of digit is "+s);
	}
}