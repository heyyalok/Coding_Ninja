package lecture_01;

public class Student
{
	 public String name;// we have made this variable public because we want to use them in different packages
	 private  int rollNumber; // and the same reason for this variable also.
	
	public void setRollNumber (int rn) 
	{
		if (rn <= 0) 
		{
			return;
		}
		rollNumber = rn;
	}
	public int getRollNumber () 
	{
		return rollNumber;
	}
}