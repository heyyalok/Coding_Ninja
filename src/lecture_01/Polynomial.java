package lecture_01;

public class Polynomial 
{
	 int coefficient;
	 int power;
	public Polynomial () 
	{
		
	}
	public void setCoefficient(int power, int coefficient) 
	{
		power = power;
		coefficient = coefficient;
	}
	public void print () 
	{
		System.out.println(coefficient+"x"+"^"+power);
	}
}