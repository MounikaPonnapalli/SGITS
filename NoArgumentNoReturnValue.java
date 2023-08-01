//Illustrate function with no argument and no return values
import java.util.Scanner;
public class NoArgumentNoReturnValue
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();
        System.out.println("Before swapping:");
        System.out.println("number 1= "+num1);
        System.out.println("number 2= "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping:");
        System.out.println("number1="+num1);
        System.out.println("number2="+num2);
    }
}