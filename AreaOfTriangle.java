//1.12 Area of Triangle
import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length and breadth");
        int length=input.nextInt();
        int breadth=input.nextInt();
        System.out.println("Area of the triangle:"+(length*breadth)/2);
    } 
}
