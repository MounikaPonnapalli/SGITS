//36.Generate LCM and GCD
import java.util.Scanner;
public class LcmGcd36 
{
    public static int gcd(int num1,int num2)
    {
        while(num2!=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
    public static int lcm(int num1,int num2)
    {
        return(num1*num2)/gcd(num1,num2);
    }
    public static int gcdMul(int[] num)
    {
        int result=num[0];
        for(int i=1;i<num.length;i++)
        {
            result=gcd(result,num[i]);
        }
        return result;
    }
    public static int lcmMul(int[] num)
    {
        int result=num[0];
        for(int i=1;i<num.length;i++)
        {
            result=lcm(result,num[i]);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no. of elements u want:");
        int num=input.nextInt();
        System.out.println("Enter the elements:");
        int[] a=new int[num];
        for(int i=0;i<num;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("LCM:"+lcmMul(a));
        System.out.println("GCD:"+gcdMul(a));
    }
}

