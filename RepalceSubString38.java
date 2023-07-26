//38.Replace substring of a string
import java.util.Scanner;
public class RepalceSubString38
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string of words:");
        String str1=input.next();
        System.out.println("Enter the string u want to remove:");
        String sub_remove=input.next();
        String str2=input.next();
        String newString=str1.replaceAll(sub_remove,str2);
        System.out.println(newString);
    }
}