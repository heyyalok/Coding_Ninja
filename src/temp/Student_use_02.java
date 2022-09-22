package temp;
import lecture_01.Student;
public class Student_use_02 
{

	public static void main (String[]args) 
	{
		Student s1 = new Student();
		//s1.name = "alok"; // this may not be visible because we are calling it from different package and 
		// when we call a class from different package we have to make sure the variable are set to be public in that class.
		//s1.rollNumber = 123; // same case here also
		s1.name = "alok";
	    s1.setRollNumber(-111);
	    int Rolls1 = s1.getRollNumber();
		Student s2 = new Student();
		s2.name = "coding ninja";
		s2.setRollNumber(987);
	    int Rolls2 = s2.getRollNumber();
		System.out.println(s1);// address of s1 
		System.out.print(s1.name+",");
		System.out.println(Rolls1);
		System.out.println(s2);// address of s2
		System.out.print(s2.name+",");
		System.out.println(Rolls2);
	}
}