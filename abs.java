abstract class demo
{
	int a=10;
	int b=20;
	abstract void d();
}
class de extends demo
{
	void d()
	{
		int c = a+b;
		System.out.println("ans is "+c);
	}

}
class abs 
{

	public static void main(String[] args) {
		de ob =new de();
		ob.d();
	}
}