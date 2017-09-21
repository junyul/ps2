package pkgShape;

public class MyInteger {

private int Number;
		

public MyInteger(int iValue) 
{
	Number = iValue;
}



public int getNumber() 
{
	return Number;
}
		

		
public boolean isEven() 
{
	if (Number % 2 == 0)
		return true;
	else
		return false;
}
		


public boolean isOdd() 
{
	if (Number % 2 != 0)
		return true;
	else
		return false;
}



		
public boolean isPrime() 
{	
		for (int i = 2; i < Number;) 
{
		if (Number % i == 0)
			return false;
			else;
				return true;
	}
		return false;
		
}
}
		



