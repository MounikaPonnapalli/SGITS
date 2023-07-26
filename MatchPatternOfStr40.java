//40.Match the pattern of the string
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;
public class MatchPatternOfStr40
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String text=input.next();
        System.out.println("Enter the pattern u want to check:");
        String pattern=input.next();
        String[] words=text.split("\\s+");
        Optional<String>matchedWord=Arrays.stream(words)
                .filter(word->Pattern.matches(pattern,word))
                .findFirst();
        if(matchedWord.isPresent()) 
        {
            System.out.println("Pattern found: "+matchedWord.get());
        } 
        else
        {
            System.out.println("Pattern not found.");
        }
    }
}
