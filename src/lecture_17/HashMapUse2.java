package lecture_17;
import java.util.Set;
import java.util.HashMap;
public class HashMapUse2 {

	public static void main (String[]args) 
	{
//		HashMap<String, Integer> map =  new HashMap <String,Integer>();
//		map.put("alok", 2);
//		map.put("is", 2);
//		map.put("coding", 4);
//		
//		
//		int v =0;
//		if(map.containsKey("alok1")) 
//		{
//			v = map.get("alok1");
//		}
//		//int v = map.get("alok1");
//		System.out.println(v);
//		
//		
//		// remove function gives the value at that specified key
//		// also it deletes the key from the map
//		int removedValue = map.remove("alok");
//		System.out.println(removedValue);
//		
//		int v1 = 0;
//		if (map.containsKey("alok")) 
//		{
//			v1 = map.get("alok");
//		}
//		System.out.println(v1);
		
		
		
		// if we want to iterate through the the whole map's key 
		// we can iterate through the whole map using set finction by importing 
		// them from the import  i.e., refer to the line 2 in this program 
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("kumar", 1);
		map1.put("coding",2);
		map1.put("alok",3);
		map1.put("ninja", 5);
		
		// order is not maintained in the keySet();
		
		
		
		if (map1.containsKey("kumar")) 
		{
			System.out.println("it is present");
		}
		else 
		{
			System.out.println("it is not present");
		}
		
		int v = 0;
		if (map1.containsKey("alok")) 
		{
			v = map1.get("alok");
		}
		System.out.println(v);
		
		
		//int v1 =  0;
		if(map1.containsValue(2)) 
		{
			System.out.println("this map has 2 as a value");
		}
		Set <String > key = map1.keySet();
		for(String str : key) 
		{
			System.out.println(str);
		}
	}	
}