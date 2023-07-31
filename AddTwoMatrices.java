//5.1 Add two matrices and subtraction
import java.util.Scanner;
public class AddTwoMatrices
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix:");
        int rows=input.nextInt();
        System.out.println("Enter the number of columns in matrix:");
        int columns=input.nextInt();
        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];
        System.out.println("Enter elements of the first matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix1[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix2[i][j]=input.nextInt();
            }
        }
        int[][] sum=new int[rows][columns];
        int[][] sub=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
                sub[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("Sum of two matrices is:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Subtraction of two matrices is:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++) 
            {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
    }
}
