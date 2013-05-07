
public class Costomer
{
	private String name;
	private String address;
	private Number phoneNum; //the Hash table will use this as a key
	
	public Costomer(String aName, String add, Number phone)
	{
		setName(aName);
		setAddress(add);
		setNumber(phone);
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public Number getPhoneNumber()
	{
		return phoneNum;
	}
	public void setName(String costomerName)
	{
		name = costomerName;
	}
	public void setAddress(String costomerAddress)
	{
		address = costomerAddress;
	}
	public void setNumber(Number phoneNumber)
	{
		phoneNum = phoneNumber;
	}
	
	public String toString()
	{
		String costomer;
		costomer = "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone: " + getPhoneNumber();
		return costomer;
	}

}
