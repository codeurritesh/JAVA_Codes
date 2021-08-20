//import java.lang.*;automatically imported (by default),it is a package
public class test {
    public static void main(String[] args) {
        //static becz withot creating any object we can callby using class
       // args: to accept cmd line argument after compiling
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+args[1]);
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+b);
    }

}
