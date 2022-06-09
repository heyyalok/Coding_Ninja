package Lecture_02;
import java.util.Scanner;
public class Multiple_inputs
{
	public static void main (String[]args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.next();
		System.out.println(a);
		System.out.println(str);
	}
}
