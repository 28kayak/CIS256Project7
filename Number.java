
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
			if(this.number == ((Number)obj).number)
			{
				equality = true;
			}
		}
		else
		{
			equality = false;
		}
		return equality;
		
	}
	public int hashCode(Object obj)
	{
		return ((Number)obj).number % 71;
		/*
		int hashedIndex;
		return hashedIndex;
		*/
	}
	
	public int hashCode1(Object obj)
	{
		return 
	}
}
