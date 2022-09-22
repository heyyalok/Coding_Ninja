package lecture_01;
//this class will help us to find the fraction based operation
// we can say this class is backend of fraction class where we have created many fraction based constructors which will help 
// to gain the outcome for the fraction operations which we  will generate in the main class for fractions 

public class fraction
{
	private int numerator ;
	private int denominator ;
	
	public fraction(int numerator , int denominator) 
	{
		this.numerator = numerator;
		if (denominator == 0) 
		{
			//return;
		}
		this.denominator = denominator;
		simplify();
	}
	
    public void setdenominator ( int denominator) throws zeroException// we have created our own class which will throw the error of saying zeroexception
    //when we enter denominator = 0;//
	{
		if (denominator==0) 
			
		{  
			zeroException e = new zeroException();
			throw e;
			// once we have entered the value of denominator = 0, then we have the class of zeroexeption 
			// and the object of that class will be called out.
			
			
		}
		this.denominator = denominator;
		this.simplify();
	}
	
    public int  getdenominator () 
	{
		return denominator;
	}
	
    public void setnumerator(int numerator) 
	{
		this.numerator = numerator;
		simplify();
	}
	
    public int getnumerator () 
	{
		return numerator;
	}
	
    private void simplify()
	{
		int gcd = 1;
		int smaller = Math.min(numerator,denominator);
		for (int i  = 2; i<= smaller ; i++)
		{
			if (numerator % i == 0 && denominator % i == 0) 
			{
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator /gcd;
	}
	
    public  void print() 

	    {
	       if (denominator == 1) 
	          {
		         System.out.println(numerator);
	          }	
	       else 
	       {
	    	   System.out.println(numerator +"/"+denominator);   
	       }
	    }
    
    public static fraction add (fraction f1, fraction f2) 
    {
    	int newnumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
    	int newdenominator = f1.denominator * f2.denominator;
    	fraction f = new fraction (newnumerator, newdenominator);
    	return f;
    } 
    public void add (fraction f2) 
    {
    	this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
    	this.denominator = this.denominator * f2.denominator;
    	simplify();
    	
    }
    public void multiply(fraction f2)
    {
    	this.numerator = this.numerator * f2.numerator ;
    	this.denominator = this.denominator * f2.denominator;
    	simplify();
    }
    
}