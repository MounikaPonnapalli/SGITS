//7.9 Insert substring into a string.
import java.util.Scanner;
public class InsertSubstring
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println("Enter the substring:");
        String subStr=input.nextLine();
        System.out.println("Enter the index to insert a string:");
        int index=input.nextInt();
        String newStr=str.substring(0,index)+subStr+" "+str.substring(index);
        System.out.println("Original String:"+str);
        System.out.println("Substring to Insert:"+subStr);
        System.out.println("Modified String:"+newStr);
    }
}


