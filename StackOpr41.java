//Illustrate the use of Stack operations
/*import java.util.Stack;
public class StackOpr41 
{   
    public static void main(String[] args) 
    {
        Stack<String> animals= new Stack<>();
        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack:"+animals);
        String element=animals.pop();
        System.out.println("Removed Element:"+element);
        String element1=animals.peek();
        System.out.println("Element at top:"+element1);
        int position=animals.search("Horse");
        System.out.println("Position of Horse: "+position);
        boolean result = animals.empty();
        System.out.println("Is the stack empty? "+result);
    }
}
*/
import java.util.Stack;
import java.util.Scanner;
public class StackOpr41 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        Stack<String>animals=new Stack<>();
        System.out.println("Enter the number of elements to add to the stack:");
        int numElements=input.nextInt();
        input.nextLine();
        System.out.print("Enter element:");
        for (int i=0;i<numElements;i++)
        {
            String element=input.nextLine();
            animals.push(element);
        }
        System.out.println("Stack:"+animals);
        String element=animals.pop();
        System.out.println("Removed Element:"+element);
        String element1=animals.peek();
        System.out.println("Element at top: "+element1);
        int position=animals.search(element);
        System.out.println("Position of Element: "+position);
        boolean result=animals.empty();
        System.out.println("Is the stack empty? "+result);
    }
}

