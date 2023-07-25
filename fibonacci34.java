//34.fibonacci series by recursion
import java.util.Scanner;
public class fibonacci34
{
    public static int fibonacci(int num)
    {
        if(num==0)
            return 0;
        else if(num==1)
            return 1;
        else
            return fibonacci(num-1)+fibonacci(num-2);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no. of sequence u want:");
        int num=input.nextInt();
        System.out.print("Fibonacci series: ");
        for (int i=0;i<num;i++)
        {
            System.out.print(fibonacci(i)+",");
        }
    }
}

