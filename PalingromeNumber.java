// Check whether the given number is palindrome or not.
import java.util.Scanner;
public class PalingromeNumber
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int reverse=0,r;
        int temp=num;
        while(num!=0)
        {
            r=num%10;
            reverse=reverse*10+r;
            num=num/10;
        }
        num=temp;
        if(temp==reverse)
        {
            System.out.println("Entered number is palindrome");
        }
        else
        {
            System.out.println("Entered number is not palindrome");
        }
    }
    
}
