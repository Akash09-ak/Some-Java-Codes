//Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
import java.io.*;
import java.math.*;
import java.util.*;
public class ConsecutiveOnes
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int n = in.nextInt();         // Taking an integer as input
in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
int counter = 0, max =0;
while (n > 0)
{
int rem = n%2;                  
if (rem==1) counter++; 
else counter=0;
max = Math.max(counter, max);
n/=2;
}
System.out.println(max);
in.close();
}
}
