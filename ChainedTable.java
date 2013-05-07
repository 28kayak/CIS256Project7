//ChainedTable.java
//ChainedTable is a chained hash table

public class ChainedTable<K, E>
{
	//For index i, the object in table[i] is head reference for a linked 
	//of all the elements for which hash(key) is i
	private Object [] table;
	private int manyItems = 0;

	public ChainedTable(int tableSize)
	{
		if(tableSize <= 0)
		{
			throw new IllegalArgumentException("Table size mush be positive");
		}
		table = new Object[tableSize];
	}
	public boolean containsKey(K key)
	{
		int index = hash(key);
		boolean containing = false;
		ChainedHashNode <K,E> cursor;
		ChainedHashNode<K,E> head;
		head = (ChainedHashNode<K, E>) table[index];
		
		for(cursor = head; cursor != null; cursor = cursor.link)
		{
			if(cursor.elements == key)
			{//can I compare the way? 
				containing = true;
			}
		}
		
		
		return containing;
	}
	public E get(K key)
	{
		int index = hash(key);
		if(index == -1)
		{
			return null;
		}
		else
		{
			return (E) table[index];
		}
		
	}	
	
	private int hash(K key)
	{//the return value is a valid index of the ChainedTable's table
	//the index is calculated as the remainder 
	//when the absolute value of the key's hash code is divided by the size of the ChainedTable's  table
		return Math.abs(key.hashCode()) % table.length;
	}
	@SuppressWarnings ("unchecked")
	public E put(K key, E elements)
	{
		ChainedHashNode<K,E> cursor =null;
		E answer = null;
		int index;
		if(key == null || elements == null)
		{
			throw new NullPointerException("Key or element is null");
		}
		//must write code here to set cursor to refer to the node 
		//that already contains the specifies node.
		//if there is no such node, then cursor is set to null
		index = hash(key);
		//cursor = (ChainedHashNode<K, E>) table[index];
		if(table[index] != null)
		{
			while(table[index] == null)
			{
				cursor = (ChainedHashNode<K,E> table[index]).cursor.link;
			}
		}
		else
		{
			cursor = null;
		}
			
		
		
			
		 
		if(cursor == null)
		{//add a new node at the front of the list of table[hash(key)]
			int i = hash(key);
			cursor = new ChainedHashNode<K,E> ();
			cursor.elements = elements;
			cursor.key = key; 
			cursor.link = (ChainedHashNode<K,E>) table[i];
			table[i] = cursor;
 
		}
		else
		{
			answer = cursor.elements;
			cursor.elements = elements;
		}
		manyItems++;
		return answer;
	}
	public E remove(K key)
	{
		return null;
	}
	public double estimateEfficiency()
	{
		double estimate;
		estimate = 1 + (manyItems/table.length) * (1/2);
		return estimate;
	}
	public double actualEfficiency()
	{
		
	}
}//class