import java.util.Scanner;

public class menu_driven_program {
    public static void main(String[] args) {
        int i;
        int x=1;
        int num,check=0;
        Scanner s=new Scanner(System.in);

while(x==1)
{
        System.out.println("Enter your Choice(1,2):");
        System.out.println("1.Prime number");
        System.out.println("2.Factorial");
        System.out.println("3.Fibonacci Series");
        i=s.nextInt();
        System.out.println("Please enter a number-");
        num=s.nextInt();
        switch(i) {
            case 1:
                for (int a = 2; a < num; a++)
                    if (num % a == 0) {
                        check = 1;
                        break;
                    }
                if (check == 1)
                    System.out.println("Not Prime!");
                else
                    System.out.println("Prime Number");
                System.out.println("Press 1 to continue ,Press 0 for Exit:");
                x = s.nextInt();

                break;
            case 2:

                int f = 1;
                while (num > 0) {
                    f = f * num;
                    num--;
                }
                System.out.println("The factorial of a number is " + f);
                System.out.println("Press 1 to continue ,Press 0 for Exit:");
                x = s.nextInt();
                break;
            case 3:
                int n1 = 0, n2 = 1;
                int n3;
                System.out.println(n1);
                System.out.println(n2);
                for (int a = 2; a < num; a++) {
                    n3 = n1 + n2;
                    System.out.println(n3);
                    n1 = n2;
                    n2 = n3;
                }
                System.out.println("Press 1 to continue ,Press 0 for Exit:");
                x = s.nextInt();
                break;


        }
    System.out.println("Thank you for using Menu driven program           EXIT!");



        }
    }
}
