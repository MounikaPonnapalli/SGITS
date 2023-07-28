//1.2 Convert temperature in centigrade to fahreneit.
import java.util.Scanner;
public class ConverTempCentiToFahreneit
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Temperature in celsius:");
        double Cel=input.nextDouble();
        double fahrenheit=(Cel*1.8)+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
    }
}
