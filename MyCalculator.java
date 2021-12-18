//MyCalculator_Exception


import java.lang.Math;
import java.util.Scanner;
class Exception1 extends RuntimeException{
    public Exception1(String obj)
    {
        super(obj);
    }
}
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public static void main(String[] args) throws Exception1 {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n=");
        int n = s.nextInt();

        System.out.println("Enter p=");
        int p = s.nextInt();
        try {
            System.out.println(power(n, p));
        } catch (Exception1 e) {
            System.out.println(e);
        }
    }


    public static long power(final int n, final int p) throws Exception1 {

        if (n < 0 || p < 0) {
            throw new Exception1("n or p should not be negative.");
        } else if (n == 0 && p == 0) {

            throw new Exception1("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);

    }
}




