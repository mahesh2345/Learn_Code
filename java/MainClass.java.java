class MainClass
{
	public static void main(String args[])	
	{
		int n = 101, n1 = n, sum = 0;
		while(n1!=0){
			sum*=10;		
			sum+=n1%10;
			n1/=10;
	}
	if(sum==n){
		boolean b = false;
		if(n==0 || n==1){
			b = true;
		}
		else{
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					b=true;
					break;
				}
		if(!b){
			System.out.println(n+ "is palindromic prime");
		}
		
}  
