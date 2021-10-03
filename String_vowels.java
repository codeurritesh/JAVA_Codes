import java.util.Scanner;

public class String_vowels {
    public void vowels(String t)
    {
       int count=0;
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
        }
        System.out.println("Total number of vowel in the string:"+count);
    }


}
class vowelMain{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String t=s.nextLine();
        String_vowels obj=new String_vowels();
        obj.vowels(t);
    }
}
