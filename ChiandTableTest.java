
public class ChiandTableTest
{
	
	
	public static void main(String [] arg)
	{
		ChainedTable<Integer, String> chaindTable = new ChainedTable<Integer,String>(10);
		chaindTable.put(Integer.valueOf(131), "Kaya Ota");
		chaindTable.put(Integer.valueOf(125), "5^3");
		
		
		System.out.printf("Key = %d  " + chaindTable.get(Integer.valueOf(131)) + "\n", Integer.valueOf(131));
		System.out.println(chaindTable.get(Integer.valueOf(125)));
		
		if(chaindTable.containsKey(Integer.valueOf(131)))
		{
			System.out.println("Yes! there is the muched key");
			System.out.printf("Key = %d  " + chaindTable.get(Integer.valueOf(131)) + "\n", Integer.valueOf(131));
		}
		else                                                                                                                                                                                                             
		{
			System.out.println("No, there is no such a key muched");
		}
		
		chaindTable.remove(Integer.valueOf(131));
		System.out.println("after removing");
		if(chaindTable.containsKey(131))
		{
			System.out.println("Yes! there is the muched key!!!!");
		}
		else
		{
			System.out.println("No, there is no such a key muched, Sorry try again");
		}
		
	}
}
