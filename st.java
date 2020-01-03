class st
{
	void ch(int c) throws ArithmeticException
	{
		if(c<18)
		{
			throw new ArithmeticException("nano cho ho babu");
		}
		else
		{
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		st ob = new st();
		ob.ch(10);
	}
}