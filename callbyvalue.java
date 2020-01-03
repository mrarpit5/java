class test
{
	void call(int i,int j)
	{
		i=i*2;
		j=j/2;
	}
}
class callbyvalue
{
	public static void main(String[] args) 
	{
		test t1 = new test();
		int a=15,b=20;
		t1.call(a,b);
		System.out.println("ans is "+a);	
	}
}