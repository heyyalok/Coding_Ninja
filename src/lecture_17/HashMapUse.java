package lecture_17;

public class HashMapUse {

	public static void main (String [] args) throws HashMapEmptyException
	{
		HashMap<String , Integer> map = new HashMap<String,Integer>();
		
		map.insertInMap("ram", 6);
//		map.insertInMap("sita", 5);
//		map.insertInMap("lakshman", 4);
//		map.insertInMap("hanuman", 3);
//		map.insertInMap("bharat", 2);
//		map.insertInMap("duryodhan", 1);
		
		
		
//		System.out.println(map.size());
//		
		int value = map.getValue("am");
		System.out.println(value);
		//map.delete("ram", 6);
		
		//map.print(map);
		
	}
}