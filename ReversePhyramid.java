//Print reverse pyramid
import java.util.Scanner;
public class ReversePhyramid
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines u want:");
        int num=input.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*num-(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

        