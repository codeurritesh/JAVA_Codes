import java.util.Scanner;
public class true_false{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==4|| arr[i]==1)
            {
                f=1;
                continue;
            }
            else{
                f=0;
            }
        }
        if(f==0)
        {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }}
        
       