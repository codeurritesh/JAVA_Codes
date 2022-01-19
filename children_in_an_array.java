import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class children_in_an_array{
            public static void main(String args[] ) {
                int n;
                Scanner s=new Scanner(System.in);
                n=s.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=s.nextInt();
                }
                int p=0;
                for(int i=0;i<n-1;i++)
                {
                    for(int j=i+1;j<n;j++)
                    {
                        if(arr[i]<arr[j])
                            p=1;
                        else
                        {
                            p=0;
                            break;
                        }
                            
                    }
                    if(p==1)
                        System.out.print(arr[i]+" ");
                }
                System.out.print(arr[n-1]);
              
            }
        }
