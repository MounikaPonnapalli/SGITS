//1.4 Convert binary number to decimal number.
import java.util.Scanner;
public class BinaryToDecimal
{
   public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber=0,i=0;
        long remainder;
        while(num!=0)
        {
            remainder=num%10;
            num/=10;
            decimalNumber+=remainder*Math.pow(2,i);
            ++i;
        }
        return decimalNumber;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the binary number:");
        long num=input.nextLong();
        int decimal=convertBinaryToDecimal(num);
        System.out.println("Binary to Decimal");
        System.out.println(num+"="+decimal);
    }
}
    
