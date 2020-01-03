class armstrong
{
	public static void main(String[] args)
	 {
		int n,q,r,temp,s=0;
		n = Integer.parseInt(args[0]);
		temp=n;
		while(n>0)
		{
			r=n%10;
			q=r*r*r;
			s=s+q;
			n=n/10;
		}
		if(temp == s)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");	
		}
	}
}