class temp
{
	int a,b;
	temp(int x,int y)
	{
		a=x;
		b=y;
	}
	int temp1(temp obj)
	{
		int ans;
		ans = obj.a+obj.b;
		return(ans);
	}
}
class objarg
{
	public static void main(String[] args) 
	{
		int s=0;
		temp ob = new temp(5,6);
		s=ob.temp1(ob);
		System.out.println("sum is "+s);
			
	}
}