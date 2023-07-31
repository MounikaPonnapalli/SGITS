//7.4 count number of vowels,consonants and white spaces
import java.util.Scanner;
public class CountNoOfVowleConsSpaces
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        int vowel=0;
        int consonant=0;
        int whitespace=0;
        for(int i= 0;i<str.length();i++) 
        {
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    vowel++;
                } 
                else
                {
                    consonant++;
                }
            } 
            else if(ch==' ') 
            {
                whitespace++;
            }
        }
        System.out.println("Number of vowels ="+vowel);
        System.out.println("Number of consonants="+consonant);
        System.out.println("Number of white spaces="+whitespace);
    }
}


