package Lecture_02;
import java.util.Scanner;
public class Average_Marks
{
	public static void main(String[] args) 
	{
			Scanner scr = new Scanner(System.in);
			String name1 = scr.next();
			char name = name1.charAt(0);
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = scr.nextInt();
			System.out.println(name);
			System.out.print((a+b+c)/3);
	}
}
