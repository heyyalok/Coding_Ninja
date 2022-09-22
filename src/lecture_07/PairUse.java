package lecture_07;

public class PairUse {
	public static void main (String[]args) 
	{
		Pair<String> P = new Pair<String>("coding", "ninja");
		
		//P.setFirst(40);
		//P.serSecond(80);
		
		String numfirst = P.getFirst();
		String numsecond = P.getSecond();
		
		System.out.print(numfirst+" "+numsecond);
	}
}