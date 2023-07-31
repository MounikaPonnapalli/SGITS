//7.5 Check if the string is palindrome or not.
import java.util.Scanner;
public class CheckPalindromeStringOrNot 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("String in reverse order:"+reverse);
        if(str.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    
}
