class sub extends Thread
{
	public void run()
	{
		System.out.println("run");
	}

}
class mix 
{
	public static void main(String[] args) {
		sub ob = new sub();
		ob.run();
	}
}