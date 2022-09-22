package lecture_03;
import java.util.Scanner;
public class String_Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution2.isStringPalindrome(input));
	}
}

class solution2
{
	public static boolean isStringPalindrome(String input) 
    {
		// Write your code here
        boolean final_result = isStringPalindromeHelp(input, 0, input.length()-1);
        return final_result;
    }
    private static boolean isStringPalindromeHelp(String s, int startIndex, int lastIndex)
    {
        if (startIndex == lastIndex)
        {
            return true;
        }
        if (s.charAt(startIndex) != s.charAt(lastIndex))
        {
            return false;
        }
        boolean result = isStringPalindromeHelp(s,startIndex+1,lastIndex-1);
        return result;
    }
}
