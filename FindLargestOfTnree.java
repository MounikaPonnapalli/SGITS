//1.3 Find largest of three numbers
import java.util.Scanner;
public class FindLargestOfTnree
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num1 num2 num3:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        if((num1>num2) && (num1>num3))
        {
            System.out.println(num1);
        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }
    }
}
