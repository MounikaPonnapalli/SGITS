//7.3 Write figures in words using switch statement.
import java.util.Scanner;
public class FigureToWordUsingSwitch 
{
    public static String figureToWord(int fig) 
    {
        switch (fig) 
        {
            case '+':
                return "Addition";
            case '-':
                return "Subtraction";
            case '*':
                return "Multiplication";
            case '/':
                return "Divison";
            case '%':
                return "modules";
            case '^':
                return "power";
            default:
                return "Invalid figure";
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a figure : ");
        char fig=input.next().charAt(0);
        String word=figureToWord(fig);
         System.out.println("The figure in words is:"+word);
    }
}
    
