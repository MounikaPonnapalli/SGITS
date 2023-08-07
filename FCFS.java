//Implement CPU Sheduling algorithm FCFS(First Come First Serve)
import java.util.Scanner;
public class FCFS
{
    public static void main(String[] args) 
    {
       System.out.println("Enter the number of process");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int pid[]=new int[num];
        int bt[]=new int[num];
        int at[]=new int[num];
        int ct[]=new int[num];
        int tat[]=new int[num];
        int wt[]=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter process P"+(i+1)+"arrival time:");
            at[i]=input.nextInt();
            System.out.println("Enter process P"+(i+1)+" brust time:");
            bt[i]=input.nextInt();
            pid[i]=i+1;
        }
        int temp;
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(at[i]>at[j])
                {
                    temp=at[i];
                    at[i]=at[j];
                    at[j]=temp;
                    temp=pid[i];
                    pid[i]=pid[j];
                    pid[j]=temp;
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;
                }
            }
        }
        System.out.println();
        ct[0]=bt[0]+at[0];
        for(int i=1;i<num;i++) 
        {
            ct[i]=ct[i-1]+bt[i];
        }
        for(int i=0;i<num;i++)
        {
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
        }
        System.out.println("Process\t\tAT\t\tBT\t\tCT\t\tTAT\t\tWT");
        for(int i=0;i<num;i++)
        {
            System.out.println(pid[i]+"\t\t"+at[i]+"\t\t"+bt[i]+"\t\t"+ct[i]+"\t\t"+tat[i]+"\t\t"+wt[i]);
        }
        System.out.println("gantt chart:");
        for(int i=0;i<num;i++)
        {
            System.out.print("P"+pid[i]+" ");
        }
    }
}