import java.io.*;
import java.util.*;

public class Change_the_arrangement{

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        String arr[]=new String[n];
        String arr1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next();
        }
        String temp;
        arr1[0]=arr[n-1];
        for(int i=0;i<n-1;i++)
        {
        arr1[i+1]=arr[i];
        }
         for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
