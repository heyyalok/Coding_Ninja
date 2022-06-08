package Lecture_02;
import java.util.Scanner;
public class Character_input 
{
	public static void main(String[]args) 
	{
		Scanner scr = new Scanner (System.in);
		System.out.println("input any char");
        String gender1 = scr.next();
		//System.out.print(gender);
		char gender =gender1.charAt(0);
		System.out.print(gender);
	}

}
