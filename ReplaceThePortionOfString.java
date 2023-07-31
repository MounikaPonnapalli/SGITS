//7.10 Replace a portion of the string.
import java.util.Scanner;
public class ReplaceThePortionOfString
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println("Enter the String you want to remove from that portion:");
        String RemoveString=input.nextLine();
        String newStr=str.replaceAll(RemoveString, "");
        System.out.print("After Replacement String:"+newStr);
    }
}
