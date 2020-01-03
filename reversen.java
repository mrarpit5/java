class reversen
{
	public static void main(String[] args) 
	{
		int n,r;
		n = Integer.parseInt(args[0]);
		System.out.println("befor reverse is "+n);
		while(n>0)
		{
			r = n%10;
			
			n=n/10;
			System.out.println("after reverse is "+r);
		}	
		
	}
}