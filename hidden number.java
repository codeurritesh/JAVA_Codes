import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
         if(sum%n==0)
         {
             System.out.print(sum/n);
             
         }
        else
        {
            System.out.print("-1");
        }
        
        
    }
}
