import java.util.Scanner;

public class array_ques_exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hello[] = new int[a];
        System.out.println("enter array elements");
        for(int i=0;i<a;i++){
            try{
                hello[i] = sc.nextInt();
            }
            catch(NumberFormatException e){
                System.out.println("enter the correct format");
            }
        }
        System.out.println("enter the index:");
        try{
            int b = sc.nextInt();
            System.out.println("the number at index is:"+hello[b]);
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("you have entered wrong index.");
        }



    }
}