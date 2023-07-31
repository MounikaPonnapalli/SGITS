//7.1 7.2 Convert upper case to lower case && Lower to upper case
import java.util.Scanner;
class StringUpperToLower
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String u want to convert:");
        String str=input.next();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>='A'&&c[i]<='Z')
            {
                c[i]=(char)((int)c[i]+32);
            }
            else
            {
                c[i]=(char)((int)c[i]-32);
            }
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
    }
}