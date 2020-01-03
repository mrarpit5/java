class argcount
{
	public static void main(String[] args) 
	{
		int c = args.length;
		System.out.println("total arguments are  "+c);
		for(int i = 0;i<c;i++)
		{
			System.out.println("argument "+i+" = "+args[i]);
		} 	
	}
}