// print prime numbers form the range
class p2
{
	public static void main(String[] args)
	{
		int i,j,s,e,ans;
		s = Integer.parseInt(args[0]);
		e  =Integer.parseInt(args[1]);
		System.out.println("starting is "+s +"end is "+e);
		if(s<2)
		{
			s=2;
		}	
		for(i=s;i<=e;i++)
		{
			ans=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					ans=0;
					break;
				}
			}
				if(ans==1)
				{
					System.out.println(" "+i);
				}
			}
		}
}
