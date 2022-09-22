package lecture_03;
import java.util.Scanner;
public class runner 
{

	public static int[] takeInput() 
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) 
	{
		for(int i = 0; i < input.length; i++) 
		{
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] input = takeInput();
		solution1.mergeSort(input, 0, input.length-1);
		printArray(input);
	}
}