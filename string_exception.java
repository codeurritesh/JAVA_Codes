import java.util.Scanner;
import java.lang.*;
class validName extends Exception{
    public validName(String s)
    {
        super(s);
    }
}
public class string_exception {
    public static void main(String[] args) throws validName
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String s=sc.nextLine();


            for(int i=0;i<s.length();i++){
               char c = s.charAt(i);
                try {
                       if (c<='9' && c>='0') {

                           throw new validName("Name contain Integer!");
                       }
                       else
                       {
                           System.out.println("GOOD NAME DEAR!");
                           break;
                       }
                }

        catch (validName obj)
        {

            System.out.println(obj);
            break;


        }}

    }
}
