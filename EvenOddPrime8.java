//Find if the integer is odd or even or prime or perfect factor
import java.util.Scanner;
public class EvenOddPrime8
{    
    public static boolean isEven(int num)
    {
        return num%2== 0;
    }
    public static boolean isPrime(int num)
   {
        if (num<2)
            return false;
        for (int i=2;i<=Math.sqrt(num);i++)
        {
            if (num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
   {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(isEven(num))
        {
            System.out.println(num+"is Even");
        } 
        else 
        {
            System.out.println(num+"is Odd");
        }
        if(isPrime(num))
        {
            System.out.println(num+"is Prime");
        } 
        else
        {
            System.out.println(num+"is Not Prime");
        }
        System.out.print("Perfect factors of "+num);
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(" "+i+" ");
            }
        }
    }
}



