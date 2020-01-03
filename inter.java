interface i 
{
	int a=10;
	int b=20;
 	void dis();
}
class abc implements i
{
	public void dis()
	{
		int c = a+b;
		System.out.println("ans is "+c);
	}

}
class inter
{
	public static void main(String[] args) {
		abc ob = new abc();
		ob.dis();
	}
}