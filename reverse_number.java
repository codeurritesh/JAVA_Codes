import java.util.*;
public class reverse_number {


    public static void main(String[] args)
    { Scanner s= new Scanner(System.in);
        int number;
        int reverse = 0;
        number=s.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}