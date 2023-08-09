//implement round robin sheduling algorithm
import java.util.Scanner;
class Process 
{
    String name;
    int bTime;
    int rTime;
}
public class RoundRobinscheduling
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of processes:");
        int num=input.nextInt();
        System.out.print("Enter the Time Quantum:");
        int tq=input.nextInt();
        Process[] pro=new Process[num];
        for(int i=0;i<num;i++)
        {
            pro[i]=new Process();
            System.out.print("Enter burst time for p"+(i+1));
            pro[i].bTime=input.nextInt();
            pro[i].rTime=pro[i].bTime;
        }
        int cT=0;
        int cpComplete=0;
        while(cpComplete<num)
        {
            for(int i=0;i<num;i++)
            {
                Process currentProcess=pro[i];
                if(currentProcess.rTime>0)
                {
                    int executionTime=Math.min(tq,currentProcess.rTime);
                    System.out.println("Executing process "+(i+1)+"for"+executionTime);
                    cT+=executionTime;
                    currentProcess.rTime-=executionTime;
                    if(currentProcess.rTime==0)
                    {
                        System.out.println("Process"+(i+1)+"is complete");
                        cpComplete++;
                    }
                }
            }
        }
    }
}
