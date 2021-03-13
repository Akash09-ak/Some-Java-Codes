// program to implement map and its method , map is an interface in java
// map is key-value pair in Java like dictionary in python
// it have unique key i.e. no duplicate key is used
// 1 key map only 1 value
import java.util.*;
class map1
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> menu= new HashMap<>();  
		menu.put("Momos",40);                      		// this function is used to add key value pair
		menu.put("SpringRoll",50);
		menu.put("Kabab",40);
		menu.put("Chowmin",50);
		System.out.println(menu);
                menu.remove("Chowmin");				       // this function used to delete the key which is put inside it
		System.out.println(menu);
		System.out.println(menu.values());       // this method will give only values inside menu
		System.out.println(menu.keySet());      // this method will give us only keys inside menu
		System.out.println(menu.get("Momos"));      // it returns the value of given key if present if not present returns null
		System.out.println(menu.containsKey("Kabab"));   // it returns boolean value whether key is present or not
	}
}
		
	
