//11.Delete duplicates in a vector.
import java.util.Scanner;
public class DeleteDuplicatesArray11
{
    static int removeDup(int arr[],int num)
    {
        if(num==0||num==1)
        {
            return num;
        }
        int j=0;
        for(int i=0;i<num-1;i++)
            if(arr[i]!=arr[i+1])
                arr[j++]=arr[i];
            arr[j++]=arr[num-1];
            return j;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the Elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print("Before:");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int r=removeDup(arr,num);
        System.out.print("After:");
        for(int i=0;i<r;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }    
}
