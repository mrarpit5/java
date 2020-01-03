class simple
{
	public static void main(String[] args) 
	{
		int i,p,r,n;
		p = Integer.parseInt(args[0]);
		r = Integer.parseInt(args[1]);
		n = Integer.parseInt(args[2]);
		i=p*r*n/100;	
		System.out.println("simple interest is "+i);
	}
}