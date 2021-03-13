import java.util.*;
class power2
{
  public static void main(String args...)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if((n&(n-1))==0)           // using bitwise & operator  
       System.out.println(n+" is Power of two");
    else
       System.out.println(n+" is not Power of two");
  }
}
