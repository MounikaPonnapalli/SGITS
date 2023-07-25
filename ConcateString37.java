//37.Concate two strings
import java.util.Scanner;
public class ConcateString37 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1=input.next();
        System.out.println("Enter String 2:");
        String str2=input.next();
        System.out.println(str1.concat(str2));
    }
}
