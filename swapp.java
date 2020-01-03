class swapp
{
	public static void main(String[] args) 
	{
		int a,b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping a is "+a);
		System.out.println("after swapping b is "+b);
			
	}
	 
}