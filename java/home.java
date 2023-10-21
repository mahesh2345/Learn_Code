class MainClass
{
	public static void main(String args[])
	{
		int a=0, count=0, last=10;
		while(true)
		{
			int n1=0, sum=0;
			while(n1!=0)
			{
				sum*=10;
				sum+=n1%10;
				n1/=10;
			}
			if(sum==a)
			{
				count++;	
			}
			if(count==last)
			{
				System.out.println(count + "th palindrome is"+a);
				break;
			}
			a++;
		}
	}
}