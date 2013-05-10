import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class HashFunction
{
	public static void main(String [] args)
	{
		Number num1 = new Number(4164644);
		Number num2 = new Number(5746002);
		Number num3 = new Number(4166045);
		Number num4 = new Number(5740268);
		Number num5 = new Number(5748762);
		Number num6 = new Number(4165412);
		
		System.out.println(num1.hashCode(num1));
		System.out.println(num2.hashCode(num2));
		System.out.println(num3.hashCode(num3));
		System.out.println(num4.hashCode(num4));
		System.out.println(num5.hashCode(num5));
		System.out.println(num6.hashCode(num6));
		
		
		try
		{
			//Open the file that is the first command line parameter 
			FileInputStream  fileStream = new FileInputStream("customer.txt");
			DataInputStream input = new DataInputStream(fileStream);
			BufferedReader breader = new BufferedReader(new InputStreamReader(input));
			String eachLine;
			//Read file line by line
			while((eachLine = breader.readLine())!= null)
			{
				//print the content on the console 
				System.out.println(eachLine);
			}
			//close the input stream
			input.close();
		}
		catch(Exception ex)
		{
			System.err.println("Error: " + ex.getMessage());
		}
		
		
	}
}
