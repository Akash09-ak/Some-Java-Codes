import java.util.*;
class leetcode69 {
    public int mySqrt(int x) {
        if(x==0||x==1)
            return x;
        long start=1, end=x, mid, sqrt=0;
      
// using binary search approach
        while(start<=end)                    
        {
            mid=start+(end-start)/2;
            if(mid*mid==x)
                return (int)mid;
            if(mid*mid<x)
            {
                start=mid+1;
                sqrt=mid;
                
            }
            else
                end=mid-1;
                
        }
        return (int)sqrt;
    }

    public static void main(String args[])
    {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any no.");
		int n=s.nextInt();
        leetcode69 obj=new leetcode69();
		int ans=obj.mySqrt(n);
        System.out.println("The square root of "+n+" is = "+ans);
    }
}
