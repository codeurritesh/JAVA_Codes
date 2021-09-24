//palindrome number code
import java.util.Scanner;
public class Palindrome{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s=0;
    int original = n;
     while(n!= 0){
         int r=n%10;
         s=s*10+r;
         n=n/10;
         
     }
     if( s== original){
         System.out.println("It is palindrome");
     }
     else{
         System.out.println("no palindrome");
     }
    
    }
}