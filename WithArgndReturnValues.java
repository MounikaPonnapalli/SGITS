//2.3Illustrate function with arguments and return values.
import java.util.Scanner;
public class WithArgndReturnValues 
{
    public static int[] swap(int num1,int num2)
    {
        System.out.println("Before swapping:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        int result[]={num1,num2 };
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=input.nextInt();
        System.out.print("Enter the second number:");
        int num2=input.nextInt();
        swap(num1,num2);
    }
}
