import java.util.Scanner;
public class TimeConversion 
{
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 12-hour format time(hh:mm:ss AM/PM):");
        String time12Hour=input.nextLine();
        String[] parts=time12Hour.split(" ");
        String timePart=parts[0];
        String amPm=parts[1];
        String[] timeParts=timePart.split(":");
        int hours=Integer.parseInt(timeParts[0]);
        int minutes=Integer.parseInt(timeParts[1]);
        int seconds=Integer.parseInt(timeParts[2]);
        if(amPm.equals("PM")&&hours!=12)
        {
            hours+=12;
        } 
        else if(amPm.equals("AM")&&hours==12)
        {
            hours=0;
        }
        System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
    }
}
