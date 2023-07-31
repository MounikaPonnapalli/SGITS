//7.11 Sort string of names
import java.util.Scanner;
public class SortStringOfNames
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of names:");
        int num=input.nextInt();
        String[] names=new String[num];
        System.out.println("Enter names:");
        for(int i=0;i<num;i++)
        {
            names[i]=input.next();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                if(names[j].compareTo(names[j+1])>0) 
                {
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted names:");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
