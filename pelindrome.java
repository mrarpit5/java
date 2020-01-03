class pelindrome
{
	public static void main(String[] args) 
	{
		int n,r,temp,n1=0;
		n = Integer.parseInt(args[0]);
		while(n>0)
		{
			r = n%10;
			n1 = (n1*10)+r;
			n = n/10;
		}	
		System.out.println(" "+n1);
	}
}