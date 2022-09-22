package lecture_01;
import java.util.Scanner;
public class Student_use
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
		Student s1 = new Student();
		s1.name = "alok";
	    s1.setRollNumber(123);
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