package lecture_01;
// backend class
public class Studentdetails 
{
	private String studentname ;
	private int studentage;
	private final String collagename;
	private int studentroll;
	private static int count ;
	
	public Studentdetails (String collage) 
	{
		collagename = collage;
		count ++;
	}
    static int getnumberofobjects() 
	{
		return count;
	}
	void setName(String name)
	{
		studentname  = name;
	}
	void setAge(int age) 
	{
		if (age <= 0) 
		{
			System.out.println("please eneter valid age");
			return;
		}
		studentage = age;
	}
	void setroll(int roll) 
	{
		studentroll = roll;
	}
	void print() 
	{
		System.out.println(collagename);
		System.out.println(studentname);
		System.out.println(studentage);
		System.out.println(studentroll);
	}
}