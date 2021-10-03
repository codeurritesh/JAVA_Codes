import java.util.*;
public class method_array {
    public void change(int ar[],int p )
    {
        ar[0]=5;
    }
public void print_array(int arr[],int n)
{
    for(int var: arr)
    {
        System.out.println(var+" ");
    }
}
}
class method_array_main
{
    public static void main(String[]args)
    {
        method_array obj=new method_array();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Before:");
        obj.print_array(arr,n);
        obj.change(arr,n);
        System.out.println("After:");
        obj.print_array(arr,n);
    }
}
