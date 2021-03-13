// ArrayList is a data structure or we can say collections in java
import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> ar =new ArrayList<Integer>();
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i =0;i<n;i++)
		{
			ar.add(sc.nextInt());              							    // add() is used to add element in arraylist
		}
		System.out.println(ar);
		System.out.println("The size of araylist is "+ar.size());          // size() is used to get size of araylist
		if(n>2)
			ar.remove(2);                        					   	   // remove() is used to remove element in arraylist by giving index of that element
		System.out.println("After removing the 2 index element \n"+ar);
		int num=ar.get(1);                       					      // get() is used to get the element with a given index as input
		System.out.println(num);
		ar.set(0,99);                             						 // set() is used to set the value to any particular index
		System.out.println(ar);
                                       				
// looping in arraylist
// normal for loop
		for (int i =0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
// for each loop
		for(int i:ar)
		{
			System.out.println(i);
		}
		System.out.println("After sorting");
		Collections.sort(ar);                                        // Collections.sort() is used to sort collections like Arraylist, Linkedlist
		System.out.println(ar);
		ar.clear();  												//  clear() is used to clear the arraylist
		System.out.println(ar);									    
	}
}
		
			
