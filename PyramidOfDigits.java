//Construct Pyramid of Digits
import java.util.Scanner;
public class PyramidOfDigits
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no.of lines u want:");
        int num=input.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int k=num-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
