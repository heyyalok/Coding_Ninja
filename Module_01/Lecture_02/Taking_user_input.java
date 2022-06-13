package Lecture_02;
import java.util.Scanner;
public class Taking_user_input {
	public static void main(String[]args) 
	{
		Scanner scr = new Scanner(System.in);
		int p;
		int t;
		int r;
		int si;
		System.out.println("input the principle");
		p = scr.nextInt();
		System.out.println("input the time");
		t = scr.nextInt();
		System.out.println("input the rate");
		r = scr.nextInt();
		si = (p*r*t)/100;
		System.out.print(si);
	}
}
