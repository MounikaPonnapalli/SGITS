//Extract a substring from a string
import java.util.Scanner;
public class ExtractSubString39 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str=input.next();
        System.out.println("Enter the index:");
        int index=input.nextInt();
        String subStr=str.substring(index);
        System.out.println("Substring:"+subStr);
        System.out.println("Enter the last index:");
        int endIndex=input.nextInt();
        String subStr2=str.substring(0,endIndex);
        System.out.println("SubString:"+subStr2);
    }
}
