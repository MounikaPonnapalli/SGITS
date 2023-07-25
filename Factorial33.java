//33.find factorial
import java.util.Scanner;
public class Factorial33 
{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number u want:");
    int num=input.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++)   
    {
        fact=fact*i;
    }
    System.out.println("Factorial of Number "+num+"is:"+fact);
    }
}
