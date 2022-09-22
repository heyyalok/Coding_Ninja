package lecture_01;

public class fraction_use
{
	public static void temp() 
	{
		fraction f1 = new fraction (20,30);
		f1.print();
		
		f1.setnumerator(12);
		int d = f1.getdenominator();
		System.out.println(d);
		f1.print();
		
		f1.setnumerator(10);
		try 
		{
			f1.setdenominator(0);	
		}
		catch (zeroException e)// we will catch the error as the class and the object 
		{
			System.out.println("don't use 0 as denominator");
		}
		f1.print();
		
		fraction f2 = new fraction (3,4);
		f1.add(f2);
		f1.print();
		f2.print();
		
		fraction f3 = new fraction (4,5);
		f3.multiply(f2);
		f3.print();
		
		fraction f4 = fraction.add(f1,f3);
		f1.print();
		f3.print();
		f4.print();
		
	}
	public static void main (String[]args)throws zeroException {
		temp();
	}
}