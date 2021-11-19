import java.util.Scanner;

public class number_format_exception {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=(s.next());
        int t;

        try
        {
             t=Integer.parseInt(s1);
            System.out.println(t*t);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("Enter valid input");
            System.out.println(obj.toString());
        }
finally {
            System.out.println("completed");
        }

    }
}
