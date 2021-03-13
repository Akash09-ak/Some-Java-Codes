//Given an array of n no. that has  values in range (1 to n+1). Every no. appears exactly once Hence one no. is mising Find the missing no.
//example a={1,2,5,6,3} o/p- 4 is missing
import java.util.*;
class bit5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int missing=method1(arr,n);
		System.out.println("The missing no. is "+ missing);
		
		int missing2=good_method(arr,n);
		System.out.println("The missing no. is "+ missing2);
	}

	public static int method1(int arr[],int n)
	{
		int sum1=0;
		for (int i =0;i<n-1;i++)
		{
			sum1=sum1+arr[i];
		}
		int sum2=n*(n+1)/2;
		return sum2-sum1;
	}
	
 
// good method using xor
	public static int good_method(int arr[],int n)
	{
		int res=0;
		for(int j=1;j<=n;j++)
			res=res^j;
		for(int i =0;i<n-1;i++)
		{
			res=res^arr[i];
		}
	
		return res;
	}
}
