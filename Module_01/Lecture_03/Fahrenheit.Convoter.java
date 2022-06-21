package Lecture_03;
import java.util.Scanner;
public class Fahrenhite_convoter
{
	public static void main(String[]args)
	{
		Scanner scr = new Scanner(System.in);
		int S = scr.nextInt();
		int E =  scr.nextInt();
		int W = scr.nextInt();
		while (S<=E)
		{
		int celsius = ((S -32)*5)/9;
		System.out.println(S+" "+celsius);
		
		S = S+W;
		}
	}
}
