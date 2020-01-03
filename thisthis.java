class temp
{
	int a,b;
	temp(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int temp1(temp obj)
	{
		int ans;
		ans = obj.a+obj.b;
		return(ans);
	}
}
class thisthis
{
	public static void main(String[] args) 
	{
		int s=0;
		temp ob = new temp(5,6);
		s=ob.temp1(ob);
		System.out.println("sum is "+s);
			
	}
}