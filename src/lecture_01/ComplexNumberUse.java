package lecture_01;
import java.util.Scanner;
public class ComplexNumberUse
{
	public static void main (String[]args) 
	{
		Scanner scr = new Scanner (System.in);
		System.out.print("enter the first real and imaginary number");
		int real1 = scr.nextInt();
		int imaginary1 = scr.nextInt();
		
		System.out.print("enter the second real and imaginary number");
		int real2 = scr.nextInt();
		int imaginary2 = scr.nextInt();
		
		
		ComplexNumber c1 = new ComplexNumber(real1,imaginary1);
		
		ComplexNumber c2 = new ComplexNumber (real2,imaginary2);
		int choice = scr.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}