package lecture_03;
public class keypad
{	
	public static char [] keypadCollection (int n)
	{
		// making a function that returns character array 
		char[]one = {' '};
		char[]two = {'a','b','c'};
		char[]three = {'d','e','f'};
		char[]four = {'g','h','i'};
		char[]five = {'j','k','l'};
		char[]six = {'m','n','o'};
		char[]seven = {'p','q','r','s'};
		char[]eight = {'t','u','v'};
		char[]nine = {'w','x','y','z'};
		if (n==2) 
		{
			return two;
		}
		if (n==3) 
		{
			return three;
		}
		if (n==4) 
		{
			return four;
		}
		if (n==5) 
		{
			return five;
		}
		if (n==6) 
		{
			return six;
		}
		if (n==7) 
		{
			return seven;
		}
		if (n==8) 
		{
			return eight;
		}
		if (n==9) 
		{
			return nine;
		}		
		return one;
	}
}