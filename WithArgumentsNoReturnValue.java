//Illustrate with arguments but no return value
import java.util.Scanner;
public class WithArgumentsNoReturnValue
{
    public static void swap(int num1,int num2)
    {
        System.out.println("Before swapping:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number1:");
        int num1=input.nextInt();
        System.out.print("Enter the number2:");
        int num2=input.nextInt();
        swap(num1,num2);
    }
}

