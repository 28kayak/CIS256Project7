
public class Number
{
	int number;
	
	public Number(int num)
	{
		number = num;
	}
	@Override
	public boolean equals(Object obj)
	{
		boolean equality = false;
		if(obj.getClass().equals(this.getClass()))
		{
			equality = true;
		}
		else
		{
			equality = false;
		}
		return equality;
		
	}
	@Override
	public int hashCode(Object obj)
	{
		int hashedIndex;
		return hashedIndex;
	}
}
