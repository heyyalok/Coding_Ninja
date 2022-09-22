package lecture_07;

public class Pair<T> {
	private T firstNum;
	private T secondNum;
	
	public Pair (T first , T second) 
	{
		this.firstNum = first;
		this.secondNum = second;
	}
	public void setFirst (T first) 
	{
		firstNum = first;
	}
	public void serSecond (T second) 
	{
		secondNum = second;
	}
	public T getFirst () 
	{
		return firstNum;
	}
	public T getSecond() 
	{
		return secondNum;
	}
}