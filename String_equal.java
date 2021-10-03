import java.util.Scanner;
public class String_equal
{
    public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the string 1:");
            String t1=s.nextLine();
            System.out.println("Enter the string 2:");
            String t2=s.nextLine();

            if(t1.equals(t2)){
                System.out.println("The Two Strings are Equal.");
            }else
                System.out.println("The Two Strings are not Equal.");
        }
}