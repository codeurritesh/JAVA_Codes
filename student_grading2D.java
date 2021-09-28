import java.util.*;
public class student_grading2D {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of student:-");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int arr[][] = new int[n][4];
        String arr1[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of "+(i+1)+" student:-");
            arr1[i]=s.next();

        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the marks of "+(i+1)+"student:-");
            for(int j=0;j<4;j++)
            {
                System.out.println( (j+1) +" subject:-");
                arr[i][j]=s.nextInt();
            }
        }
        int total[]=new int[n];
        for(int j=0;j<n;j++)
        {
            for (int i = 0; i < n; i++)
            {
                total[j] += arr[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (total[i] > 50)
                System.out.println(arr1[i] + "-" + "A");
            else
                System.out.println(arr1[i] + "-" + "B");
        }

    }
}
