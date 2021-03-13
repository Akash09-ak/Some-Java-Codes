import java.util.*;
class Reverse_Array
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of elelments in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int first=0,last=n-1;
		while(first<last)         // loop  for reversing
		{
			int temp=a[first];    // swapping first element with last
			a[first]=a[last];
			a[last]=temp;
			first++;                 // incrementing first index by 1
			last--;                  // decrementing last by 1
		}  
		for(int i:a)
			System.out.print(i+" ");
	}
}
			
