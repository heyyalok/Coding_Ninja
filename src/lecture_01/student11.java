package lecture_01;

public class student11
{
	String name;
	int roll_number;
	
	public student11(String name , int roll_number) 
	{
		this.name = name;
		this.roll_number = roll_number;
		System.out.println(" jhjh    "+this);
	}
	public static void main (String[]args) 
	{
		student11 s1 = new student11("alok", 180);
		
		
		System.out.println(s1);
		
		
		
		student11 s2 = new student11 ("kumar", 132);
		
		
		System.out.println(s2);
	}
}