import java.util.Scanner;
public class searching{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int t=0;
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == k)
            {
                t=i;
                flag = 1;
            }
        }
        if(flag==1)
        {
            System.out.println(t);
        }
        else{
            System.out.println("-1");
        }
        
    }
}