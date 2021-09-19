import java.util.Scanner;
public class sum_6and7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s=s+arr[i];
        }
        int s1=0;
        int s2=0;
        int f=0;
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==6)
            {
                f=i;
               continue;
            }
            if(arr[i]==7)
            {
                p=i;
               continue;
            }
        }
        if(p<f){
            System.out.println(s);
        }
        
        else{
            for(int i=f;i<=p;i++)
        {
            s1=s1+arr[i];
        }
        s2=s-s1;
         System.out.println(s2);
        
        }
    }}
        
        
       