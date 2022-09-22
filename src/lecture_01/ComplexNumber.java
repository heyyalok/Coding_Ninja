package lecture_01;

public class ComplexNumber {
	private int real ;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) 
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	public void print() 
	{
		System.out.println(real+" + i"+imaginary);
	}
	public void setReal(int r) 
	{
		this.real = r;
	}
	public void setImaginary(int i) 
	{
		this.imaginary = i;
	}
	public void plus (ComplexNumber c2)
	{
		this.real = this.real+c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	public void multiply (ComplexNumber c3) 
	{
		this.real = (c3.real *this.real)-(c3.imaginary*this.imaginary);
		this.imaginary = (c3.real * this.imaginary)+(c3.imaginary * this.real);// this is giving error
	}
}