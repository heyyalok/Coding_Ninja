package Lecture_02;
import java.util.Scanner;
public class Fah_to_cel {
	public static void main (String[]args) 
	{
		Scanner scr = new Scanner (System.in);
		float feh = scr.nextFloat();
		float cel = (((feh-32)*5)/9);
		scr.close();
		System.out.println(cel);
	}
}
